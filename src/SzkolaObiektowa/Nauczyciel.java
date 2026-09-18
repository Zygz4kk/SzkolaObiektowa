package SzkolaObiektowa;

public class Nauczyciel extends Osoba implements Dyzurny {
    private String przedmiot;

    public Nauczyciel(String imie, String przedmiocik) {
        super(imie);
        przedmiot = przedmiocik;

    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}
