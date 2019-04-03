package com.summer.lexer;

public class InitState extends LexerState {
    @Override
    public void init() {
        // do nothing
    }

    @Override
    public void identifierKeyword() {
        this.setTempString(this.getTempString() + this.getTempChar());
        super.context.setLexerState(Context.indentifierKeywordState);
    }

    @Override
    public void number() {
        this.setTempString(this.getTempString() + this.getTempChar());
        super.context.setLexerState(Context.numberState);
    }

    @Override
    public void string() {
        this.setTempString(this.getTempString() + this.getTempChar());
        super.context.setLexerState(Context.stringState);
    }

    @Override
    public void space() {
        super.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        this.setTempString(this.getTempString() + this.getTempChar());
        super.context.setLexerState(Context.operateState);
    }

    @Override
    public void end() {
        super.context.setLexerState(Context.endState);
    }
}
