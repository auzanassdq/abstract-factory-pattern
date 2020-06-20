package com.company.factory;

import com.company.interfaces.Component;
import com.company.interfaces.Template;

public abstract class AbstractFactory {
    public abstract Component getComponent(String component);
    public abstract Template getTemplate(String template);
}
