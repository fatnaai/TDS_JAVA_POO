package TDS_POO.TD3.EXo1;

public class PointA extends Point{
    public PointA(int x,int y){
        super(x,y);
    }
    @Override
    public void affiche(){
        System.out.println("Coordonner du point :(" +getX()+","+getY()+")");
    }
}
