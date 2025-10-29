public class Créatures extends Carte{
    private String nom;
    private int nbpointsdegats;
    private int nbpointsvie;
    public Créatures(double cout,String nom, int nbpointsdegats, int nbpointsvie){
        super(cout);
        this.nom = nom;
        this.nbpointsdegats = nbpointsdegats;
        this.nbpointsvie = nbpointsvie;
    }
    public String toString(){
        return ("Une créature "+this.nom+" "+this.nbpointsdegats+"/"+this.nbpointsvie);
    }
}
