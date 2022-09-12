import java.util.Arrays;

public class GostinitsadaJashagandar implements  ArendaToloshot{
    private People[] people;

    public GostinitsadaJashagandar(People[] people) {
        this.people = people;
    }

    @Override
    public void arenda() {
        System.out.println("Гостиницада жашагандар аренда толошот ");
    }

    @Override
    public String toString() {
        return "GostinitsadaJashagandar: " +
                "people=" + Arrays.toString(people);
    }
}
