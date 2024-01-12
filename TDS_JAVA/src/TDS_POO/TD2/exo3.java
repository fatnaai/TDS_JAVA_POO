package TDS_POO.TD2;

public class exo3 {
    public static void main(String[] args) {
        Livre l=new Livre("un titre","un auteur", 100,2002 );
        System.out.println(l.toString());
    }

}
class Livre {
    String titre;
    String auteurs;
    double prix;
    int annee;
    public Livre (){

    }
    public Livre (String titre){
        this.titre=titre;
    }
    public Livre(String titre , String auteurs){
        this.titre=titre;
        this.auteurs=auteurs;
    }
    public Livre(String titre, String auteurs, double prix){
        this.titre=titre;
        this.auteurs=auteurs;
        this.prix=prix;
    }
    public Livre(String titre, String auteurs, double prix, int annee){
        this.titre=titre;
        this.auteurs=auteurs;
        this.prix=prix;
        this.annee=annee;
    }
    public Livre (Livre l){
        this.titre=l.titre;
        this.auteurs=l.auteurs;
        this.prix=l.prix;
        this.annee= l.annee;
    }
    public void setTitre(String titre){
        this.titre=titre;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public double getPrix() {
        return prix;
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteurs='" + auteurs + '\'' +
                ", prix=" + prix +
                ", annee=" + annee +
                '}';
    }
}



