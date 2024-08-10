import java.util.*;

abstract class account {
    int temp;

    void sufbal(int v) {
        temp = v;

    }

    public void accountbalance() {
        System.out.println("your sufficient balance is :-" + temp);

    }

    public void updatebal(int x) {
        if (temp < x) {
            System.out.println("you have no sufficient balance");

        } else {
            if (temp - x >= 100) {
                System.out.println("you have successfully withdrawl:-" + x);
                temp = temp - x;
            } else {
                System.out.println(" ........you should maintain minimum balance......... ");
                System.out.println("Available balance is:-" + temp);
                System.out.println("you maximum withdrawl amount:-" + (temp - 100));
            }
        }
    }

    public void depot(int x) {
        temp = temp + x;
        System.out.println("your account has beendebited by" + x);
        System.out.println("Available balance is:-" + temp);
    }

}

class atm extends account {
    public void withdraw(int amount) {
        super.updatebal(amount);

    }

    public void deposit(int amount) {

    }

    public void checkBalance() {
        super.accountbalance();

    }

    public void addbal(int x) {
        super.sufbal(x);
    }

    public void deposi(int p) {
        super.depot(p);

    }
}

public class atm_interface_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin, b, key, wit, repin, n, repin1, depo, otp;
        double temps = Math.random();

        double temp1 = temps * 1000;
        int temp2 = (int) temp1;
        boolean con;

        System.out.println("               .......welcome to -CANARA BANK INDIA........");
        System.out.println("enter your account pin:-");
        pin = sc.nextInt();
        System.out.println("               ........Your account is successfully open..........");

        atm objb = new atm();
        // System.out.print("enter your deposit balance:-");
        // b = sc.nextInt();
        b = 500;
        objb.addbal(b);

        System.out.println("your sufficient balance is :-" + b);
        for (int j = 1; j <= 100; j++) {
            System.out.println("enter your pin again for security:-");
            repin = sc.nextInt();
            if (pin == repin) {
                System.out.println("enter how many transaction you will do:-");
                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print("\ncheck balance->1\ndeposit->2\nwithdrawl->3\npin change->4\n");
                    key = sc.nextInt();

                    switch (key) {
                        case 1:
                            objb.checkBalance();
                            break;
                        case 2:
                            System.out.println("enter deposit balance:-");
                            depo = sc.nextInt();
                            objb.deposi(depo);
                            break;

                        case 3:
                            System.out.print("enter your withdrawl amount:-");
                            wit = sc.nextInt();
                            System.out.println("enter your pin:-");
                            repin1 = sc.nextInt();
                            if (pin == repin1) {
                                objb.withdraw(wit);
                            } else {
                                System.out.println(
                                        "         .......warning............        \nyour pin is wrong enter your pin");
                            }
                            break;
                        case 4:
                            System.out.println(
                                    "your otp is " + temp2 + " dont share this with others -CANARA BANK INDIA");
                            System.out.println("enter otp which is send to your mobile:-");
                            otp = sc.nextInt();
                            if (temp2 == otp) {
                                System.out.println("...otp match...");
                                System.out.println("enter your new pin:-");
                                pin = sc.nextInt();
                                repin = pin;
                                repin1 = pin;
                                System.out.println("your password successfully changed -CANARA BANK INDIA");
                            }
                        default:
                            System.out.println("enter valid input");
                    }
                }
            } else {
                System.out.println(
                        "                .....warning.....             \nyour pin is wrong please enter your card again");
            }
        }
    }
}
