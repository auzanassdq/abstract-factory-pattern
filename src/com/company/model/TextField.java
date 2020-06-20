package com.company.model;

import com.company.interfaces.Component;

public class TextField implements Component {
    @Override
    public void draw() {
        System.out.println("Draw TextField");
    }

    @Override
    public void setAttribute() {

    }
}
