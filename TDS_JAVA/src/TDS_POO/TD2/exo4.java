package TDS_POO.TD2;

public class exo4 {
    public static void main(String[] args) {
        Temps t=new Temps(20,23,1);
        System.out.println(t.toString());
        t.ajouterM(601);
        System.out.println(t.toString());
        t.ajouterS(61);
        System.out.println(t.toString());
    }
    static class Temps {
        int h,m,s;
        public Temps(){

        }
        public Temps(int s){
            this.s=s;
        }

        public Temps(int s, int m){
            this.s=s;
            this.m=m;
        }

        public Temps(int s,int m,int h){}
        public Temps(Temps temps){
            this(temps.getS(), temps.getM(), temps.getH());
        }

        public void ajouterH(int h){

            this.setH(this.getH() + h);
        }
        public void ajouterM(int m){
            m=m+this.getM();
            ajouterH(m/60);
            this.setM(m%60);
        }
        public void ajouterS(int s){
            s=s+this.getS();
            ajouterM(s/60);
            this.setS(s%60);
        }


        public int getS(){
            return s;
        }
        public void setS(int s){
            this.s = s;
        }
        public int getM(){
            return m;
        }
        public void setM(int m){
            this.m = m;
        }
        public int getH(){
            return h;
        }
        public void setH(int h){
            this.h = h;
        }

        @Override
        public String toString() {
            return ("heures= " + h + " minutes= " + m + " secondes= " + s);
        }
    }
}
