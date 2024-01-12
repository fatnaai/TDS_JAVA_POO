package TD3.EXO7;

class TravailleurHoraire extends TD3.EXO7.Employe {
    private double retribution;
    private double heures;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    public double getRetribution() {
        return retribution;
    }

    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    public double getHeures() {
        return heures;
    }

    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return super.toString() + "la rémunération horaire est : " + retribution + ", Heures: " + heures;
    }
}
