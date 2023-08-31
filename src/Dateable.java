import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("PLease enter your age:");
        int age = scanner1.nextInt();
        System.out.println(age);
        int cal1 = age/2;
        int cal2 = cal1+7;
        String result = age+"-years old should date somebody who is at least "+cal2+"years old.";
        System.out.println(result);
    }
}
