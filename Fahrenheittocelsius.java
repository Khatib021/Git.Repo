import java.util.Scanner;


public class Fahrenheittocelsius {

    public static void main(String[] args) {



        double epsilon = 0.005;
        double f = 0.0, c;


        Scanner in = new Scanner(System.in);


        do {

            System.out.println("Programm endet durch Eingabe von 1 pew pew pew");
            System.out.println("Eingabe der Fahrenheit-Temperatur: ");

            f = in.nextDouble();

            c = (f - 32) * 5/9;

            System.out.println("... in Celsius: " + c + " Grad \n");

        } while (Math.abs(f-1) > epsilon);

        System.out.println("... und tschüss");
        in.close();
    }
}