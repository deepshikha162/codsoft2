package Poject;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
    int Max=100;
    int Min=1;
    int Max_attempts = 5;
    int roundsWon=0;
    int roundsPlayed=0;
    int totalAttempts=0;
    boolean playagain;
    Scanner s=new Scanner(System.in);
    System.out.println("Lets play number guess game");
      do {
    	  Random rand=new Random();
    	  int numberToGuess = rand.nextInt(Max-Min+1)+Min;
    	  int attempts = 0 ;
    	  boolean guessedAns=false;
    	  System.out.println(" Think a number between "+Min+"and"+Max+".");
    	  System.out.println("you have "+Max_attempts+" maximum attempts");
    	  
    	  
    	  for(int i=0; i<Max_attempts;i++) {
    		  System.out.println("enter the number");
    		  int guess=s.nextInt();
    		  attempts++;
    		  
    		  
    		  if(guess==numberToGuess) {
    			  System.out.println("congratulation you guess the correct number in"+attempts+"attempts");
    			  guessedAns=true;
    			  roundsWon++;
    			  break;}
    		  
    			  else if(guess<numberToGuess) {
    				   System.out.println("too low");
    			  }
    			 else{
    				   System.out.println("too high");
   			  }}
    		  if(!guessedAns) {
    			  System.out.println("Sorry you have used your all attempts. The correct answer was:"+numberToGuess);
    				  }
    		  roundsPlayed++;
    		  totalAttempts+=attempts;
    	  
    		  
    		  System.out.println("Would you like to playagain?(y/n)");
    		  String response=s.next();
    		   
    		  playagain = response.equalsIgnoreCase("y");
    	  }while(playagain);
    	  
      
    	  System.out.println("Game over");
    	  System.out.println("Rounds played:"+roundsPlayed);
    	  System.out.println("Rounds won:"+roundsWon);
    	  
    	  System.out.println("Total attempts"+totalAttempts);
      }
      }
	
      
	


