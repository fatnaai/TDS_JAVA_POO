package TDS_POO.TD3.EXO4;

public class Maison  extends Batiment{
   private int nbChambres;
   public Maison(){
   }
   public Maison(int nbChambres,String adress){
       super(adress);
       this.nbChambres=nbChambres;
   }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }
    @Override
    public String toString(){
       return "Maison {adress ="+ getAdress() +","+getNbChambres()+"}";
    }
}
