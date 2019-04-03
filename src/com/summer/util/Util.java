package com.summer.util;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Util {

    // read string from file

    public static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static Boolean charIsOperate(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '=' || c == '%'
                || c == '(' || c == ')' || c == '{' || c == '}' || c == '[' ||
                c == ']' || c == ';' || c == ':' || c == ',')
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    public static Boolean stringIsMultiOperate(String s) {
        if (s.equals("++")  || s.equals("--") || s.equals("<=") || s.equals(">=") || s.equals("==")
                || s.equals("!="))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    public static Boolean stringIsKeyword(String s) {
        if (s.equals("int") || s.equals("float") || s.equals("string")
                || s.equals("for") || s.equals("do") || s.equals("while")
                || s.equals("if") || s.equals("else") || s.equals("break")
                || s.equals("continue") || s.equals("return"))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
}
