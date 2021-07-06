package com.syncretis.container.container;

import com.syncretis.material.Material;

public class RecyclableMaterialContainer<MATERIAL extends Material> extends Container {
    private final Class<MATERIAL> type;

    public RecyclableMaterialContainer(double mass, Class<MATERIAL> type) {
        super(mass);
        this.type = type;
    }

    public Class<MATERIAL> getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Container type is: " + type.toString();
    }
}