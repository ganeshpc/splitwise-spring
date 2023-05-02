package com.scaler.lld.tictactoegc.models;

import java.util.List;

import com.scaler.lld.tictactoegc.exceptions.InvalidMoveException;

import java.util.ArrayList;

public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private int nextPlayerIndex = 0;
    private GameStatus status;
    public GameStatus getStatus() {
        return status;
    }

    private Player winner;

    public void makeMove() throws InvalidMoveException {
        Player nextPlayer = getNextPlayer(); 

        Move move = nextPlayer.makeMove(this.board);

        if (!board.isEmpty(move.getX(), move.getY())) {
            throw new InvalidMoveException("Invalid move");
        }


        // update the board
        board.getCells().get(move.getX()).get(move.getY()).setSymbol(nextPlayer.getSymbol());

        if (checkWinner(nextPlayer.getSymbol())) {
            status = GameStatus.WON;
            winner = nextPlayer;
            return;
        }

        if (checkDraw()) {
            status = GameStatus.DRAWN;
        }

        nextPlayerIndex = (nextPlayerIndex + 1) % players.size();
    }

    private boolean checkDraw() {
        return false;
    }

    public Player getNextPlayer() {
        return players.get(nextPlayerIndex); 
    }

    public boolean checkWinner(Symbol symbol) {
        return false;
    }

    public void registerPlayer() {

    }

    public static Builder builder() {
        return new Builder();
    }

    // static builde class
    public static class Builder {

        // Add reference to outer class
        private Game game;

        public Builder() {
            this.game = new Game();
            this.game.status = GameStatus.IN_PROGESS;
        }

        public Builder withDimension(int row, int col) {
            this.game.board = new Board(row, col);
            return this;
        }

        public Builder withPlayer(Player player) {
            this.game.players.add(player);
            return this;
        }

        public Builder withPlayers(List<Player> players) {
            this.game.players = players;
            return this;
        }

        public Game build() {
            boolean isValid = validate();

            if (!isValid) {
                throw new RuntimeException("Invalid game");
            }

            return game;
        }

        private boolean validate() {

            if (this.game.board == null || this.game.players == null) {
                return false;
            }

            if (game.players.size() < 2)
                return false;

            return true;
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
