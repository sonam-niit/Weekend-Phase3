package com.simplilearn.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class CustomAuthenticationProvider implements AuthenticationProvider{

	List<User> dummyUsers= new ArrayList<User>();
	
	public CustomAuthenticationProvider() {
		dummyUsers.add(new User("sonam", "secret", "ROLE_USER"));
		dummyUsers.add(new User("admin", "admin123", "ROLE_ADMIN"));
	}
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		
		String name= authentication.getName();
		String pass= authentication.getCredentials().toString();
		
		Optional<User> authenticatedUser= dummyUsers.stream().
				filter(user -> user.getName().equals(name) &&
						user.getPassword().equals(pass)).findFirst();
		
		if(!authenticatedUser.isPresent())
			throw new BadCredentialsException("Not a valid USer");
		
		List<GrantedAuthority> authorities= new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(authenticatedUser.get().getRole()));
		Authentication auth= new UsernamePasswordAuthenticationToken(name, pass,authorities);
		return auth;
	}

	@Override
	public boolean supports(Class<?> aClass) {
		return aClass.equals(UsernamePasswordAuthenticationToken.class);
	}

}
