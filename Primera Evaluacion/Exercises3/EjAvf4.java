import java.util.Scanner;

public class EjAvf4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int insectos = 6;
        int aracnidos = 8;
        int crustaceos = 10;
        int ciempies = 100;
        int milpies = 1000;
        int numi, numa, numc, numci, numm;
        int pti, pta, ptc, ptci, ptm;

        System.out.println("insectos = ");
        numi = sc.nextInt();
        System.out.println("aracnidos = ");
        numa = sc.nextInt();
        System.out.println("crustaceos = ");
        numc = sc.nextInt();
        System.out.println("ciempies = ");
        numci = sc.nextInt();
        System.out.println("milpies = ");
        numm = sc.nextInt();

        pti = insectos * numi;
        pta = aracnidos * numa;
        ptc = crustaceos * numc;
        ptci = ciempies * numci;
        ptm = milpies * numm;
        
        System.out.println(" Las patas totales son " + (pti + pta + ptc + ptci + ptm));


    }
}