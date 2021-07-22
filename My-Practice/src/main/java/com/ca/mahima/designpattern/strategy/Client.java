package com.ca.mahima.designpattern.strategy;

/*
 * Strategy design pattern follows open-close principle of OOPS. This will ensure whenever new strategy is
 * coming into plan we never have to change in existing designed class.
 * */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context(new Strategy1());
        ctx.executeStrategy();

        Context ctx2 = new Context(new Strategy2());
        ctx2.executeStrategy();

    }
}
