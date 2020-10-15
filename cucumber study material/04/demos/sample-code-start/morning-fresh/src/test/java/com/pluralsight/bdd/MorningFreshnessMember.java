package com.pluralsight.bdd;

public class MorningFreshnessMember {
	private String name;
	int eaarnedPoints;
	private PointsCatalog schema;

	public MorningFreshnessMember(String name, PointsCatalog schema) {
		this.name = name;
		this.schema = schema;
	}

	public void orders(Integer amount, String product) {
		eaarnedPoints += schema.getPointsFor(product) * amount;
	}

	public int getPoints() {
		return eaarnedPoints;
	}

}
