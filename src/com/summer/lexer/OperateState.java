package com.summer.lexer;

import com.summer.util.Util;

public class OperateState extends LexerState {
    @Override
    public void init() {
        // do nothing
    }

    @Override
    public void identifierKeyword() {
        if (Util.stringIsMultiOperate(this.context.getTempString())) {
            this.getTokenList().add(Util.OperateToken(this.getTempString()));
        } else {
            for (int i = 0; i < this.context.getTempString().length(); i++) {
                this.getTokenList().add(Util.OperateToken(Character.toString(this.getTempString().charAt(i))));
            }
        }
        this.context.setLexerState(Context.indentifierKeywordState);
        this.context.setTempString("");
        this.setTempString(this.getTempString() + this.getTempChar());

    }

    @Override
    public void number() {
        if (Util.stringIsMultiOperate(this.context.getTempString())) {
            this.getTokenList().add(Util.OperateToken(this.getTempString()));
        } else {
            for (int i = 0; i < this.context.getTempString().length(); i++) {
                this.getTokenList().add(Util.OperateToken(Character.toString(this.getTempString().charAt(i))));
            }
        }
        this.context.setLexerState(Context.numberState);
        this.context.setTempString("");
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void string() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.stringState);
    }

    @Override
    public void space() {
        if (Util.stringIsMultiOperate(this.context.getTempString())) {
            this.getTokenList().add(Util.OperateToken(this.getTempString()));
        } else {
            for (int i = 0; i < this.context.getTempString().length(); i++) {
                this.getTokenList().add(Util.OperateToken(Character.toString(this.getTempString().charAt(i))));
            }
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {
        if (Util.stringIsMultiOperate(this.context.getTempString())) {
            this.getTokenList().add(Util.OperateToken(this.getTempString()));
        } else {
            for (int i = 0; i < this.context.getTempString().length(); i++) {
                this.getTokenList().add(Util.OperateToken(Character.toString(this.getTempString().charAt(i))));
            }
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.endState);
    }
}
