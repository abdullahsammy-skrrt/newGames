import java.util.Scanner;

public class ArenaPertarungan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // array monster
        Musuh[] gelombangMonster = new Musuh[4];

        gelombangMonster[0] = new Slime();
        gelombangMonster[1] = new Zombie();
        gelombangMonster[2] = new Naga();
        gelombangMonster[3] = new Slime();

        System.out.println("======================================");
        System.out.println("      ARENA RPG : MONSTER BATTLE      ");
        System.out.println("======================================");
        System.out.println("Sekelompok monster menghadangmu!");
        System.out.println("Kalahkan mereka sebelum terlambat!");

        boolean isBermain = true;

        // GAME LOOP
        while (isBermain) {

            System.out.println("\n========== STATUS MONSTER ==========");

            for (int i = 0; i < gelombangMonster.length; i++) {

                System.out.println(
                    (i + 1) + ". "
                    + gelombangMonster[i].namamusuh
                    + " (HP : "
                    + gelombangMonster[i].healthpoint
                    + ")"
                );
            }

            System.out.println("5. Kabur dari arena");

            System.out.print(
                "\nPilih monster yang ingin diserang (1-4) atau 5 untuk kabur : "
            );

            int pilihanTarget = input.nextInt();

            // pemain kabur
            if (pilihanTarget == 5) {

                System.out.println(
                    "\nKamu memilih kabur dari pertarungan!"
                );

                isBermain = false;
                continue;
            }

            // validasi input
            if (pilihanTarget < 1 || pilihanTarget > 4) {

                System.out.println(
                    "\nPilihan tidak valid!"
                );

            } else {

                // input damage
                System.out.print(
                    "Masukkan kekuatan serangan (10 - 100) : "
                );

                int power = input.nextInt();

                int indeksMonster = pilihanTarget - 1;

                System.out.println(
                    "\n>>> HASIL SERANGAN <<<"
                );

                // cek monster masih hidup
                if (gelombangMonster[indeksMonster].healthpoint > 0) {

                    gelombangMonster[indeksMonster]
                        .terimaSerangan(power);

                } else {

                    System.out.println(
                        gelombangMonster[indeksMonster].namamusuh
                        + " sudah mati!"
                    );
                }
            }

            // monster menyerang balik  
            System.out.println("\n<<< GILIRAN MONSTER MEMBALAS >>>");

            int i = pilihanTarget - 1;

            if (gelombangMonster[i].healthpoint > 0) {

            // suara monster
            gelombangMonster[i].suaraMonster();

            // serangan monster
            gelombangMonster[i].serangPemain();

            } else {

                System.out.println(
                    gelombangMonster[i].namamusuh
                    + " sudah kalah dan tidak bisa menyerang."
                );
            }

            System.out.println("----------------------------------");
        }

        input.close();

        System.out.println(
            "\nGAME OVER! SEE YOU IN THE NEXT BATTLE!"
        );
    }
}