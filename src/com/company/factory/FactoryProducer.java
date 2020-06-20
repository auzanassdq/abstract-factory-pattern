package com.company.factory;

public class FactoryProducer {
    public static final String COMPONENT = "COMPONENT";
    public static final String TEMPLATE = "TEMPLATE";

    public static AbstractFactory getFactory(String option){
        if (option.equals(COMPONENT)) {
            return new ComponentFactory();
        } else if (option.equals(TEMPLATE)) {
            return new TemplateFactory();
        }

        return null;
    }
}
