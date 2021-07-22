package com.ca.mahima.designpattern.strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strat) {
        this.strategy = strat;
    }

    public void executeStrategy() {
        this.strategy.doSomething();
    }

}
