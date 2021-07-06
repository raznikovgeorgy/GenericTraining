package com.syncretis.resolver;

import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;
import com.syncretis.handler.Handler;

import java.util.Map;

public class ResolverImpl implements  Resolver{
    private Map<Class<? extends Material>, ? extends Handler<? extends Material>> map;

    public ResolverImpl(Map<Class<? extends Material>, Handler<? extends Material>> map) {
        this.map = map;
    }

    public <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container){
        Handler<MATERIAL> handler = (Handler<MATERIAL>) map.get(container.getType());
        return handler;
    };
}