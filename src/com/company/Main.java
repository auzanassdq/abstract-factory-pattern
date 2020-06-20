package com.company;

import com.company.factory.AbstractFactory;
import com.company.factory.ComponentFactory;
import com.company.factory.FactoryProducer;
import com.company.interfaces.Component;

public class Main {

    public static void main(String[] args) {
        AbstractFactory componentFactory = FactoryProducer.getFactory(FactoryProducer.COMPONENT);
        Component txtField = componentFactory.getComponent(ComponentCategory.TEXT_FIELD);
        txtField.draw();
    }
}
