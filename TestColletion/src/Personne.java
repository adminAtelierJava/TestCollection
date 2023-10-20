import java.util.Comparator;

public class Personne implements Comparable<Personne>, Comparator<Personne>

{

    private int id,age;
    private String nom,prenom;

    public Personne(int id, int age, String nom, String prenom) {
        this.id = id;
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", age=" + age +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.id-o2.id;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==this) return true;
       if(obj==null) return false;
       if(obj.getClass()!=this.getClass())
           return false;

       Personne p=(Personne) obj;
       if(p.id==id &&p.prenom==prenom)
           return true;
return false;
    }

    @Override
    public int compareTo(Personne o) {
       /* if(this.id>o.id) return 1;
        if(this.id<o.id) return -1;
        return 0;*/
        return o.age-this.age;
    }
}
