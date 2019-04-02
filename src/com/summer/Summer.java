package com.summer;

import java.io.*;
import java.util.logging.Logger;

import com.summer.util.Util;
import com.summer.lexer.Lexer;

public class Summer {
    public static void main(String[] args) {
        String content = "";
        try {
            content = Util.readFile("test.sum");
        } catch (IOException e) {
            Logger.getGlobal().info(e.toString());
        }

        SymbolMap symbolMap = new SymbolMap();

        Lexer l = new Lexer(content);
    }
}
