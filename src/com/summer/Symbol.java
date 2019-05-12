package com.summer;

public class Symbol {
    private int index;
    private String name;

    public Symbol(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
