import java.time.LocalDate;

public class Mentoring extends Contends{
    LocalDate date;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring [titleString=" + getTitleString() + ", descriptionString=" + getDescriptionString() + ", date=" + date
                + "]";
    }

    @Override
    public double calculateXp() {
        return XP_PATTERN + 20d;
    }

    

    
}
