package masodikora;

import java.util.Random;
import java.util.Scanner;

public class MasodikOra {

    public static void main(String[] args) {
        /*      
        Scanner beolvasSzam = new Scanner(System.in);
        int szam = beolvasSzam.nextInt();
        int szam2 = beolvasSzam.nextInt();

        Scanner beolvasSzoveg = new Scanner(System.in);
        String szoveg = beolvasSzoveg.nextLine();
        
        System.out.println(szam + szoveg);
        
       int [] tomb = new int [5];
      
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("Add meg a %d. elemet:", i+1);
            tomb[i] = beolvasSzam.nextInt();
        }
        
            for (int elem : tomb) {
                System.out.println(elem);
            }
         */
        int randomSzam = (int) (Math.random() * 10 + 10);
        System.out.println(randomSzam);

        Random rnd = new Random();
        System.out.println(rnd.nextInt(0, 1));

        int[] tomb = new int[100];

        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = rnd.nextInt(0, 100);
        }

        for (int elem : tomb) {
            System.out.print(elem + ",");
        }
        System.out.println("");
        //Töltsünk fel egy 50 elemű tömböt random számokkal.
        //Számoljuk ki a számok átlagát!

        int tomb2[] = new int[50];
        for (int i = 0; i < tomb2.length; i++) {
            tomb2[i] = rnd.nextInt(0, 100);
        }
        int hossz = tomb2.length;

        int osszeg = 0;
        for (int i = 0; i < tomb2.length; i++) {
            osszeg += tomb2[i];
        }

        osszeg = 0;
        for (int elem : tomb2) {
            osszeg += elem;
        }

        double atlag = (double) osszeg / hossz;
        System.out.printf("A számok átlaga %.2f\n:", atlag);

        //Kérjünk be 5 számot a felhasználótól, és adjuk értékül
        //egy 5 elemű tömb elemeinek
        //Adjuk meg, melyik a legkisebb és melyik a legnagyobb szám
        
        int tomb3[] = new int[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < tomb3.length; i++) {
            tomb3[i] = scn.nextInt();
        }

        int legkisebb = tomb3[0];
        int legnagyobb = tomb3[0];

        for (int elem : tomb3) {
            if (elem > legnagyobb) legnagyobb = elem;
            if (elem < legkisebb) legkisebb = elem;
        }
            System.out.printf("A legnagyobb elemünk: %d, a legkisebb: %d\n", legnagyobb, legkisebb);

    

    //Hozzunk létre egy tömböt, és már létrehozáskor tegyünk bele
    //5db általunk választott számot. Majd ellenőrizzükle, hogy
    //a tömb tartalmazza-e a 10-es számot. Ha igen, melyik indexen
        
    int tomb4[] = {12,13,14,15,16};
            int i = 0;
            while (i < tomb4.length && tomb4[i] != 10) {            
            ++i;
        }
    
        if (i < tomb4.length) {
            System.out.printf("Van a tömbben 10, a %d. indexen. \n", i);
        } else {
            System.out.printf("Nincs a tömbben 10 ");
        }

        int [] [] ketdimenzio
            
        }
        
        
    }

    
//video2:08.perc

