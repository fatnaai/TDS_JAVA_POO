package TDS_POO.TD3.EXO5;

public class Avion extends TD3.EXO5.Vehicule {
    private int nbMoteur;
    public Avion(int nbP){
        super(nbP);
        nbMoteur =2;
    }
    public Avion (int nbP,int nbM){
        super(nbP);
        this.nbMoteur=nbM;
    }

    @Override
    public String toString() {
        return super.toString()+",nombre fe moteurs :" +nbMoteur;
    }
}
