package SzkolaObiektowa;

public class Uczen extends Osoba implements Dyzurny{
    private static int LiczbaUczniów = 0;
    private int nrUcznia;

    public Uczen(int wiek, String imie) {
        super(wiek, imie);
        LiczbaUczniów++;
        nrUcznia=LiczbaUczniów;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +
                ", imie='" + imie + '\'' +
                ", wiek='" + getWiek() + '\'' +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Podlej kwiatki");
    }
}
