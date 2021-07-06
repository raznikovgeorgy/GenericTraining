package com.syncretis.handler;

import com.syncretis.container.container.ProductContainer;
import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;

public abstract class Handler<MATERIAL extends Material> {
    public abstract ProductContainer<MATERIAL> handle(RecyclableMaterialContainer<MATERIAL> container);
}
