package com.scaler.lld.tictactoegc.strategies;

import java.util.List;
import com.scaler.lld.tictactoegc.models.Board;
import com.scaler.lld.tictactoegc.models.Move;
import com.scaler.lld.tictactoegc.models.Cell;

public class RandomPlayingStrategy implements PlayingStrategy {

    public Move makeMove(Board board) {
        // Find unavailable cells
        List<Cell> availableCells = board.getAvailableCells();

        int n = availableCells.size();
        int randomIndex = ((int) Math.random() * n);

        Cell randomCell = availableCells.get(randomIndex);

        return new Move(randomCell.getRow(), randomCell.getCol());
    }
    
    
}
