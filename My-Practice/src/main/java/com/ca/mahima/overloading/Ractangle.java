package com.ca.mahima.overloading;

public class Ractangle {

	public int area(int l, int w) {
		return l * w;

	}
}

class Square extends Ractangle {

	public int area (int l, int w) {
		return (int) Math.pow(l, 2);
	}
	
}




