package model;

import java.io.Serializable;

public class Landmark implements Serializable {
	private int id;
	private String name;
	private double dist;
	
	public Landmark() {}
	public Landmark(int id, String name, double dist) {
		this.id = id;
		this.name = name;
		this.dist = dist;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public double getDist() { return dist; }
	public void setDist(double dist) { this.dist = dist; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
