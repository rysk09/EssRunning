package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Landmark;

public class GetLandmarkDAO {
	public List<Landmark> findByDist(double dist) {
		List<Landmark> LandmarkList = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(
				"jdbc:h2:tcp://localhost/~/example", "sa", "")) {
			
			String sql = "SELECT ID,NAME,DIST FROM LANDMARK WHERE DIST=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setDouble(1, dist);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				// double dist = rs.getDouble("DIST");
				Landmark landmark = new Landmark(id, name, dist);
				LandmarkList.add(landmark);
				// System.out.println("ID:"+ id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return LandmarkList;
	}
}
