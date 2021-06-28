package model;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable {
	private int id;
	private double dist;
	private String userId;
	private Date date;
	
	public Data() {}
	public Data(String userId, double dist) {
		this.id = 0;
		this.date = new Date();
		this.userId = userId;
		this.dist = dist;
	}
	public Data(int id, Date date, String userId, double dist) {
		this.id = id;
		this.date = date;
		this.userId = userId;
		this.dist = dist;
	}
	
	public double getDist() { return dist; }
	public void setDist(double dist) { this.dist = dist; }
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getUserId() { return userId; }
	public void setUserId(String userId) { this.userId = userId; }
	public Date getDate() { return date; }
	public void setDate() { this.date = new Date(); }
}
