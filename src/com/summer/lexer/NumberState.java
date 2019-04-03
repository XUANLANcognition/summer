package com.summer.lexer;

public class NumberState extends LexerState {
    @Override
    public void init() {
        // do nothing
    }

    @Override
    public void identifierKeyword() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.indentifierKeywordState);
    }

    @Override
    public void number() {
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void string() {
        // do nothing
    }

    @Override
    public void space() {
        System.out.println("number\t" + this.context.getTempString());
        this.context.setTempString("");
        this.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        System.out.println("number\t" + this.context.getTempString());
        this.context.setTempString("");
        this.context.setLexerState(Context.operateState);
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {
        System.out.println("number\t" + this.context.getTempString());
        this.context.setTempString("");
        this.context.setLexerState(Context.endState);
    }
}
