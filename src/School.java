import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter{
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(getName() + " City : " + getLocatedCountry());
    }

    @Override
    public void getStudentsStudyingYear() {
        Period period = Period.ofYears(LocalDate.now().getYear() - getFoundationYear().getYear());
        System.out.println(period);
    }
}
