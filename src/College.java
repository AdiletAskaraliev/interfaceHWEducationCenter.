import java.time.LocalDate;
import java.time.Period;

public class College extends EducationCenter{
    public College(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }



    @Override
    public void getStudentsEducationCenter() {
        System.out.println(getName() + " Country : " + getLocatedCountry());
    }

    @Override
    public void getStudentsStudyingYear() {
        Period period = Period.ofYears(LocalDate.now().getYear() - getFoundationYear().getYear());
        System.out.println(period);
    }
}
