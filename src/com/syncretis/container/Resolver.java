package com.syncretis.container;

import com.syncretis.container.abstraction.RecyclableMaterialContainer;
import com.syncretis.material.Material;
import com.syncretis.handler.Handler;

public abstract class Resolver {

    public abstract <MATERIAL extends Material> Handler<MATERIAL> resolve(RecyclableMaterialContainer<MATERIAL> container);

}
