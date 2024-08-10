
import java.util.*;

public class currency_convert_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int curn, key;
        double amount, temp, temp1;
        System.out.println("enter your input currency\n");
        System.out.println("INDIAN RUPEES-->1\nUNITED STATES DOLLAR-->2\nWEST AFRICAN CFA FRANC-->3\n");
        System.out.println("enter your input currency as mention key:-");
        curn = sc.nextInt();
        switch (curn) {
            case 1:
                System.out.println("enter your INDIAN RUPEES amount-->");
                amount = sc.nextInt();
                System.out.println("enter the key into which currency you want to convert :-");
                System.out.println("INDIAN RUPEES-->1\nUNITED STATES DOLLAR-->2\nWEST AFRICAN CFA FRANC-->3\n");

                key = sc.nextInt();
                switch (key) {
                    case 1:
                        System.out.println("INDIAN RUPEES-->INDIAN RUPEES-->" + amount);
                        break;
                    case 2:
                        temp = (1 / 83.93) * amount;
                        System.out.println("INDIAN RUPEES-->UNITED STATES DOLLAR-->" + temp);
                        break;
                    case 3:
                        temp1 = amount * 7.16;
                        System.out.println("INDIAN RUPEES-->MOROCCAN DIRHAM-->" + temp1);
                        break;

                }

            case 2:
                System.out.println("enter UNITED STATES DOLLAR amount-->");
                amount = sc.nextInt();
                System.out.println("enter the key into which currency you want to convert :-");
                System.out.println("INDIAN RUPEES-->1\nUNITED STATES DOLLAR-->2\nWEST AFRICAN CFA FRANC-->3\n");

                key = sc.nextInt();
                switch (key) {
                    case 1:
                        temp = 83.93 * amount;
                        System.out.println("UNITED STATES DOLLAR-->INDIAN RUPEE-->" + temp);
                        break;
                    case 2:
                        temp = (1 / 83.93) * amount;
                        System.out.println("UNITED STATES DOLLAR-->UNITED STATES DOLLAR" + amount);
                        break;
                    case 3:
                        temp1 = amount * 600.70;
                        System.out.println("INDIAN RUPEES-->MOROCCAN DIRHAM-->" + temp1);
                        break;

                }
            case 3:
                System.out.println("WEST AFRICAN CFA FRANC AMOUNT-->");
                amount = sc.nextInt();
                System.out.println("enter the key into which currency you want to convert :-");
                System.out.println("INDIAN RUPEES-->1\nUNITED STATES DOLLAR-->2\nWEST AFRICAN CFA FRANC-->3\n");

                key = sc.nextInt();
                switch (key) {
                    case 1:
                        temp = 0.1395 * amount;
                        System.out.println("WEST AFRICAN CFA FRANC-->INDIAN RUPEE-->" + temp);
                        break;
                    case 2:
                        temp = 0.0017 * amount;
                        System.out.println("WEST AFRICAN CFA FRANC-->UNITED STATES DOLLAR" + temp);
                        break;
                    case 3:

                        System.out.println("INDIAN RUPEES-->MOROCCAN DIRHAM-->" + amount);
                        break;

                }

        }

    }
}
