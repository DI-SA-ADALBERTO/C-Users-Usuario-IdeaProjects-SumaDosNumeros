import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Este mensaje es para ver que ya se ha subido el archivo");
        int num1=0, num2=0, resultado=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero de la suma ");
        num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero de la suma ");
        num2 = sc.nextInt();

        System.out.println("El resultado de la suma es " + (num1+num2));



    }
}