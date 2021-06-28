package model;

import java.io.Serializable;

public class Input implements Serializable {
	private double weight, kcal, dist;

	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }
	public double getKcal() { return kcal; }
	public void setKcal(double kcal) { this.kcal = kcal; }
	public double getDist() { return dist; }
	public void setDist(double dist) { this.dist = dist; }
}
