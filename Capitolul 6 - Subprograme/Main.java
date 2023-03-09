import java.util.Scanner;
public class Main {
    //Subprogramele se declara in interiorul clasei:
    public static int sum(int i1, int i2)
    {
        int result = i1 + i2;
        return result;
    }

    public static void diferenta(int i1, int i2)
    {
        int result;
        if( i1 < i2)
            result = i2-i1;
        else
            result = i1-i2;
        System.out.println(result);
    }

    //Supraincarcarea de la POO:
    public static float sum(float i1, float i2)
    {
        float result = i1 + i2;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i1, i2;
        System.out.println("Introduceti un int:");
        i1 = input.nextInt();
        System.out.println("Introduceti un int:");
        i2 = input.nextInt();

        int suma = sum(i1, i2);
        System.out.println(suma);

        diferenta(i1, i2);

        float numar1, numar2;

        System.out.println("Introduceti un float:");
        numar1 = input.nextFloat();
        System.out.println("Introduceti un float:");
        numar2 = input.nextFloat();

        float rezultat = sum(numar1, numar2);
        System.out.println(rezultat);
    }
}