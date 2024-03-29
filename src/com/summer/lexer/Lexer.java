package com.summer.lexer;

import com.summer.SymbolMap;
import com.summer.util.*;

import java.util.List;

public class Lexer {

    private String sourceFileString;
    private SymbolMap symbolMap;

    public Lexer(String sourceFileString, SymbolMap symbolMap) {
        this.sourceFileString = sourceFileString;
        this.symbolMap = symbolMap;
    }

    public List<Token> lexering() {

        Context context = new Context();
        context.setLexerState(new InitState());

        for (int i = 0; i < sourceFileString.length(); i++) {

            context.setTempChar(sourceFileString.charAt(i));

            if (Character.isLetter(sourceFileString.charAt(i))) {
                context.identifierKeyword();
            }
            if (Character.isDigit(sourceFileString.charAt(i))) {
                context.number();
            }
            if (sourceFileString.charAt(i) == '\'' || sourceFileString.charAt(i) == '\"') {
                context.string();
            }
            if (sourceFileString.charAt(i) == ' ') {
                context.space();
            }
            if (Util.charIsOperate(sourceFileString.charAt(i))) {
                context.operate();
            }
        }

        context.end();

        return context.getTokenList();
    }

    @Override
    public String toString() {
        return "Lexer{" +
                "\nsourceFileString:\n" + sourceFileString  +
                "\n}";
    }
}
