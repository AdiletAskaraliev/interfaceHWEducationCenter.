import java.time.LocalDate;

public abstract class EducationCenter implements Study{
    private String name;
    private String locatedCountry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
