package TD3.EXO7;

public class TestEmploye {
    public static void main(String[] args) {
        TD3.EXO7.Patron patron = new TD3.EXO7.Patron("Alami", "Driss", 8500);
        TD3.EXO7.TravailleurCommission travailleurCommission = new TD3.EXO7.TravailleurCommission("Ali", "Mohammed", 9000, 50);
        TD3.EXO7.TravailleurHoraire travailleurHoraire = new TD3.EXO7.TravailleurHoraire("ELMalki", "Hanae", 150);

        System.out.println(patron.toString() + " "+" les gains: " + patron.gains());
        System.out.println(travailleurCommission.toString() + " "+" les gains: " + travailleurCommission.gains());
        System.out.println(travailleurHoraire.toString() + " "+" les gains: " + travailleurHoraire.gains());
    }
}
