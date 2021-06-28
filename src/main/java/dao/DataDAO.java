package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Data;

public class DataDAO {
	public List<Data> findByUserId(String userId) {
		List<Data> dataList = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(
				"jdbc:h2:tcp://localhost/~/example", "sa", "")) {
			
			// String sql = "SELECT ID,DATE,USERID,DIST FROM DATA WHERE USERID=\'"+ userId + "\'";
			String sql = "SELECT ID,DATE,USERID,DIST FROM DATA WHERE USERID=? ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, userId);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				Date date = rs.getDate("DATE");
				// String userId = rs.getString("USERID");
				double dist = rs.getDouble("DIST");
				Data data = new Data(id, date, userId, dist);
				dataList.add(data);
				// System.out.println("ID:"+ id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return dataList;
	}
	public boolean create(Data data) {
		try (Connection conn = DriverManager.getConnection(
				"jdbc:h2:tcp://localhost/~/example", "sa", "")) {
			
			String sql = "INSERT INTO DATA(DATE,USERID,DIST) VALUES(?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			// pStmt.setInt(1, data.getId());
			java.sql.Date sqlDate = new java.sql.Date(data.getDate().getTime());
			pStmt.setDate(1, sqlDate);
			pStmt.setString(2, data.getUserId());
			pStmt.setDouble(3, data.getDist());

			int result = pStmt.executeUpdate();
			if(result != 1) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public double sumDistByUserId(String userId) {
		double distTotal = 0;
		try (Connection conn = DriverManager.getConnection(
				"jdbc:h2:tcp://localhost/~/example", "sa", "")) {
			String sql = "SELECT SUM(DIST) AS SUMDIST FROM DATA WHERE USERID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, userId);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				distTotal = rs.getDouble("SUMDIST");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return distTotal;
	}
}
