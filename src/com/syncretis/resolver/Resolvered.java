package com.syncretis.resolver;

import com.syncretis.container.abstraction.RecyclableMaterialContainer;
import com.syncretis.material.Material;

import com.syncretis.handler.Handler;

public interface Resolvered {
    public <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container);

}