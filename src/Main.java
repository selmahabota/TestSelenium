import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //zadatak dvodimenzionalni niz sa dvije for petlje

        int[][] niz2d = new int[][]{
                {1, 2, 8},
                {3, 4, 10},
                {5, 6, 15}
        };
        System.out.println("Ispis dvodimenzionalnog niza :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(niz2d[i][j] + " ");
            }
            System.out.println();
        }

        //zadatak jednodimenzionalni niz ispis najveceg clana i sortiranje

        int[] niz = new int[]{2, 5, 1, 3, 4};
        int max = niz[0];
        System.out.println("Niz prije sortiranja:");

        for (int l : niz) {
            System.out.print(l + " ");
        }
        System.out.println();

        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        System.out.println("Najveci broj je " + (max));

        for (int i = 1; i < niz.length; i++) {
            int tmp = niz[i];
            int j = i - 1;
            while (j >= 0 && niz[j] > tmp) {
                niz[j + 1] = niz[j];
                j = j - 1;
            }
            niz[j + 1] = tmp;
        }

        System.out.println("Niz poslije sortiranja: ");
        for (int k : niz) {
            System.out.print(k + " ");
        }
        System.out.println();
        Random rand = new Random();

        //zadatak random broj odgovara li unesenom broju (vjezba 17)
        System.out.println("Koji broj sam zamislio?");
        int broj;
        int zamisljeniBroj;
        Scanner scanner = new Scanner(System.in);
        do {
            zamisljeniBroj = rand.nextInt(3);
            System.out.print("Unesi broj: ");
            broj = scanner.nextInt();
            if (broj == zamisljeniBroj) {
                System.out.println("Jeste!");
            } else System.out.println("Nije!");
        } while (broj != zamisljeniBroj);

        //zadatak generisanja kombinacija (vjezba 18)
        String [] nizStringova= new String[]{"Heart", "Cherry", "Coin", "Melon", "Jocker"};
        List<String> listaStringova= Arrays.asList(nizStringova);
        Collections.shuffle(listaStringova);
        listaStringova.toArray(nizStringova);
        for (String s:nizStringova) {
            System.out.print(s+" ");
        }
        System.out.println();

        //Kreiranje tri niza (vjezba 19)

        String [] pojmovi=new String[]{"bicikl", "automobil", "mobilnog telefon"};
        String [] nazivi=new String[]{"BMX","Audi","Iphone"};
        double [] cijene=new double[] {200,50000,3500};
        for (int i=0;i<3;i++)
        {
            System.out.println(nazivi[i]+" je tip "+pojmovi[i]+"a i kosta "+ cijene[i]);

            }
        }

}

