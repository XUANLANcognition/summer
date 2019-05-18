package com.summer.util;

import com.summer.lexer.Tag;
import com.summer.lexer.Token;

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
        if (s.equals("++") || s.equals("--") || s.equals("<=") || s.equals(">=") || s.equals("==")
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

    public static Token OperateToken(String s) {
        switch (s) {
            case "(":
                return new Token(Tag.OPEN_BRACE);
            case ")":
                return new Token(Tag.CLOSE_BRACE);
            case "{":
                return new Token(Tag.OPEN_PAREN);
            case "}":
                return new Token(Tag.CLOSE_PAREN);
            case "[":
                return new Token(Tag.OPEN_BRACKET);
            case "]":
                return new Token(Tag.CLOSE_BRACKET);
            case "+":
                return new Token(Tag.ADD);
            case "-":
                return new Token(Tag.MINUS);
            case "*":
                return new Token(Tag.MULTIPLY);
            case "/":
                return new Token(Tag.DIVIDE);
            case "=":
                return new Token(Tag.EQUAL);
            case ";":
                return new Token(Tag.SEMICOLON);
            case ",":
                return new Token(Tag.COMMA);
        }
        return null;
    }
}
