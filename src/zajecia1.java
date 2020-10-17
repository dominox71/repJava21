import java.util.Scanner;
public class zajecia1 {
    public static void main (String [] args){
//Zadanie 1
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj string");
        String line= sc.nextLine();
        System.out.println("Wyświetlam string: " + line);

        System.out.println("podaj int");
        line = sc.nextLine();
        int liczba = Integer.parseInt(line);
        System.out.println("Wyświetlam int: " + liczba);

        System.out.println("Podaj true lub false");
        line = sc.nextLine();
        boolean bool = Boolean.parseBoolean(line);
        System.out.println("Wyświetlam boolean: " + bool);

        System.out.println("podaj liczbę zmiennoprzecinkową");
        line = sc.nextLine();
        double zmienno = Double.parseDouble(line);
        System.out.println("wyświetlam liczbę zmiennoprzecinkową: " + zmienno);
//Zadanie 2
        System.out.println("podaj imię");
        String imie= sc.nextLine();

        System.out.println("podaj nazwisko");
        String nazwisko = sc.nextLine();

        System.out.println("podaj płeć");
        String plec = sc.nextLine();

        System.out.println("podaj wiek");
        line = sc.nextLine();
        int wiek = Integer.parseInt(line);


        System.out.println("Wyświetlam Twoje dane: ");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println( "Płeć: " + plec);
        System.out.println("Wiek: " + wiek);


    }
}
