import java.util.Scanner;
public class SoalNo3 {
    public static void main(String[] args) {

        int x = 0, y = 1, z=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan fibonacci = ");

        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {

            System.out.print(x + ", ");

            z = x + y;
            x = y;
            y = z;
        }
        input.close();
    }
}