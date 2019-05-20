// Everyone comes here to collect!

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

        // Read source file into memory.

        String sourceFileString = "";
        try {
            sourceFileString = Util.readFile("test.sum");
        } catch (IOException e) {
            Logger.getGlobal().info(e.toString());
        }

        // lexer

        SymbolMap symbolMap = new SymbolMap();

        Lexer l = new Lexer(sourceFileString, symbolMap);
        List<Token> tokenList = l.lexering();

        // Print the list of Token.

        for (Token i : tokenList) {
            System.out.println(i);
        }

    }
}
