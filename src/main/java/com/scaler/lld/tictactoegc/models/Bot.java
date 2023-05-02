package com.scaler.lld.tictactoegc.models;

import com.scaler.lld.tictactoegc.strategies.PlayingStrategy;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Bot extends Player {
    private BotLevel botLevel;
    private PlayingStrategy playingStrategy;

    public Move makeMove(Board board) {

        return playingStrategy.makeMove(board);
    }
}
