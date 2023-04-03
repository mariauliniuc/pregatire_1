package exercitiul_1;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduceti latimea: ");
        float latime=scanner.nextFloat();
        System.out.println("Introduceti lungimea: ");
        float lungime=scanner.nextFloat();
        float perimetru=2*(lungime+latime);
        float arie=lungime*latime;
        System.out.println("Aria este: "+arie);
        System.out.println("Perimetrul este"+perimetru);
}
