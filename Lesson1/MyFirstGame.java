public class MyFirstGame {
    public static void main(String[] args) {
        int compNumber = 12;
        int playerNumber = 16;
        int gapNumber = playerNumber - compNumber;

        if(gapNumber > 0) {
            while(gapNumber > 0) {
                System.out.println("Your number is higher than Computer number");
                gapNumber--;
            }
        } else if(gapNumber < 0) {
            while(gapNumber < 0) {
                System.out.println("Your number is lower than Computer number");
                gapNumber++;
            }
        } 
        System.out.println("Congratulation! Number guessed. It's " + compNumber);
    }
}