import java.util.Scanner;

public class DiceJack{
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Numbers cannhot be greater then 6");
            System.exit(0);
        }else if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Numbers cannot be less than 1.");
            System.exit(0);
        }

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        int sumOfNums = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;

        System.out.println("Dice one: " + roll1);
        System.out.println("Dice two: " + roll2);
        System.out.println("Dice three: " + roll3);
        System.out.println("\nDice sum: " + sumOfRolls + "\nNumber sum: " + sumOfNums);

        if(checkWin(sumOfRolls, sumOfNums)){
            System.out.println("Congrats! You win =)");
        }else{
            System.out.println("Sorry, you lose."); 
        }

        scan.close();
    }

    public static int rollDice(){
        double randomNum = Math.random() * 6;
        randomNum += 1;
        return (int)randomNum;
    }

    public static boolean checkWin(int sumOfRolls, int sumOfNums){
        return (sumOfRolls < sumOfNums && (sumOfNums - sumOfRolls) < 3);
    }

}