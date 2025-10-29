public class Sortilèges extends Carte{
    private String nom;
    private String explication;
    public Sortilèges(double cout,String nom, String explication) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
    }
    public String toString(){
        return ("Ce sortilège: "+this.nom);
    }
}
