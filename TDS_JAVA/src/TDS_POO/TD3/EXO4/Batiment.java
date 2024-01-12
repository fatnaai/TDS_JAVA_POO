package TDS_POO.TD3.EXO4;

public class Batiment {
    private String adress;
    public Batiment(String Adress){
        this.adress=adress;
    }
    public Batiment (){

    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    @Override
    public String toString(){
        return"Batiment{ adress = " +adress+"}";
    }


}
