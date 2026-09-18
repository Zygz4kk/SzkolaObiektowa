package SzkolaObiektowa;

public abstract class Osoba {
    //abstrakcyjna klasa nie pozwala na tworzenie obiektow tej klasy
    protected String imie;
    private int wiek;
    //modyfikatory dostepu:
    //public dostepne wszedzie
    //private dostepne tylko w tej klasie
    //protected dostepne w tej klasie i klasie z niej dziedziczacej
    // w java dostepne w calym pakiecie
    //brak modyfikatora dostepu - dostepny w pakiecie

    public Osoba(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public Osoba(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }
}
