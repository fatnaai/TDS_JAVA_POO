package TD3.EXO7;

class TravailleurCommission extends TD3.EXO7.Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
        this.salaire = 0;
        this.commission = 0;
        this.quantite = 0;
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return super.toString() + "Le Salaire: " + salaire + ",  et la  commission est: " + commission + ",et la quantité est: " + quantite;
    }
}

