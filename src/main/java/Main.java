/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        System.out.println("Enter a number! ");
        Scanner input = new Scanner(System.in);

        Integer usersNum = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= usersNum; i++) {
            int startSum = sum;
            sum = sum + i;
            System.out.println(startSum + " + " + i + " = " + sum);
        }

        System.out.println("The sum of your input is " + sum + ".");

    }
}
