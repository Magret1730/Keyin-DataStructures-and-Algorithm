package org.codewithmagret;

import java.util.Locale;

public class Animal {
    public String type;
    public String name;
    public int order;

    public Animal(String type, String name, int order) {
        this.type = type.toLowerCase();
        this.name = name;
        this.order = order;
    }
}
