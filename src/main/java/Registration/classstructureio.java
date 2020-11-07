package Registration;

import java.util.Scanner;

public class classstructureio {


    public static void main(String[] args) {
        System.out.println("Adja meg a nevet");
        System.out.println("Adja meg az email cimet");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int nev = scanner.nextInt();
        int email = scanner.nextInt();
        System.out.println("nev");
        System.out.println("email");
    }
}
