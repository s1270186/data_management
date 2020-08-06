import java.util.Random;
import java.util.Scanner;

public class Head_or_Tail{
    public static void main(String[] args){
        int Round = 3;
        int numH = 0, numT = 0;
        int x;

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("who are you?\n->");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("Tossing a coin...");

        for(int i = 0; i < Round; i++){
            x = ran.nextInt(2);

            if(x == 0){
                numH++;
                System.out.println("Round " + i + ": Heads");
            } else {
                numT++;
                System.out.println("Round " + i + ": Tails");
            }
        }

        System.out.println("Heads: " + numH + ", Tails: " + numT);

        if(numT > numH){
            System.out.println("You won");
        } else {
            System.out.println("You lost");
        }
    }
}