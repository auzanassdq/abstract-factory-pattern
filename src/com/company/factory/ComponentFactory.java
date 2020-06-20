package com.company.factory;

import com.company.ComponentCategory;
import com.company.interfaces.Component;
import com.company.interfaces.Template;
import com.company.model.PasswordField;
import com.company.model.TextArea;
import com.company.model.TextField;

public class ComponentFactory extends AbstractFactory{

    @Override
    public Component getComponent(String component) {
        if (component.equals(ComponentCategory.TEXT_FIELD)){
            return new TextField();
        } else if (component.equals(ComponentCategory.TEXT_AREA)) {
            return new TextArea();
        } else if (component.equals(ComponentCategory.PASS_FIELD)) {
            return new PasswordField();
        }
        return null;
    }

    @Override
    public Template getTemplate(String template) {
        return null;
    }
}
