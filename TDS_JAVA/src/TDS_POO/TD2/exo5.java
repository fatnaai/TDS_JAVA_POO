package TDS_POO.TD2;

public class exo5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10.0, 20.0);
        System.out.println(rectangle1);
        System.out.println("Perimètre : " + rectangle1.perimetre());
        System.out.println("Aire : " + rectangle1.aire());
        System.out.println("Est-ce un carré ? " + rectangle1.isCarre());

        Rectangle rectangle2 = new Rectangle(10.0, 10.0);
        System.out.println(rectangle2);
        System.out.println("Perimètre : " + rectangle2.perimetre());
        System.out.println("Aire : " + rectangle2.aire());
        System.out.println("Est-ce un carré ? " + rectangle2.isCarre());
    }
    static class Rectangle {

        private double longueur;
        private double largeur;

        public Rectangle() {
            this(1.0, 1.0);
        }

        public Rectangle(double longueur, double largeur) {
            this.longueur = longueur;
            this.largeur = largeur;
        }

        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.longueur;
            this.largeur = rectangle.largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            }
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            }
        }

        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            return longueur == largeur;
        }

        @Override
        public String toString() {
            return "Rectangle { longueur = " + longueur + ", largeur = " + largeur + " }";
        }
    }

}
