import java.util.*;

public class taskii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("O--> outstanding");
        System.out.println("E--> excellent");
        System.out.println("A+--> very good");
        System.out.println("A-->GOOD");
        System.out.println("B--> satisfactory");
        System.out.println("C--> Bad");
        int n, sum = 0;
        float avg;
        System.out.println("enter how many subject you have in your class:--");
        n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(" enter how many marks you got in subject " + (i + 1) + " out of 100 in each subject:-");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg = sum / n;
        if (avg >= 90) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- O");

        } else if (avg >= 80 && avg < 90) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- E");

        } else if (avg >= 70 && avg < 80) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- A+");
        } else if (avg >= 60 && avg < 70) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- A");
        } else if (avg >= 50 && avg < 60) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- B");
        } else if (avg >= 40 && avg < 50) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("your grade is :- C");
        } else if (avg < 30) {
            System.out.println("your total score:- " + sum);
            System.out.println("average percentage:- " + avg);
            System.out.println("you are fail....");
        }

    }

}
