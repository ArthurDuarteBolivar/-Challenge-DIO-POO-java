public abstract class Contends {
    
    protected static final double XP_PATTERN = 10d;

    private String titleString;
    private String descriptionString;

    public abstract double calculateXp();

    public static double getXpPattern() {
        return XP_PATTERN;
    }

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

    

}
