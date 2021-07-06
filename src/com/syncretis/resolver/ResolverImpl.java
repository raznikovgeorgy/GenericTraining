package com.syncretis.resolver;

import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.material.Material;
import com.syncretis.handler.Handler;

import java.util.Map;

public class ResolverImpl implements  Resolver{
    private Map<Class<? extends Material>, ? extends Handler> map;

    public ResolverImpl(Map<Class<? extends Material>, Handler> map) {
        this.map = map;
    }

    public <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container){
        Handler handler = map.get(container.getType());
        return handler;
    };
}