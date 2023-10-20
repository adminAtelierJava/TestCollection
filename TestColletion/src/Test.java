import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList l1=new ArrayList();

        l1.add(5);
        l1.add("test");
        l1.add(6.2);
        l1.add(5);
        l1.add("test");
        l1.add("test2");

        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(1));

        System.out.println(l1.contains("test"));
        System.out.println(l1.remove(5));
        System.out.println(l1.remove((Integer)5));
        System.out.println(l1);

        Personne p1=new Personne(1,15,"nom1","prenom1");
        Personne p2=new Personne(2,16,"nom2","prenom2");
        Personne p3=new Personne(3,5,"nom3","prenom3");
        Personne p4=new Personne(3,5,"nom3","prenom3");




        l1.add(p1);
        l1.add(p2);
        l1.add(p3);
        l1.add(p2);
        System.out.println(l1);

        Object ob=l1.get(0);

   //Afficher tous les objets de L1
        for (int i=0;i<l1.size();i++)
        {
            Object obj=l1.get(i);
            System.out.println(obj);

        }
        for(Object p:l1)
            System.out.println(p);
        //Afficher que les noms des personnes

        for (int i=0;i<l1.size();i++)
        {     if(l1.get(i) instanceof Personne) {
            Personne p = (Personne) l1.get(i);
            System.out.println(p.getNom());
        }

        }
    ArrayList<Personne> l2=new ArrayList();
        l2.add(p1);
        l2.add(p2);
        l2.add(p3);
        l2.add(p2);

        for(int i=0;i<l2.size();i++)
            System.out.println(l2.get(i).getNom());
        for(Personne p:l2)
            System.out.println(p.getNom());
        System.out.println(l2.contains(p1));

        System.out.println(l2.contains(new Personne(2,16,"nom2","prenom2")));

        System.out.println(l2.remove(p4));

        System.out.println(l2.remove(new Personne(2,16,"nom2","prenom2")));


        System.out.println(p1==p4);

        // Créer une list de Integer et faite le tri coir et dec
        // Créer une list de String et faite le tri crois et decro
        //trier la liste de personne


        ArrayList<Integer> listint=new ArrayList();
        listint.add(5);
        listint.add(2);
        listint.add(7);

        System.out.println("Avant "+listint);
        Collections.sort(listint);
        System.out.println("Après tri"+listint);
        Collections.sort(listint,Collections.reverseOrder());

        System.out.println("tri decroi"+listint);

        ArrayList<String> list=new ArrayList();
        list.add("test");
        list.add("Abc");
        list.add("abc");
        System.out.println("Avant "+list);
        Collections.sort(list);
        System.out.println("Après tri"+list);
        Collections.sort(list,Collections.reverseOrder());

        System.out.println("tri decroi"+list);
//tri personn par id croissant
        Collections.sort(l2);//interface comparable

        //
        Collections.sort(l2,Collections.reverseOrder());

        Collections.sort(l2,new TriNom());

Collections.sort(l2,new Personne());



      Collections.sort(l2,new TriPrenomDec());



    }
}
