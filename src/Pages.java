import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("PLease enter your age:");
        int Age = scanner1.nextInt();
        System.out.println(Age);
        int result = 100 - Age;
        String Output = Age+"-years old should read at least "+result+" pages before giving up on a book.";
        System.out.println(Output);
    }
}
