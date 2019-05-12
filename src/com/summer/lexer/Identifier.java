package com.summer.lexer;

import com.summer.*;

public class Identifier extends Token {

    String id;

    public Identifier(Tag tag, Symbol s, String id) {
        super(tag);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " : " + id;
    }
}
