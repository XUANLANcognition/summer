package com.summer.lexer;

import com.summer.Symbol;
import com.summer.util.Util;

import java.util.logging.Logger;

public class IdentifierKeywordState extends LexerState {
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
        Logger.getGlobal().info("Error");
    }

    @Override
    public void space() {
        if (Util.stringIsKeyword(this.context.getTempString())) {
            this.getTokenList().add(new Token(Tag.KEYWORD));
        } else {
            this.getTokenList().add(new Identifier(Tag.IDENTIFIER, new Symbol(1, this.getTempString()), this.context.getTempString()));
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        if (Util.stringIsKeyword(this.context.getTempString())) {
            this.getTokenList().add(new Token(Tag.KEYWORD));
        } else {
            this.getTokenList().add(new Identifier(Tag.IDENTIFIER, new Symbol(1, this.getTempString()), this.context.getTempString()));
        }
        this.context.setLexerState(Context.operateState);
        this.context.setTempString("");
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {
        if (Util.stringIsKeyword(this.context.getTempString())) {
            this.getTokenList().add(new Token(Tag.KEYWORD));
        } else {
            this.getTokenList().add(new Identifier(Tag.IDENTIFIER, new Symbol(1, this.getTempString()), this.context.getTempString()));
        }
        this.setTempString("");
        this.context.setLexerState(Context.endState);
    }
}
