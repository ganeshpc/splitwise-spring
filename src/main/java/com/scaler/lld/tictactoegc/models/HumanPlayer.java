package com.scaler.lld.tictactoegc.models;

import java.util.Scanner;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class HumanPlayer extends Player {
    private User user;

    @Builder.Default  // To initialize in builder
    private Scanner scanner = new Scanner(System.in);

    public Move makeMove(Board board) {

        System.out.println("Enter row and col");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        return new Move(row, col);
    }
}
