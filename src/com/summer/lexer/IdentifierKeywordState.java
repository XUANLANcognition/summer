package com.summer.lexer;

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
            System.out.print("keyword\t");
            System.out.println(this.context.getTempString());
        }
        else {
            System.out.print("identifier\t");
            System.out.println(this.context.getTempString());
        }
        this.context.setTempString("");
        this.context.setLexerState(Context.spaceState);
    }

    @Override
    public void operate() {
        if (Util.stringIsKeyword(this.context.getTempString())) {
            System.out.print("keyword\t");
            System.out.println(this.context.getTempString());
        }
        else {
            System.out.print("identifier\t");
            System.out.println(this.context.getTempString());
        }
        this.context.setLexerState(Context.operateState);
        this.context.setTempString("");
        this.setTempString(this.getTempString() + this.getTempChar());
    }

    @Override
    public void end() {
        if (Util.stringIsKeyword(this.context.getTempString())) {
            System.out.print("keyword\t");
            System.out.println(this.context.getTempString());
        }
        else {
            System.out.print("identifier\t");
            System.out.println(this.context.getTempString());
        }
        this.setTempString("");
        this.context.setLexerState(Context.endState);
    }
}
