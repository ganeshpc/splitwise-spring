package com.scaler.lld.tictactoegc;

import com.scaler.lld.tictactoegc.models.Player;
import com.scaler.lld.tictactoegc.models.User;
import com.scaler.lld.tictactoegc.strategies.RandomPlayingStrategy;
import com.scaler.lld.tictactoegc.models.HumanPlayer;
import com.scaler.lld.tictactoegc.models.Symbol;
import com.scaler.lld.tictactoegc.exceptions.InvalidMoveException;
import com.scaler.lld.tictactoegc.models.Bot;
import com.scaler.lld.tictactoegc.models.BotLevel;
import com.scaler.lld.tictactoegc.models.Game;
import com.scaler.lld.tictactoegc.models.GameStatus;

public class TicTacToe {

    public static void main(String[] args) throws InvalidMoveException{
        // create game
        Game game = createGame();

        while (game.getStatus() == GameStatus.IN_PROGESS) {
            Player player = game.getNextPlayer();
            System.out.println("Next move is of the player: " + player.getSymbol());

            game.makeMove();
        }

        if (game.getStatus() == GameStatus.DRAWN) {
            System.out.println("NO winner");
        }

        if (game.getStatus() == GameStatus.WON) {
            System.out.println("winner: " + game.getWinner().getSymbol());
        }
    }

    public static Game createGame() {

        Player human = HumanPlayer.builder()
                .symbol(Symbol.O)
                .user(new User("kap", "kap@ss.com", null))
                .build();

        Player bot = Bot.builder().symbol(Symbol.X).playingStrategy(new RandomPlayingStrategy()).botLevel(BotLevel.EASY).build();

        Game game = Game.builder()
                .withDimension(3, 3)
                .withPlayer(human)
                .withPlayer(bot)
                .build();

        return game;
    }
}
