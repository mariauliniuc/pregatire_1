package exercitiul_5;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Generam urmatorul numar:");
        Random random= new Random();
        int nr= random.nextInt(21);
        System.out.println(nr);
        int a,b,c,ok;
        if(nr==1)
            ok=1;
        else {
            a=1;
            b=1;
                    do
                    {
                        c=a+b;
                        a=b;
                        b=c;
                    }while(c<nr);
                    if(c==nr)
                        ok=1;
                    else
                        ok=0;
        }
        if(ok==0)
            System.out.print("Numarul nu apartine sirului Fibonacci!");
        else
            System.out.print("Numarul apartine sirului Fibonacci!");
    }
}
