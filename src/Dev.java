import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nameString;
    private Set<Contends> contendsSubscribe = new LinkedHashSet<>();
    private Set<Contends> contendsConcluded =  new LinkedHashSet<>();


    public void subscribeBootcamp(Bootcamp bootcamp){
        this.contendsSubscribe.addAll(bootcamp.getContends());
        bootcamp.getSubscribeDevs().add(this);
    }

    public void progress(){
        Optional<Contends> contends = this.contendsSubscribe.stream().findFirst();
        if(contends.isPresent()){
            this.contendsConcluded.add(contends.get());
            this.contendsSubscribe.remove(contends.get());
        }else{
            System.err.println("Voce nao esta matriculado em nenhum conteudo");
        }
    }

    public double calculateTotalXp(){
        return this.contendsConcluded.stream().mapToDouble(Contends::calculateXp).sum();
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameString == null) ? 0 : nameString.hashCode());
        result = prime * result + ((contendsSubscribe == null) ? 0 : contendsSubscribe.hashCode());
        result = prime * result + ((contendsConcluded == null) ? 0 : contendsConcluded.hashCode());
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
        Dev other = (Dev) obj;
        if (nameString == null) {
            if (other.nameString != null)
                return false;
        } else if (!nameString.equals(other.nameString))
            return false;
        if (contendsSubscribe == null) {
            if (other.contendsSubscribe != null)
                return false;
        } else if (!contendsSubscribe.equals(other.contendsSubscribe))
            return false;
        if (contendsConcluded == null) {
            if (other.contendsConcluded != null)
                return false;
        } else if (!contendsConcluded.equals(other.contendsConcluded))
            return false;
        return true;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public Set<Contends> getContendsSubscribe() {
        return contendsSubscribe;
    }

    public void setContendsSubscribe(Set<Contends> contendsSubscribe) {
        this.contendsSubscribe = contendsSubscribe;
    }

    public Set<Contends> getContendsConcluded() {
        return contendsConcluded;
    }

    public void setContendsConcluded(Set<Contends> contendsConcluded) {
        this.contendsConcluded = contendsConcluded;
    }

    
}
