import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a=1;
        float b = 3.1F;
        float c = a+b;
        System.out.println(c);
        String string= "ciekawe_rzeczy";
        System.out.println(a);
        System.out.println(string);
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj imie");
        String line= sc.nextLine();
        System.out.println("Wyświetlam:" + line);
        System.out.println("podaj wiek");
        line = sc.nextLine();
        int wiek = Integer.parseInt(line);
        System.out.println(wiek);
        line = sc.nextLine();
        boolean boo = Boolean.parseBoolean(line);
        System.out.println(boo);
        boolean val = Boolean.parseBoolean(sc.nextLine());
        line = sc.nextLine();
        double dd = Double.parseDouble(line);
        System.out.println(dd);

    }
}