import java.util.Scanner;

public class Second {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c;
        while (true) {
            if(b == 0){
                break;
            } else {
                c = a / b;
                System.out.println(c);
            }
            break;
        }
    }
}
