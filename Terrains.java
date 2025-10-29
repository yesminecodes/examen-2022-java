public class Terrains extends Carte{
    private char couleur;
    public Terrains(char couleur) {
        super(0);
        this.couleur = couleur;
    }
    public String couleur(){
        String coul = "";
        switch(this.couleur){
            case 'B':
                coul="Blanc";
                break;
            case 'b':
                coul="Blue";
            break;
            case 'n':
                coul="Noir";
            break;
            case 'r':
                coul="Rouge";
            break;
            case 'v':
                coul="Vert";
            break;
            default: coul="Noir";
        }
        return coul;
    }
    public String toString() {
        return ("Un terrain "+couleur());
    }
}
