import java.util.Scanner;
import java.lang.Math;
public class zajecia1 {
    public static void main (String [] args) {

        //Zadanie 2

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj string");
        String line = sc.nextLine();
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

        //Zadanie 3

        System.out.println("podaj imię");
        String imie = sc.nextLine();

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
        System.out.println("Płeć: " + plec);
        System.out.println("Wiek: " + wiek);

        //Zadanie 4

        int poczatek = -1000;
        int koniec = 1001;
        for (int i = poczatek; i <= koniec; i += 3) {
            System.out.println(i);
        }

        //Zadanie 5

        System.out.println("podaj pierwszą liczbę");
        line = sc.nextLine();
        int a = Integer.parseInt(line);

        System.out.println("podaj drugą liczbę");
        line = sc.nextLine();
        int b = Integer.parseInt(line);

        System.out.println("podaj trzecią liczbę");
        line = sc.nextLine();
        int c = Integer.parseInt(line);
        System.out.println(Math.max(a, Math.max(b, c)));

        //Zadanie 6

        System.out.println("Podaj pierwszą liczbę");
        line = sc.nextLine();
        double liczba_1 = Double.parseDouble(line);
        System.out.println("podaj drugą liczbę");
        line = sc.nextLine();
        double liczba_2 = Double.parseDouble(line);
        System.out.println("Dodawanie - wciśnij +");
        System.out.println("Odejmowanie - wciśnij -");
        System.out.println("Mnożenie - wciśnij *");
        System.out.println("Dzielenie - wciśnij /");
        System.out.println("Aby wyjść wciśnij q");
        char operacja;
        operacja = sc.nextLine().charAt(0);
        switch (operacja) {
            case '+' -> System.out.println(liczba_1 + liczba_2);
            case '-' -> System.out.println(liczba_1 - liczba_2);
            case '*' -> System.out.println(liczba_1 * liczba_2);
            case 'q' -> System.out.println("Do widzenia !");
            case '/' -> {
                if (liczba_2 != 0) {
                    System.out.println(liczba_1 / liczba_2);
                } else {
                    System.out.println("Dzielenie przez zero jest niepoprawne!");
                }
            }
            default -> throw new IllegalStateException("Nieznana operacja: " + operacja);
        }

        //Zadanie 7

        System.out.println("Podaj pierwszą liczbę");
        int x = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        int y = sc.nextInt();

        int z;
        while(y!=0){
            z = x % y;
            x = y;
            y = z;
        }
        System.out.println("Największy wspólny dzielnik " + x + " i " + y + " wynosi: " + x);
    }
}
