import java.time.LocalDate;

public class Mentoring {
    String titleString;
    String descriptionString;
    LocalDate date;


    public String getTitleString() {
        return titleString;
    }

    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

    public String getDescriptionString() {
        return descriptionString;
    }

    public void setDescriptionString(String descriptionString) {
        this.descriptionString = descriptionString;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring [titleString=" + titleString + ", descriptionString=" + descriptionString + ", date=" + date
                + "]";
    }

    

    
}
