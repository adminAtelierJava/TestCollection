import java.util.Comparator;

public class TriNom implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
