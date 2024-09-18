package com.obaid.springJDBC_demo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int mark;
    private String name;
    private int ID;

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
