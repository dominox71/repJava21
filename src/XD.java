import java.util.*;

public class XD {

    public static void main(String[] args){

        int a = 999;
        int b = 81;
        String odp = "NWD liczb: " + a+ " i " + b + " wynosi: ";
        int c;
        while(b!=0){ //Dopóki reszta dzielenia przez liczby a i b nie będzie 0 to
            c = a % b; //Obliczenie reszty
            a = b; //Zamiana dzielnej z dzielnikiem
            b = c;//Zamiana dzielnika z resztą
        }
        System.out.println(odp +a);
        //Aby obliczyć NWW wystarczy użyć takiej formuły:
        //NWW=Pierwsza_liczba*Druga_liczba/NWD
    }
}