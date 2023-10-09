import java.util.Scanner;

public class Third {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        double c;
        for(int i = 0; i < 5; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            if (b == 0){
                System.out.println("Деление на 0");
                continue;
            }
            c = a / b;
            System.out.println(c);
        }
    }
}
