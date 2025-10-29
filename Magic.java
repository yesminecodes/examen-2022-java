public class Magic {
        public static void main(String[] args) {
            Jeu maMain = new Jeu();
            Terrains t = new Terrains('B');
            maMain.ajouter(t);
            Créatures c = new Créatures(6, " Gobelin", 4, 6);
            maMain.ajouter(c);
            Sortilèges s=new Sortilèges(1, "Amplificatum","Il augmente la taille de l'objet ou de l'animal visé");
            maMain.ajouter(s);
            System.out.println("Là, j'ai en stock :");
            maMain.afficher();
            maMain.jouer();
            maMain.jouer();
        } }

