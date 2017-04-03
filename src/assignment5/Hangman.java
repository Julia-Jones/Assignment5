/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //get player 1 or 2
        //int player = 1;
        while (true) {
            //get word from user
            System.out.println("Welcome to Hangman!");
            System.out.println("Player 1 enter in your word. If you want to quit,click enter.");
            //System.out.printf("Player %s, Enter in a word for player %s to guess.", player);
            String word = input.nextLine();
            //quit if you enter 
            if (word.isEmpty()) {
                System.out.println("Bye! Thank you for playing");
                break;
            }
            String word1 = word;
            int lives = 5;
            //convert to lower care
            word = word.toLowerCase();

            //making the word vanish 
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            //replacing letters with "_" 
            word = word.replace("a", "-");
            word = word.replace("b", "-");
            word = word.replace("c", "-");
            word = word.replace("d", "-");
            word = word.replace("e", "-");
            word = word.replace("f", "-");
            word = word.replace("g", "-");
            word = word.replace("h", "-");
            word = word.replace("i", "-");
            word = word.replace("j", "-");
            word = word.replace("k", "-");
            word = word.replace("l", "-");
            word = word.replace("m", "-");
            word = word.replace("n", "-");
            word = word.replace("o", "-");
            word = word.replace("p", "-");
            word = word.replace("q", "-");
            word = word.replace("r", "-");
            word = word.replace("s", "-");
            word = word.replace("t", "-");
            word = word.replace("u", "-");
            word = word.replace("v", "-");
            word = word.replace("w", "-");
            word = word.replace("x", "-");
            word = word.replace("y", "-");
            word = word.replace("x", "-");

            System.out.println(word);

            while (!(word1.equals(word))) {
                System.out.println("Please enter a letter");
                String letter = input.nextLine();
                if (letter.isEmpty()) {
                    System.out.println("Bye! Thank you for playing");
                    System.exit(0);

                }
                boolean mistake = true;
                for (int i = 0; i < word.length(); i++) {
                    if (word1.charAt(i) == letter.charAt(0)) {
                        mistake = false;
                        word = word.substring(0, i) + letter + word.substring(i + 1, word.length());
                    }
                }
                System.out.println(word);
                if (mistake == true) {
                    lives--;
                    System.out.println("You got it wrong and you have " + lives + " lives left.");
                    if (lives == 0) {
                        System.out.println("You have lost.");
                        System.out.println("The word was " + word1 + ".");
                        System.exit(0);
                        break;

                    }
                }
            }
            if (!(lives == 0 && word1 == word)) {
                System.out.println("You Win!Congratulations");

            }

        }
    }
}