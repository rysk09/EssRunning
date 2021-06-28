package model;

import java.io.Serializable;

public class Input implements Serializable {
	private double weight, kcal, dist, totalDist, landmarkDist;
	private String landmark;

	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }
	public double getKcal() { return kcal; }
	public void setKcal(double kcal) { this.kcal = kcal; }
	public double getDist() { return dist; }
	public void setDist(double dist) { this.dist = dist; }
	public double getTotalDist() { return totalDist; }
	public void setTotalDist(double totalDist) { this.totalDist = totalDist; }
	public double getLandmarkDist() { return landmarkDist; }
	public void setLandmarkDist(double landmarkDist) { this.landmarkDist = landmarkDist; }
	public String getLandmark() { return landmark; }
	public void setLandmark(String landmark) { this.landmark = landmark; }
}
