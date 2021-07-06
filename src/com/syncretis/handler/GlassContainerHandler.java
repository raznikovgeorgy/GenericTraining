package com.syncretis.handler;

import com.syncretis.container.container.ProductContainer;
import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Glass;

public class GlassContainerHandler<GLASS extends Glass> extends Handler<GLASS> {
    private final double factor;

    public GlassContainerHandler(double factor) {
        this.factor = factor;
    }

    @Override
    public ProductContainer<GLASS> handle(RecyclableMaterialContainer<GLASS> container) {
        ProductContainer result = new ProductContainer(container.getMass() * factor, container.getType());
        System.out.println(result.getMass());
        return result;
    }

    @Override
    public String toString() {
        return "compress factor is: " + factor;
    }
}