public class Course extends Contends{
    private int workload;


    public int getWorkload() {
        return workload;
    }


    public void setWorkload(int workload) {
        this.workload = workload;
    }


    @Override
    public String toString() {
        return "Course [titleString=" + getTitleString() + ", descriptionString=" + getDescriptionString() + ", workload="
                + workload + "]";
    }


    @Override
    public double calculateXp() {
        return XP_PATTERN * workload;
    }

    

    
}