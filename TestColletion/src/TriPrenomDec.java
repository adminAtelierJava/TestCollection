import java.util.Comparator;

public class TriPrenomDec implements Comparator<Personne> {
    @Override
    public int compare(Personne o1, Personne o2) {
        return o2.getPrenom().compareTo(o1.getPrenom());
    }
}
