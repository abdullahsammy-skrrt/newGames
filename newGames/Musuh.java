public abstract class Musuh {
    protected String namamusuh;
    protected int healthpoint;

    // constructor: otomatis di jalan kan saat objek diciptakan
    public Musuh(String namaMusuh, int hp) {
        this.namamusuh = namaMusuh;
        this.healthpoint = hp;
    }

    public void terimaSerangan(int damage) {
        this.healthpoint -= damage;
        System.out.println(this.namamusuh + " menerima serangan! Sisa HP: " + this.healthpoint);
    }
    public abstract void serangPemain();
    public abstract void suaraMonster();
}