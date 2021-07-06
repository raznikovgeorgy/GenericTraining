package com.syncretis.handler;

import com.syncretis.container.container.ProductContainer;
import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;
import com.syncretis.material.Paper;

public class PaperContainerHandler<PAPER extends Paper> extends Handler<PAPER> {
    private final double factor;

    public PaperContainerHandler(double factor) {
        this.factor = factor;
    }

    @Override
    public ProductContainer<PAPER> handle(RecyclableMaterialContainer<PAPER> container) {
        ProductContainer result = new ProductContainer(container.getMass() * factor, container.getType());
        System.out.println(result.getMass());
        return result;
    }

    @Override
    public String toString() {
        return "compress factor is: " + factor;
    }
}