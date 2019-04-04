package com.summer.lexer;

import com.summer.*;

public class Identifier extends Token {

    public Identifier (Tag tag, Symbol s) {
        super(tag);
    }

    @Override
    public String toString() {
        return "Identifier{} ==> " + super.toString();
    }
}
