package TDS_POO.TD2;

public class exo6 {
    public static void main(String[] args) {
        Banque B = new Banque(1, 5000.75, "AB1200");
        System.out.println(B.toString());
        System.out.println("le solde = " + B.solde);
        B.deposer(500);
        System.out.println(B.toString());
        System.out.println("le solde = " + B.solde);
        B.retirer(200);
        System.out.println(B.toString());
        System.out.println("le solde = " + B.solde);


    }

     static class Banque {
        int numero;
        double solde;
        String cin;

        public Banque(int numero, double solde, String cin) {
            this.numero = numero;
            this.solde = solde;
            this.cin = cin;
        }

        public void deposer(double montant) {
            this.solde = this.solde + montant;
        }

        public boolean retirer(double montant) {
            if (this.solde - montant >= 0) {
                this.solde -= montant;
                return true;
            } else return false;
        }

        public double getSolde() {
            return solde;
        }

        @Override
        public String toString() {
            return "Banque{" +
                    "numero=" + numero +
                    ", solde=" + solde +
                    ", cin='" + cin + '\'' +
                    '}';
        }
    }
}
