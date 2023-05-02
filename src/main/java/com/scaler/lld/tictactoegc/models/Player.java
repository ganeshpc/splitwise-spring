package com.scaler.lld.tictactoegc.models;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class Player {
    private Symbol symbol;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract Move makeMove(Board board);
}
