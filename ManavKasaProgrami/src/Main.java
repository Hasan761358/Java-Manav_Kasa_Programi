import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00, toplam,
        a,e,d,m,p;


        System.out.print(" Kaç kilo Armut aldiniz ? :  ");
        a=scanner.nextDouble();
        System.out.print(" Kaç kilo Elma aldiniz ? :  ");
        e=scanner.nextDouble();
        System.out.print(" Kaç kilo Domates aldiniz ? :  ");
        d=scanner.nextDouble();
        System.out.print(" Kaç kilo Muz aldiniz ? :  ");
        m=scanner.nextDouble();
        System.out.print(" Kaç kilo Patlıcan aldiniz ? :  ");
        p=scanner.nextDouble();

        toplam=a*armut+e*elma+d*domates+m*muz+p*patlıcan;
        System.out.println(" Toplam : " +toplam+("TL"));


    }
}