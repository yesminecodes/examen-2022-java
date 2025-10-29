public class Jeu {
    private Carte[] TabCartes;
    private int nb=0;
    public Jeu(){
        TabCartes = new Carte[10];
    }
    public void ajouter(Carte c){
        if (nb>10){
            System.out.println("les Cartes sont pleinesssssss!!!!!!");
        }
        else{
            TabCartes[nb]=c;
            nb++;
            System.out.println("on change de main");
            if (c instanceof Terrains){
                System.out.println("Un nouveau terrain.");
            }
            else if (c instanceof Créatures){
                System.out.println("Une nouvelle créature.");
            }
            else{
                System.out.println("Un sortilège de plus.");
            }
        }
    }
    public void jouer(){
        int i=0;
        while(TabCartes[i]==null){
            i++;
        }
        System.out.println("je joue une carte...");
        System.out.println("La Carte joué est : "+TabCartes[i].toString());
        TabCartes[i]=null;
    }
    public void afficher(){
        for(int i=0;i<nb;i++){
            System.out.println(TabCartes[i].toString());
        }
    }
}
