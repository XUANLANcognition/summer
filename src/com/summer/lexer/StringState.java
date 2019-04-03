package com.summer.lexer;

import java.util.logging.Logger;

public class StringState extends LexerState {
    @Override
    public void init() {
        // do nothing
    }

    @Override
    public void identifierKeyword() {
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void number() {
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void string() {
        System.out.println("string" + this.context.getTempString());
    }

    @Override
    public void space() {

    }

    @Override
    public void operate() {
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {

    }
}
