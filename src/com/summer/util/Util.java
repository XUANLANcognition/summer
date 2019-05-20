package com.summer.util;

import com.summer.lexer.Token;
import com.summer.lexer.Type;
import com.summer.lexer.Word;

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
        if (s.equals("int") ||
                s.equals("float") ||
                s.equals("string") ||
                s.equals("for") ||
                s.equals("do") ||
                s.equals("while") ||
                s.equals("if") ||
                s.equals("else") ||
                s.equals("break") ||
                s.equals("continue") ||
                s.equals("return") ||
                s.equals("bool"))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    public static Token OperateToken(String s) {
        switch (s) {
            case "(":
                return Word.openBrace;
            case ")":
                return Word.closeBrace;
            case "{":
                return Word.openParen;
            case "}":
                return Word.closeParen;
            case "[":
                return Word.openBracket;
            case "]":
                return Word.closeBracket;
            case "+":
                return Word.and;
            case "-":
                return Word.minus;
            case "*":
                return Word.multiply;
            case "/":
                return Word.divide;
            case "=":
                return Word.equal;
            case ";":
                return Word.semicolon;
            case ",":
                return Word.comma;
        }
        return null;
    }

    public static Token keyWordToken(String s) {
        switch (s) {
            case "int":
                return Type.rInt;
            case "float":
                return Type.rFloat;
            case "bool":
                return Type.rBool;
            case  "for":
                return Word.rFor;
            case "if":
                return Word.rIf;
            case  "while":
                return Word.rWhile;
        }
        return null;
    }
}
