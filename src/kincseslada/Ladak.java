package kincseslada;

import java.util.Scanner;

public class Ladak {

    String[] szin = {"aranyláda", "ezüstláda", "bronzláda"};
    String[] mondas = {"Bennem van a kincs.", "Nem bennem van a kincs.", "Az arany láda hazudik."};
    int melyikSzin;

    void kiir() {
        for (int i = 0; i < szin.length; i++) {
            System.out.println(" ---------");
            System.out.println("|" + szin[i] + "|: " + mondas[i]);
            System.out.println(" ---------");
        }
    }

    void kerdes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik színű ládában van a kincs (arany(1)/ezüst(2)/bronz(3))? ");
        melyikSzin = sc.nextInt();
    }

    void eldont() {
        switch (melyikSzin) {
            case 1:
                System.out.println("Nem találtad el, nem az arany ládában van a kincs!");
                break;
            case 2:
                System.out.println("Eltaláltad, az ezüst ládában van a kincs!");
                break;
            case 3:
                System.out.println("Nem találtad el, nem a bronz ládában van a kincs!");
                break;
            default:
                break;
        }
    }
}
