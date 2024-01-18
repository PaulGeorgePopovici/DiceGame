import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        int zar1;
        int zar2;
        int zar1Adversar;
        int zar2Adversat;

        int victoriileMele = 0;
        int victoriileAdversarului = 0;

        Scanner sc = new Scanner(System.in);

        Random generator = new Random();

        while (true) {
            System.out.println("Doriti sa jucati? Scorul tau: " + victoriileMele + " / Scorul adversarului: " + victoriileAdversarului);
            String raspuns = sc.nextLine();
            if (raspuns.equalsIgnoreCase("da")) {
                zar1 = generator.nextInt(6) + 1;
                zar2 = generator.nextInt(6) + 1;
                zar1Adversar = generator.nextInt(6) + 1;
                zar2Adversat = generator.nextInt(6) + 1;

                System.out.println("Ai dat: " + zar1 + " " + zar2);
                System.out.println("Oponentul a dat: " + zar1Adversar + " " + zar2Adversat);

                int scorulMeu = zar1 + zar2;
                int scorulAdversarului = zar1Adversar + zar2Adversat;

                if (scorulMeu > scorulAdversarului){
                    victoriileMele ++;
                    System.out.println("AI CASTIGAT!");
                }else if (scorulAdversarului > scorulMeu){
                    victoriileAdversarului ++;
                    System.out.println("AI PIERDUT!");
                }else {
                    System.out.println("REMIZA!");
                }

                if (victoriileMele == 6){
                    System.out.println("Ai castigat jocul!");
                    break;
                }else if (victoriileAdversarului == 6){
                    System.out.println("Ai pierdut jocul!");
                    break;
                }

            } else if (raspuns.equalsIgnoreCase("nu")) {
                System.out.println("Va mai asteptam pe la noi!");
                break;
            } else {
                System.out.println("Nu ai introdus un raspuns valabil! Introdu da sau nu!");
            }
        }

    }

}