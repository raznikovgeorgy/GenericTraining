package com.syncretis.container.abstraction;

import com.syncretis.container.Containered;

public abstract class Container implements Containered {

    private final double mass;

    public Container(double mass) {
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

}
