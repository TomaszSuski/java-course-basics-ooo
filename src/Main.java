import Bla.Bla;

import java.util.Scanner;

import Account.Account;

/*
public class Main {

    public static void main(String[] args){

    Bla foo = new Bla();
    foo.doBla();


        Coords p = new Coords(10, 20);
//        p.x = 5;
//        p.y = 10;
        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);


        // Tworzymy obiekt klasy Scanner i przypisujemy mu System.in
        Scanner input = new Scanner(System.in);

        // wysyłamy prośbę o podanie imienia użytkownika
        System.out.println("Proszę podać swoje imię : ");
        // pobieramy podaną wartość jako String
        String name = input.next();
        // wypisujemy podane imię użytkownika na ekranie
        System.out.println("Twoje imię to: " + name);

        // wysyłamy prośbę o podanie wieku użytkownika
        System.out.println("Proszę podać swój wiek : ");
        // pobieramy podaną wartość jako int
        int age = input.nextInt();
        // wypisujemy podany wiek użytkownika na ekranie
        System.out.println("Twój wiek to: " + age);

        // wysyłamy prośbę o podanie pensji użytkownika
        System.out.println("Proszę podać swoją pensję : ");
        // pobieramy podaną wartość jako double
        double salary = input.nextDouble();
        // wypisujemy podaną pensję użytkownika na ekranie
        System.out.println("Twoja pensja to: " + salary);



    }
}

class Coords
{
//    KONSTRUKTOR klasy w JAVA:
    Coords()
    {
        System.out.println("wywołany konstruktor domyślny");
    }

    // może być dużo konstruktorów dla jednej klasy, ale muszą się różnić parametrami!
    Coords(int par1, int par2)
    {
        x = par1;
        y = par2;
  ;  }

//    reszta kodu klasy
    int x;
    int y;
}

// użycie THIS

class Coords2
{
    Coords2(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

//    METODY
    int dodaj(int a, int b)
    {
        return a + b;
    }
    double dzielenie (double a, double b)
    {
        if (b == 0)
            return 0;

        return a / b;
    }
}


/*
Aby uzyskać dane wejściowe od użytkownika, należy wpierw zaimportować klasę Scanner na początku programu.

Następnie tworzymy obiekt Scanner i używamy metod

next() / nextInt() / nextDouble()

do pobrania odpowiednio typu

String / int / double.



Importujemy klasę Scanner z biblioteki java.util

Tworzymy obiekt klasy Scanner, nazywając go "input", przypisując mu System.in

Wysyłamy prośbę o podanie imienia użytkownika i pobieramy podaną wartość jako String przy pomocy metody input.next().

Wypisujemy podane imię użytkownika na ekranie.

Wysyłamy prośbę o podanie wieku użytkownika i pobieramy podaną wartość jako int przy pomocy metody input.nextInt().

Wypisujemy podany wiek użytkownika na ekranie.

Wysyłamy prośbę o podanie pensji użytkownika i pobieramy podaną wartość jako double przy pomocy metody input.nextDouble().

Wypisujemy podaną pensję użytkownika na ekranie.


 */

/*
            ĆWICZENIE: Saldo Konta
    Cel:
    Stwórz program reprezentujący konto.
    Program pozwala na wpłaty / wypłaty / sprawdzenie salda z konta.

    Oczekiwane dane wejściowe:
    Wartość double dla operacji wpłaty / wypłaty (użyj klasy Scanner)
    Oczekiwana wartość wyjściowa:
    Wypisane saldo konta startower oraz po operacji wpłaty / wypłaty

    Instrukcje:
    Stwórz klasę o nazwie "Account" z prywatnym polem "balance"
    Stwórz metodę "deposit" przyjmującą wartość double jako parametr i aktualizującą saldo konta poprzez dodanie wartości do salda.
    Stwórz metodę "withdraw" przyjmującą wartość double jako parametr i aktualizującą saldo konta poprzez
    odejmowanie wartości od salda, ale tylko jeśli kwota wypłaty jest mniejsza niż obecne saldo.
    Stwórz metodę "getBalance" zwracającą obecne saldo konta.
    W metodzie main, stwórz instancję klasy Account, wyświetl początkowe saldo, dokonaj wpłaty i wypłaty, a następnie wyświetl aktualizowane saldo.

    Wskazówki:
    Upewnij się, że testujesz swój kod z różnymi wartościami wejściowymi, aby upewnić się, że działa on zgodnie z oczekiwaniami.
    Pamiętaj, że słowo kluczowe "this" odnosi się do bieżącej instancji obiektu.
    Pamiętaj, że w tym przykładzie saldo jest prywatne i można je uzyskać tylko przez metody deposit, withdraw
    i getBalance, które zapobiegają nieautoryzowanemu dostępowi lub manipulacji saldem.
    Pamiętaj, że enkapsulacja jest ważnym zasadą programowania obiektowego, która pomaga ukryć szczegóły
    implementacji klasy i ograniczyć dostęp do stanu wewnętrznego obiektu. Prostszymi słowami:
    enkapsulacja to takie zabezpieczenie, które pozwala na ukrycie jak działa program i kontrolowanie tego kto
    i jak może z niego korzystać. Jest to jak zamknięcie skarbonki, żeby nikt inny poza tobą nie miał do niej dostępu.
 */


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj saldo początkowe:");
        double baseBallance = input.nextDouble();
        Account account = new Account(baseBallance);

        System.out.println("Jaką operację wykonać? Wpisz jedną z poniższych opcji:");
        System.out.println("wpłata");
        System.out.println("wypłata");
        System.out.println("saldo");

        String answer = input.next();

        switch (answer.toUpperCase()) {
            case ("WPŁATA"): {
                System.out.println("Podaj kwotę do wpłaty:");
                double amount = input.nextDouble();
                account.deposit(amount);
                System.out.println("Aktualne saldo: " + account.getBallance());
                break;
            }
            case ("WYPŁATA"): {
                System.out.println("Podaj kwotę do wypłaty:");
                double amount = input.nextDouble();
                account.withdraw(amount);
                System.out.println("Aktualne saldo: " + account.getBallance());
                break;
            }
            case ("SALDO"): {
                System.out.println("Twoje saldo wynosi: " + account.getBallance());
            }
            default: {
                System.out.println("Niepoprawna operacja. Dostępne opcje to wpłata, wypłata i saldo");
                return;
            }
        }
    }
}
