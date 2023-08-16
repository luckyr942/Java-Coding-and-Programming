import java.util.Scanner;
public class GuessGame {
    public static void guessingNumberGame(){
        Scanner sc = new Scanner(System.in);

        //Generate the numbers
        int number = 1 + (int)(100*Math.random());

        //Given K trials
        int K = 5;
        int i, guess;
        System.out.println("A number is chosen between "+ "between 1 to 100"+
                              "Guess the number"+ "within 5 trials");

                              //Ierate over 5 trials
                              for( i=0; i<K; i++){
                                System.out.println("Guess the number: ");

                                guess = sc.nextInt();
                                sc.close();

                                //if the number is guessed
                                if(number == guess){
                                    System.out.println("Yeahhh Buddy"+"You have guessed number");
                                    break;
                                }
                                else if(number > guess && i != K-1 ){
                                    System.out.println("The number is "+" Greater than"+guess);
                                }
                                else if(number < guess && i != K-1 ){
                                    System.out.println("The number is "+" Less than "+ guess);
                                }
                              }
                              if( i == K){
                                System.out.println("You have exhausted"+" K trials. ");

                                System.out.println(" The number was "+ number);
                              }
    }
    public static void main(String args[]){
        guessingNumberGame();
    }
}
