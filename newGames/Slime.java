public class Slime extends Musuh {
    public Slime() {
        super("Slime", 50); 
    }

    @Override
    public void serangPemain() {
        System.out.println(this.namamusuh + " menyerang dengan lendir lengket! Pemain terkena efek slow selama 2 giliran! dan player kehilangan 15 HP.");
    }
    
    @Override
    public void suaraMonster() {
        System.out.println("Slime: blurbb... blurbb...");
    }
}