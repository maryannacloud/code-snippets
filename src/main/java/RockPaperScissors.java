import java.util.Random;
import java.util.Scanner;

/*
TASK: create the Rock, Paper, Scissors game between the User and the Computer
 */

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int userResponse = 0;
        int again = 0;

        Random r = new Random();
        int low = 1;
        int high = 3;

        int computerInput = r.nextInt((high - low) + 1 ) + low;
        do {
            System.out.println("Select 1 to throw rock, 2 to throw paper, or 3 to throw scissors:");
            userResponse = sc.nextInt();
            System.out.println(paperRockScissors(userResponse, computerInput));
            System.out.println("Press 1 to play again; any other number to quit:");
            again = sc.nextInt();
//          String decoy = sc.nextLine();
        }while(again == 1);
    }

    public static String paperRockScissors(int userResp, int computerResp){
        String result = "";
        if(userResp == 1 && computerResp == 3){
            result = "Rock beats scissors; you win!";
        }else if(userResp == 1 && computerResp == 2){
            result = "Paper beats rock; you lose.";
        }else if(userResp == 2 && computerResp == 1){
            result = "Paper beats rock; you win!";
        }else if(userResp == 2 && computerResp == 3){
            result = "Scissors beats paper; you lose.";
        }else if(userResp == 3 && computerResp == 1){
            result = "Rock beats scissors; you lose.";
        }else if(userResp == 3 && computerResp == 2){
            result = "Scissors beats paper; you win!";
        }else if(userResp == computerResp) {
            result = "Tie; throw again.";
        }
        String cpu = String.valueOf(computerResp);
        return result;
    }

}
