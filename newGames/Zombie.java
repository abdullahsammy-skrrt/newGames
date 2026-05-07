public class Zombie extends Musuh {
    public Zombie() {
        super("Zombie", 150);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namamusuh + " menyerang dengan gigitan mematikan! Pemain kehilangan 20 HP.");
    }

    @Override
    public void suaraMonster() {
        System.out.println("Zombie: braaaains... grrrrr...");
    }
}