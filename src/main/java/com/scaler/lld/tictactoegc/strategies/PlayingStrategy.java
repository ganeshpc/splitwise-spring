package com.scaler.lld.tictactoegc.strategies;

import com.scaler.lld.tictactoegc.models.Board;
import com.scaler.lld.tictactoegc.models.Move;

public interface PlayingStrategy {
    Move makeMove(Board board);
}
