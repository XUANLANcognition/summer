package com.summer.lexer;

public class Context {
    public final static InitState initState = new InitState();
    public final static IdentifierKeywordState indentifierKeywordState = new IdentifierKeywordState();
    public final static NumberState numberState = new NumberState();
    public final static StringState stringState = new StringState();
    public final static SpaceState spaceState = new SpaceState();
    public final static OperateState operateState = new OperateState();
    public final static EndState endState = new EndState();

    private LexerState lexerState;

    public LexerState getLexerState() {
        return lexerState;
    }

    public void setLexerState(LexerState lexerState) {
        this.lexerState = lexerState;

        this.lexerState.setContext(this);
    }

    public void init() {
        this.lexerState.init();
    };

    public void identifierKeyword() {
        this.lexerState.identifierKeyword();
    };

    public void number() {
        this.lexerState.number();
    };

    public void string() {
        this.lexerState.string();
    };

    public void space() {
        this.lexerState.space();
    };

    public void operate() {
        this.lexerState.operate();
    };

    public void end() {
        this.lexerState.end();
    };
}
