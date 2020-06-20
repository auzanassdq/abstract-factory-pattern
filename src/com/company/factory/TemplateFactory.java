package com.company.factory;

import com.company.TemplateCategory;
import com.company.interfaces.Component;
import com.company.interfaces.Template;
import com.company.model.*;

public class TemplateFactory extends AbstractFactory {
    @Override
    public Component getComponent(String component) {
        return null;
    }

    @Override
    public Template getTemplate(String template) {
        if (template.equals(TemplateCategory.MOBILE_TEMPLATE)){
            return new MobileTemplate();
        } else if (template.equals(TemplateCategory.RESPONSIVE_TEMPLATE)) {
            return new ResponsiveTemplate();
        } else if (template.equals(TemplateCategory.STATIC_TEMPLATE)) {
            return new StaticTemplate();
        }
        return null;
    }
}
