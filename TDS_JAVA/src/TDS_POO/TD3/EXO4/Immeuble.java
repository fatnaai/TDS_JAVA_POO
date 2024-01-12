package TDS_POO.TD3.EXO4;

public class Immeuble extends Batiment {
    private int nbAppart;
    public Immeuble(){

            }
    public Immeuble(String adress,int nbAppart){
          super(adress);
          this.nbAppart=nbAppart;
    }

    public int getNbAppart() {
        return nbAppart;
    }

    public void setNbAppart(int nbAppart) {
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return "Immeuble{" + "nbAppart=" + nbAppart + ",adress="+ getAdress()+"}";
    }
}
