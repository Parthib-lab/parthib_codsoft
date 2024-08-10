import java.lang.Math; //TASK 1 CODSOFT
import java.util.*;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, input, i, tem, score = 0, finalscore, count = 0;

        double temp = Math.random();

        double temp1 = temp * 100;
        int temp2 = (int) temp1;

        System.err.println("enter your input:-");
        System.out.println("for limited inpu enter 1 for multiple inputenter 2 :-");
        i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("enter howmany attempt you want:-");
                tem = sc.nextInt();
                score++;
                for (int j = 1; j <= tem; j++) {
                    System.out.println("enter your choosen number:-");
                    number = sc.nextInt();
                    if (number == temp2) {
                        count++;
                        System.out.println(" Hurray .....your number is match with us..");
                        break;

                    } else if (number > temp2) {
                        System.out.println("your number is greater than genarating number");
                    } else {
                        System.out.println("your number is less than generating number");
                    }
                }
                System.out.println("time is over");
                break;
            case 2:
                do {
                    count = 1;
                    System.out.println("enter your gause number:-");
                    number = sc.nextInt();
                    score++;
                    if (number == temp2) {
                        System.out.println("Hurray .....your number match with us..");
                        break;

                    } else if (number > temp2) {
                        System.out.println("your number is greater than genarating number");
                    } else {
                        System.out.println("your number is less than generating number");
                    }

                } while (number >= 0);

        }
        finalscore = 100 - score;
        if (count > 0) {

            System.out.println("your score is " + finalscore);
        } else {
            System.out.println("your score is :-0");
        }

    }

}
