package database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class MyRowMapper implements RowMapper<RoboticProduct>{

	public RoboticProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new RoboticProduct(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
	}

}
