import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate enDate = startDate.plusDays(45);
    private Set<Dev> subscribeDevs = new HashSet<>();
    private Set<Contends> contends = new LinkedHashSet<>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEnDate() {
        return enDate;
    }
    public Set<Dev> getSubscribeDevs() {
        return subscribeDevs;
    }
    public void setSubscribeDevs(Set<Dev> subscribeDevs) {
        this.subscribeDevs = subscribeDevs;
    }
    public Set<Contends> getContends() {
        return contends;
    }
    public void setContends(Set<Contends> contends) {
        this.contends = contends;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((enDate == null) ? 0 : enDate.hashCode());
        result = prime * result + ((subscribeDevs == null) ? 0 : subscribeDevs.hashCode());
        result = prime * result + ((contends == null) ? 0 : contends.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (enDate == null) {
            if (other.enDate != null)
                return false;
        } else if (!enDate.equals(other.enDate))
            return false;
        if (subscribeDevs == null) {
            if (other.subscribeDevs != null)
                return false;
        } else if (!subscribeDevs.equals(other.subscribeDevs))
            return false;
        if (contends == null) {
            if (other.contends != null)
                return false;
        } else if (!contends.equals(other.contends))
            return false;
        return true;
    }
    
    

    
}
