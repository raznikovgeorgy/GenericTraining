package com.syncretis.container.abstraction;

import com.syncretis.material.Material;
import com.syncretis.container.Containered;

public class RecyclableMaterialContainer <MATERIAL extends Material> extends Container implements Containered {

    private final Class<MATERIAL> type;

    public RecyclableMaterialContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType() {
        return type;
    }

}