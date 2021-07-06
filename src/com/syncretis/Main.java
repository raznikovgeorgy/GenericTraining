package com.syncretis;

import com.syncretis.container.container.ProductContainer;
import com.syncretis.container.container.RecyclableMaterialContainer;
import com.syncretis.handler.GlassContainerHandler;
import com.syncretis.handler.Handler;
import com.syncretis.handler.PaperContainerHandler;
import com.syncretis.handler.PlasticContainerHandler;
import com.syncretis.material.Glass;
import com.syncretis.material.Material;
import com.syncretis.material.Paper;
import com.syncretis.material.Plastic;
import com.syncretis.resolver.ResolverImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        RecyclableMaterialContainer<Glass> glassContainer = new RecyclableMaterialContainer(228, Glass.class);
        RecyclableMaterialContainer<Plastic> plasticContainer = new RecyclableMaterialContainer(322, Plastic.class);
        RecyclableMaterialContainer<Paper> paperContainer = new RecyclableMaterialContainer(777, Paper.class);

        ArrayList<RecyclableMaterialContainer<? extends Material>> list = new ArrayList<>();
        list.add(glassContainer);
        list.add(plasticContainer);
        list.add(paperContainer);
        for (int i = 0; i < list.size(); ++i) {
            System.out.println("Index is: " + i);
            System.out.println("Class is: " + list.get(i).getType());
            System.out.println("Container mass is: " + list.get(i).getMass());
        }
        System.out.println("******************");

        Handler glassHandler = new GlassContainerHandler(0.5);
        Handler plasticHandler = new PlasticContainerHandler(0.4);
        Handler paperHandler = new PaperContainerHandler(0.33);

        Map<Class<? extends Material>, Handler> materialHandlerMap = new HashMap<>();
        materialHandlerMap.put(Glass.class, glassHandler);
        materialHandlerMap.put(Plastic.class, plasticHandler);
        materialHandlerMap.put(Paper.class, paperHandler);
        System.out.println(materialHandlerMap);

        ArrayList<ProductContainer<? extends Material>> outputList = new ArrayList<>();

        ResolverImpl resolver = new ResolverImpl(materialHandlerMap);
        for (RecyclableMaterialContainer rmc : list) {
            outputList.add(resolver.resolve(rmc).handle(rmc));
        }
        System.out.println("**********");
        for (int i = 0; i < outputList.size(); ++i) {
            System.out.println("Index is: " + i);
            System.out.println("Class is: " + outputList.get(i).getType());
            System.out.println("Container mass is: " + outputList.get(i).getMass());
        }
    }
}

