import java.util.Random;

public class Head_or_Tail{
    public static void main(String[] args){
        int Round = 3;
        int numH = 0, numT = 0;
        int x;

        Random ran = new Random();

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
    }
}