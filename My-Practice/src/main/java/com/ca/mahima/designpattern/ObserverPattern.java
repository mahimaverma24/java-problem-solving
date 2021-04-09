package com.ca.mahima.designpattern;

public class ObserverPattern {

	private Integer score;
	private Integer wicket;

	public Integer getScore() {
		return 50;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getWicket() {
		return 2;
	}

	public void setWicket(Integer wicket) {
		this.wicket = wicket;
	}

	public void updateFields() {
		this.score = getScore();
		this.wicket = getWicket();

		displayLatestData(score, wicket);

	}

	public void displayLatestData(Integer score, Integer wicket) {

		System.out.print("Latest score is: " + score + " and wickets: " + wicket);
	}
}
