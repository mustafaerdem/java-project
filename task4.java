import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        System.out.println("enter 4 digits");
        Scanner scn = new Scanner(System.in);
          int number = scn.nextInt();
          int tousands;
         int hundereds;
        int tens;
          int units;

             tousands = number/1000;
        number = number-(1000*tousands);

        hundereds = number/100;
             number = number-(100*hundereds);

        tens = number/10;
        number = number-(10*tens);

        units = number/1;

        System.out.println("tousands: " + tousands);
        System.out.println("hundereds: " + hundereds);
        System.out.println("tens: " + tens);
        System.out.println("units: " + units);

    }
}


