package com.ca.mahima.collections;
class B extends A {
	void m1() {
		System.out.println("m1 from class B");
	}

	void m2() {
		System.out.println("m2 from class B");
	}
	
	public static void main(String[] args) {
		A a = new B();
		//a.m2(); //compile time error
		a.m1();
	}
}