import java.util.Scanner;
import java.util.Arrays;

public class organigrama {
	public static void main (String[] args) {
	
		String [][] plant = { {"1025","Angel","0","0"},
						{"1066","Victor","2","1749"},
						{"1077","Samuel","1","1025"},
						{"1088","Raul","3","1861"},
						{"1106","Hugo","3","1517"},
						{"1125","Oliver","4","1873"},
						{"1193","Sofia","4","1217"},
						{"1207","Fatima","3","1319"},
						{"1217","Flora","3","1861"},
						{"1238","Verena","3","1912"},
						{"1249","Zigor","3","1298"},
						{"1258","Helena","3","1912"},
						{"1283","Diana","2","1425"},
						{"1296","Lluc","4","1918"},
						{"1298","Ines","2","1749"},
						{"1319","Teresa","2","1077"},
						{"1325","Ismael","2","1749"},
						{"1329","Bruno","3","1066"},
						{"1394","Jairo","3","1517"},
						{"1396","Walter","3","1534"},
						{"1422","Diego","3","1319"},
						{"1425","Carla","1","1025"},
						{"1443","Hector","3","1325"},
						{"1465","Tomas","3","1283"},
						{"1489","Noelia","3","1283"},
						{"1517","Yago","2","1077"},
						{"1534","Olga","2","1425"},
						{"1551","Javier","3","1861"},
						{"1555","Gisela","3","1517"},
						{"1564","Karla","3","1298"},
						{"1577","Tania","4","1564"},
						{"1591","Nerea","4","1873"},
						{"1634","Kevin","3","1912"},
						{"1635","Ivan","3","1517"},
						{"1743","Ainhoa","3","1066"},
						{"1747","Ximena","3","1325"},
						{"1749","Belen","1","1025"},
						{"1787","Patricia","4","1465"},
						{"1817","Pablo","3","1283"},
						{"1821","Martin","4","1555"},
						{"1861","Ursula","2","1425"},
						{"1869","Runivelben","4","1634"},
						{"1873","Nicolas","3","1298"},
						{"1912","Luciano","2","1425"},
						{"1918","Eloy","3","1319"},
						{"1947","Paula","3","1534"},
						{"1962","Kaira","4","1918"},
						{"1973","Quico","4","1465"},
						{"1986","Carmen","3","1066"},
						{"1997","Oscar","3","1861"}};		
		
		Scanner sc = new Scanner (System.in);

		String numero;
		String nivel;
		String numjefe;
		
		System.out.print("Dime el número del empleado: ");
		numero = sc.nextLine();
		System.out.print("Dime el nivel del jefe: ");
		nivel = sc.nextLine();

		numjefe = buscaJefe(plant, numero, nivel);
		
		System.out.println("El numero del jefe es: " + numjefe);
		System.out.println("El nombre del empleado es: " + plant[buscar(plant,numero)][1]);
		System.out.println("El nombre del jefe es: " + plant[buscar(plant,numjefe)][1]);

		sc.close();
	}

    public static int buscar(String [][] plant, String numero) {
        int temp = -1;  
        
	    for (int i = 0; i < plant.length; i++ ){
	    	if (numero.equals(plant[i][0])) {
                temp = i;
            } 
	    }
	    return temp;
	}

    public static String buscaJefe (String [][] plant, String numero, String nivel){

		int empleado;
		String numjefe;
		String niveljefe;

		empleado = buscar(plant, numero);
		numjefe = plant[empleado][3];

		niveljefe = plant[buscar(plant, numjefe)][2];

		if (!niveljefe.equals(nivel)){
            numjefe = buscaJefe(plant, numjefe, nivel);  
        } 
		return numjefe;
	}
}
