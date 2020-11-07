package Calculator;

import java.util.Scanner;

public class classstructureio {

    public static void main(String[] args) {
        System.out.println("Adj meg egy szamot");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int elsoSzam = scanner.nextInt();
        int masodikSzam = scanner.nextInt();
        System.out.println(masodikSzam);
        System.out.println(elsoSzam + "+"+ masodikSzam);
    }
}
