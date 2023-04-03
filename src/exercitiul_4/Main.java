package exercitiul_4;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        int cmmdc;
        Random random=new Random();
        int nr1= random.nextInt(31);
        int nr2= random.nextInt(31);
        System.out.print("Generam numerele pentru care facem cmmdc: ");
        System.out.print(nr1+ " "+nr2+"\n");
        if(nr1*nr2==0)
            cmmdc=nr1+nr2;
        else {
            while(nr1!=nr2)
                if(nr1>nr2)
                    nr1=nr1-nr2;
            else
                nr2=nr2-nr1;
            cmmdc=nr1;
        }
        System.out.println("Cmmdc dintre cele 2 numere generate este:"+cmmdc);
    }
}
