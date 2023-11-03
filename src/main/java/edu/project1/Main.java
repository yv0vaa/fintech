package edu.project1;

public final class Main {
    static String[] words = new String[] {"Tinkoff", "Fintech", "Java", "Project", "Test", "Hello"};
    static int tries = 5;
    public static void main(String[] args) {    
        int mistakes = 0;
        //System.out.println("Enter a number of tries");
        String guess = words[Math.max((int) Math.random() * words.length - 1, 0)];
        Gamer gamer = new Gamer(guess);
        //tries = gamer.scanner.nextInt();
        while(mistakes < tries){
            System.out.println("Guess a letter");
            var move = gamer.MakeMove();
            if (move == "WrongEnter"){
                System.out.println("Enter a single charachter, please!");
            } else if (move == "WrongCharacter"){
                System.out.println("Missed, mistake " + ++mistakes + " out of " + tries);
            } else {
                System.out.println("Hit!");
                System.out.println("The word : " + move);
            }
            if (gamer.IsWinner()){
                System.out.println("You won!");
                break;
            }
            if (mistakes == tries){
                System.out.println("You lost!");
                break;
            }
        }
    }
}
