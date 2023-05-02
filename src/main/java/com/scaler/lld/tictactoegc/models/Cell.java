package com.scaler.lld.tictactoegc.models;

public class Cell {
    private Integer row;
    private Integer col;
    private Symbol symbol;

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Cell(int row, int col, Symbol symbol) {
        this.row = row;
        this.col = col;
        this.symbol = symbol;
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getCol() {
        return col;
    }
}
