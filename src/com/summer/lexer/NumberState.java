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
        if (this.getTempString().contains(".")) {
            this.getTokenList().add(new Float(Tag.FLOAT, Double.parseDouble(this.getTempString())));
        } else {
            this.getTokenList().add(new Integer(Tag.INTEGER, java.lang.Integer.parseInt(this.getTempString())));
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        if (this.getTempString().contains(".")) {
            this.getTokenList().add(new Float(Tag.FLOAT, Double.parseDouble(this.getTempString())));
        } else {
            this.getTokenList().add(new Integer(Tag.INTEGER, java.lang.Integer.parseInt(this.getTempString())));
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.operateState);
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {
        System.out.println("number\t" + this.context.getTempString());
        if (this.getTempString().contains(".")) {
            this.getTokenList().add(new Float(Tag.FLOAT, Double.parseDouble(this.getTempString())));
        } else {
            this.getTokenList().add(new Integer(Tag.INTEGER, java.lang.Integer.parseInt(this.getTempString())));
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.endState);
    }
}
