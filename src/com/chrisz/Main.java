package com.chrisz;

public class Main {

    public static void main(String[] args) {
        // only typed true, 800, 5 and 100, rest was auto-completed
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScore = calculateScoreWithReturn(true, 1800, 2, 80);
        System.out.println("your final score was " + highScore);

        // **** Challenge ****
        displayHighScorePosition("Mike", 500);
        displayHighScorePosition("Chris", 800);
        displayHighScorePosition("Dave", 8500);
    }

    // *************** METHODS/PROCEDURE RETURNING NOTHING *****************
    // void means don't return anything, methods that don't return anything can also be called PROCEDURE
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    // *************** METHODS RETURNING INTEGER *****************
    // have to return something, even when the if statement doesn't execute
    public static int calculateScoreWithReturn(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1; //Java convention to return -1 if error occurs
    }

    // *** Challenge ***
    public static void displayHighScorePosition(String name, int score) {
        int position = calculateHighScorePosition(score);
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
//        if(score >= 1000) {
//            return 1;
//        } else if(score >= 500) {
//            return 2;
//        } else if(score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
