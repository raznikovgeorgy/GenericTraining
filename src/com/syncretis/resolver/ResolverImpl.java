package com.syncretis.resolver;

import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.handler.Handler;
import com.syncretis.material.Material;

import java.util.Map;

public class ResolverImpl implements Resolver {
    private final Map<Class<? extends Material>, Handler<? extends Material>> map;

    public ResolverImpl(Map<Class<? extends Material>, Handler<? extends Material>> map) {
        this.map = map;
    }

    public <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container) {
        return (Handler<MATERIAL>) map.get(container.getType());
    }
}