package com.syncretis.resolver;

import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.handler.Handler;
import com.syncretis.material.Material;

public interface Resolver {
    public abstract <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container);
}
