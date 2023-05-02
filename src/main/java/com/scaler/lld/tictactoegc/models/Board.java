package com.scaler.lld.tictactoegc.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> cells;

    public Board(int row, int col) {
        cells = new ArrayList<>();
        for (int i=0; i<row; i++) {
            List<Cell> rowList = new ArrayList<>();
            for (int j=0; j<col; j++) {
                rowList.add(new Cell(i, j));
            }
            cells.add(rowList);
        }
    }

    public List<Cell> getAvailableCells() {
        return cells.stream().flatMap(List::stream).filter(cell -> cell.getSymbol() == null).toList();
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public boolean isEmpty(int row, int col) {
        if (cells.get(row).get(col).getSymbol() == null) {
            return true;
        }

        return false;
    }
}
