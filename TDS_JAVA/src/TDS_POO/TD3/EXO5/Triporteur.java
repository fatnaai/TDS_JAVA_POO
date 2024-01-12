package TDS_POO.TD3.EXO5;

public class Triporteur  extends Moto{
    private int nbPoues=3;
    public Triporteur(){
        super();
    }
    public Triporteur(int nbP){
        this.nbPoues=nbP;
    }

    @Override
    public String toString() {
        return super.toString()+",nombre de roues :" + nbRoues;
    }
}
