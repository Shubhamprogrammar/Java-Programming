// Guess the number game

import java.util.Random;
import java.util.Scanner;

class Game{
    private int noofguesses=0;
    private int number;
    private int rand_int;
    Scanner sc = new Scanner(System.in);

    public Game(){
        Random rand = new Random();
        this.rand_int = rand.nextInt(101);
    }
    public void takeUserInput(){
        System.out.println("Enter a number for Guessing(1-100):");
        number = sc.nextInt();
    }
    public boolean isCorrectNumber(){
        if (number==rand_int) {
            System.out.println("You Guessed correctly!!!");
            noofguesses +=1;
            return true;
        } 
        else if(number>rand_int){
            System.out.println("Your number is larger than the guessing number");
            noofguesses +=1;
            return false;
        }
        else {
            System.out.println("Your number is less than the guessing number");
            noofguesses +=1;
            return false;
        }
    }
    
    public void getnoofgueses(){
        System.out.println("Your guessed the number in "+noofguesses+" attempts");
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game of Number of Guessing");
        Game gm = new Game();
        boolean playGame =true;
        while(playGame){
        gm.takeUserInput();
        boolean bool = gm.isCorrectNumber();
        if (bool==true) {
            gm.getnoofgueses();
            break;
        } else {
            playGame=true;
        }
        }       
    }
}
