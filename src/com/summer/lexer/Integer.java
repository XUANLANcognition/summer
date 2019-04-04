package com.summer.lexer;

public class Integer extends Number {
    private int value;

    public Integer(Tag tag, int i) {
        super(tag);
        this.value = i;
    }

    @Override
    public String toString() {
        return "Integer{" +
                "value=" + value +
                "}\n";
    }
}
