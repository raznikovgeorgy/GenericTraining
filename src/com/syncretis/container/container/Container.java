package com.syncretis.container.container;

public abstract class Container {

    private final double mass;

    public Container(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }
}