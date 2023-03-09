import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Echivalentul cin >>

        final double PI = 3.14159; // const double PI = 3.14159;

        int nr1 = input.nextInt();
        int nr2 = input.nextInt();
        int nr3 = input.nextInt();

        double average = (nr1 + nr2 + nr3) / 3;
        System.out.println("The average is: " + average);

        System.out.println("Math.pow: " + Math.pow(2, 3)); // Functioneaza la fel ca pow() din C++

        // CAST:
        System.out.println((double)1); // cast explicit de la int la double
        System.out.println((int)1.25); //cast explicit de la float la int



        //int, double, byte, short, long, float, char , boolean



    }
}