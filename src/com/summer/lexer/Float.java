package com.summer.lexer;

public class Float extends Token {
    private Double value;

    public Float(Tag tag, Double d) {
        super(tag);
        this.value = d;
    }

    @Override
    public String toString() {
        return "Float{" +
                "value=" + value +
                "}\n";
    }
}
