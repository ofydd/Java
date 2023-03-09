import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Citirea unui string de la tastatura
        String s1 = input.nextLine();

        char character = input.nextLine().charAt(0); //Citirea unui singur caracter de la tastatura;

        System.out.println(s1);
        System.out.println(character);

        //While loop exact ca in C++
        int x = 2;
        while(x < 5)
        {
            System.out.println(x);
            x++;
        }

        //Do-while exact la fel ca in C++
        int y = 5;
        do {
            System.out.println(y);
            y--;
        } while (y > 2);

        // Alte chestii de tinut minte:
        /*
            Tot ce tine de siruri de caractere e exact ca in C/C++.
            \n, \t fac exact ce fac si in C++
            Prin capitol mai sunt si cateva operatii cu stringuri, cu functiile isUpperCase, toUpperCase, etc.
            break; functioneaza exact la fel ca in C++, opreste functia din executie
         */
    }
}