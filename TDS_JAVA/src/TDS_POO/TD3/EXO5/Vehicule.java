package TD3.EXO5;

public class Vehicule {

        private int nbPassager;
        public Vehicule(){};
        public Vehicule(int nbPassager) {
            this.nbPassager = nbPassager;
        }

        public String toString() {

            return "Nombre de passagers : " + nbPassager;
        }
    }

