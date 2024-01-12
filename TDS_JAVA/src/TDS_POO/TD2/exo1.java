package TDS_POO.TD2;

public class exo1 {

        public static void main(String[] args) {
            Point p = new Point(5,5,"A");
            System.out.println("X= "+p.getX() +" Y= "+ p.getY() + " Nom= " + p.getNom()+ " Norm= " + p.Norm());

        }

    }
    class Point {
        private double x,y;
        private String nom;
        public Point(double x, double y, String nom){
            this.x=x;
            this.y=y;
            this.nom=nom;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
        public String getNom(){
            return nom;
        }
        public void setX(double x){
            this.x=x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
        public double Norm(){
            return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        }
    }
