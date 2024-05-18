package Java_Playlist_program;
import java.util.Random;
import java.util.Scanner;

public class RPS_game {
        public static void main(String[] args) {
            // 0 for Stone
            // 1 for Paper
            // 2 for Scissor

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 0 for Stone, 1 for Paper, 2 for Scissor ");
            int userInput = sc.nextInt();

            Random rand = new Random();
            int computerInput = rand.nextInt(3);

            if (userInput == computerInput) {
                System.out.println("Draw");
            }
            else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                    || userInput == 2 && computerInput == 1) {
                    System.out.println("You Win!");
            }
                else {
                    System.out.println("Computer Win!");
            }

            if(computerInput==0){
                System.out.println("Computer choice: Stone");
            }
            else if(computerInput==1){
                    System.out.println("Computer choice: Paper");
            }
            else if(computerInput==2){
                    System.out.println("Computer choice: Scissors");
            }
        }
}
