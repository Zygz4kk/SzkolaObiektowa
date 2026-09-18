package SzkolaObiektowa;
public class Main {
    public static void main(String[] args) {
        //Osoba osoba = new Osoba("Jaś", 7); nie mozna tworzyc obiektu klasy abstrakcyjnej
        Osoba uczen = new Uczen(8, "Edek");
        Uczen uczen1 = new Uczen(7, "Ania");
        System.out.println(uczen);
        System.out.println(uczen1);
        }


    }