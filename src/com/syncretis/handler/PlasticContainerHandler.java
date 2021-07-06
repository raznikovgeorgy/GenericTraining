package com.syncretis.handler;

import com.syncretis.container.container.ProductContainer;
import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;

public class PlasticContainerHandler<PLASTIC extends Material> extends Handler<PLASTIC> {
    private final double factor;

    public PlasticContainerHandler(double factor) {
        this.factor = factor;
    }

    @Override
    public ProductContainer<PLASTIC> handle(RecyclableMaterialContainer<PLASTIC> container) {
        ProductContainer result = new ProductContainer(container.getMass() * factor, container.getType());
        System.out.println(result.getMass());
        return result;
    }
    @Override
    public String toString() {
        return "compress factor is: " + factor;
    }
}