package com.summer.lexer;

public class Token {

    private Tag tag;

    public Token(Tag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tag=" + tag +
                "}\n";
    }
}
