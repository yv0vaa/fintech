package edu.project1;

import java.util.Scanner;

public class Gamer {
    private String CurrentWord;
    private String GuessWord;
    Scanner scanner = new Scanner(System.in);
    public Gamer(String GuessWord) {
        this.CurrentWord = "*".repeat(GuessWord.length());
        this.GuessWord = GuessWord;
    } 
    public String MakeMove(){
        String enter = scanner.nextLine();
        if (enter.length() > 1){
            return "WrongEnter";
        } 
        Character got = enter.charAt(0);
        for (int i = 0; i < CurrentWord.length(); i++){
            if (got.equals(GuessWord.charAt(i)) && !got.equals('*') && CurrentWord.charAt(i) == '*'){
                CurrentWord.replaceFirst(CurrentWord, got.toString());
                return CurrentWord;
            }
        }
        return "WrongCharacter";
    }
    public boolean IsWinner(){
        return CurrentWord == GuessWord;
    }
}