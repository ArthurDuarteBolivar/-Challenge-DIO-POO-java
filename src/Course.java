public class Course {
    private String titleString;
    private String descriptionString;
    private int workload;


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


    public int getWorkload() {
        return workload;
    }


    public void setWorkload(int workload) {
        this.workload = workload;
    }


    @Override
    public String toString() {
        return "Course [titleString=" + titleString + ", descriptionString=" + descriptionString + ", workload="
                + workload + "]";
    }

    

    
}