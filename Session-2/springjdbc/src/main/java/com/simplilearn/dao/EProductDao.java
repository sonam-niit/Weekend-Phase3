package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.EProductEntity;

@Repository
public class EProductDao {

	@Autowired
	private JdbcTemplate template;

	public List<EProductEntity> getAllProducts() {

		return template.query("select * from eproduct", new RowMapper<EProductEntity>() {

			public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProductEntity entity = new EProductEntity();
				entity.setId(rs.getLong(1));
				entity.setName(rs.getString(2));
				entity.setPrice(rs.getBigDecimal(3));
				entity.setDateAdded(rs.getTimestamp(4));

				return entity;
			}

		});
	}

	public EProductEntity getProductById(long id) {

		return template.query("select * from eproduct where id =" + id, new ResultSetExtractor<EProductEntity>() {

			public EProductEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					EProductEntity entity = new EProductEntity();
					entity.setId(rs.getLong(1));
					entity.setName(rs.getString(2));
					entity.setPrice(rs.getBigDecimal(3));
					entity.setDateAdded(rs.getTimestamp(4));

					return entity;
				}
				return null;
			}
		});

	}
	public int updateProduct(EProductEntity entity) {
		
		String sql= "update eproduct set name=?, price=?, date=? where id=?";
		return template.update(sql,entity.getName(),entity.getPrice(),entity.getDateAdded(),entity.getId());
	}
}
