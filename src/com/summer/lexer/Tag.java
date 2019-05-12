package com.summer.lexer;

public enum Tag {

    // Identifier

    IDENTIFIER,

    // Keyword

    KEYWORD,

    // Operate

    OPERATE,

    ADD, MINUS, MULTIPLY, DIVIDE, EQUAL, SEMICOLON, OPEN_BRACE,
    OPEN_PAREN, OPEN_BRACKET, CLOSE_BRACE, CLOSE_PAREN,
    CLOSE_BRACKET, COMMA,

    // Constant

    FLOAT, INTEGER, STRING,

    // Null

    NULL
}
