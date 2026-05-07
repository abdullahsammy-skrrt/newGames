public class Naga extends Musuh {
    public Naga() {
        super("Naga perak", 800);
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namamusuh + " menyerang dengan breath of fire! Pemain kehilangan 50 HP.");
    }

    @Override
    public void suaraMonster() {
        System.out.println("Naga: ROOOAAARRR!");
    }
}
