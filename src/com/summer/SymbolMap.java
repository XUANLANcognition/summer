package com.summer;

import java.util.HashMap;

public class SymbolMap {

    private HashMap<Symbol, Object> map;

    public Object getObject(Symbol symbol) {
        return map.get(symbol);
    }

    public void addSymbol(Symbol symbol, Object object) {
        map.put(symbol, object);
    }

}
