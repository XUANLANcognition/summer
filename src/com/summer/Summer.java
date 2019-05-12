package com.summer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.summer.lexer.Token;
import com.summer.util.Util;
import com.summer.lexer.Lexer;

public class Summer {
    public static void main(String[] args) {
        String sourceFileString = "";
        try {
            sourceFileString = Util.readFile("test.sum");
        } catch (IOException e) {
            Logger.getGlobal().info(e.toString());
        }

        SymbolMap symbolMap = new SymbolMap();

        List<Token> tokenList = new ArrayList<Token>();
        Lexer l = new Lexer(sourceFileString, symbolMap);
        tokenList = l.lexering();

        for (Token i : tokenList) {
            System.out.println(i);
        }
    }
}
