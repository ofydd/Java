import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean diferitZero;
        int x;
        x = input.nextInt();
        if (x == 0)
            diferitZero = true;
        else
            diferitZero = false;

        // switch-ul functioneaza exact ca in C++:
        int zi;
        zi = input.nextInt();
        switch(zi)
        {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
        }

        //Si for-ul e la fel ca in C++:
        int factorial = 1;
        System.out.println("Introduceti un numar: ");
        int numarFactorial = input.nextInt();
        for(int i=1; i<=numarFactorial; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorialul numarului " + numarFactorial + " este " + factorial);
    }
}