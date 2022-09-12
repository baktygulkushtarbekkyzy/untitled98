import java.util.Arrays;

public class Obshejitiyadagylar implements ArendaToloshot {
    private People[] people;

    public Obshejitiyadagylar(People[] people) {
        this.people = people;
    }

    @Override
    public void arenda() {
        System.out.println("Жатаканада жашагандар аренда толошот ");
    }

    @Override
    public String toString() {
        return "Obshejitiyadagylar: " +
                "people=" + Arrays.toString(people);
    }
}
