import java.util.Scanner;

public class Func1 {

    public static void max(int a, int b, int c) {
        int maks;
        System.out.print("nilai tertinggi nya adalah  : ");
        maks = Math.max(a, b);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c = 0;

        System.out.print("Masukan nilai a : ");
        a = input.nextInt();

        System.out.print("Masukan nilai b : ");
        b = input.nextInt();

        System.out.print("Masukan nilai c : ");
        c = input.nextInt();

        max(a, b, c);

    }
}