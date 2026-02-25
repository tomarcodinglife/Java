import java.util.Scanner;

class guessingGame{
    int diceRandom;
    // int result;

    public static int randomNum(){
        int diceRandom =(int) ((Math.random() * 6 + 1));
        return diceRandom;
    }

    /*
        if guess number equal to random number get 1 marks.
        if guess number not equal random number get -1 marks

    */


    public static int resultShow (int diceRandom, int userNum){
        
        if (diceRandom == userNum ) {
            return 1;
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to play guessing Game");
        System.out.println("Enter own Number between 1 to 6");

        int userNum = input.nextInt();
        int systemNum = randomNum();

        if (userNum >= 1 && userNum <= 6) {
            int Score = resultShow(systemNum, userNum);
            
            if (Score == 1) {
                System.out.println("You Won");
            }else{
                System.out.println("You Lost");
            }

        }else{
            System.out.println("You guess out of the T&C");
        }

        input.close();
        
        // guessingGame myGame = new guessingGame();
        // System.out.println(myGame.diceRandom);


    }


}