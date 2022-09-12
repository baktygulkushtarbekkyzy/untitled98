import java.util.Arrays;

public class Kvartiranttar implements KomuslugaToloshot {
    private People[] people;

    public Kvartiranttar(People[] people, People[] semyaJoomartbek) {
        this.people = people;
    }

    @Override
    public void komusluga() {
        System.out.println("Квартирада жашагандар ком услуга толошот ");
    }

    @Override
    public String toString() {
        return "Kvartiranttar:" +
                "people=" + Arrays.toString(people);
    }
}
