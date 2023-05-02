package com.scaler.lld.tictactoegc.models;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

public class BoardTest {
    
    @Test
    public void testDimensions() {
        Board board = new Board(3, 3);
        List<List<Cell>> cells = board.getCells();

        assertEquals("No of rows should be equal to input", 3, cells.size());
        assertEquals("No of columns should be equal to input", 3, cells.get(0).size());
    }
}
