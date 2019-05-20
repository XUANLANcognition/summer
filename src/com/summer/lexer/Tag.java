package com.summer.lexer;

public enum Tag {

    // Word

    IDENTIFIER,

    // Keyword

    FOR, IF, WHILE, BASIC,

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
