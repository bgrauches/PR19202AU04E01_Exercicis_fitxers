package PRU04E01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class P1 {
	
	//tenim llisat srings de entrada i que despres sortirá ordenat
	static ArrayList<String> jocs = new ArrayList<String>(); 
	static ArrayList<String> llistaOrdenada = new ArrayList<String>(); 
	
	//contadors de l'array
	static int contadorJocs1;
	static int contadorJocs2;
	
	//Pillam paraules de les posicions 0 i 1 de l'array d'entrada
	static String paraula0;
	static String paraula1;
	
	//Feim array de les lletres que formen la paraula
	static char[] charParaula0; //= paraula0.toCharArray(); //tira excepcion
	static char[] charParaula1; //= paraula1.toCharArray();
	
	//Transformam a ASCII els caràcters de les posicions 0 de cada paraula, es plan es compararles
	static int ascii1; //= charParaula0[0];
	static int ascii2; //= charParaula1[0]; 
	
	//String on se guarda la paraula0 en cas de que sigui > a paraula1
	static String paraulaAux;


	//Per cambiar les posicions depenent de si ascii es menor o major
	public static void metodeGuay() {
		
		//FALTA QUE SE FIQUIN ESLS STRINGS ORDENATS A LLISTAORDENADA
		
		
		
		
		if (ascii2 < ascii1) {
			//guardam paraula0 a auxiliar pq no deletei
			paraulaAux = paraula0;
			
			//posam paraula1 a la posició paraula0
			paraula0 = paraula1;
			
			//posar paraula0(paraulaAux) a la posició paraula1
			paraula1 = paraulaAux;
		}
	
		else {
			System.out.println("Se queden on están");
		}
		
	}
	
	
	//Metode per llegir arxiu 
	public static void llegirFile() throws IOException{
		String filePath = "C:\\Users\\bgrauches\\Desktop\\Videojoggos.txt";
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(filePath));
			String linia = "";
			while (linia != null) {
				System.out.println(linia);
				linia = bf.readLine();
			}
			bf.close();
		} catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer Videojoggos.txt");
		} catch (IOException e) {
			System.out.println("No se pot llegir Videojoggos.txt");
		}
	}
	
	//Metode per ordenar alfabèticament
	public static void ordenarAlf() {
		
		//comprova array jocs
		for (contadorJocs1 = 0; contadorJocs1 < jocs.size() - 1; contadorJocs1++) {
			
			//comprova chars
			for (contadorJocs2 = 0; contadorJocs2 < jocs.size() - contadorJocs2 - 1; contadorJocs2++) {
				paraula0 = jocs.get(contadorJocs1);
				  paraula1 = jocs.get(contadorJocs2);
				//metodeguay
				metodeGuay();
			}
		}
		
			
		
	}
	
	//Metode per escriure les paraules ordenades a un altre arxiu
	public static void escriureFie() throws IOException{
	
		try {
			BufferedWriter bw = new BufferedWriter (new FileWriter("C:\\Users\\bgrauches\\Desktop\\LlistaOrdenada.txt"));
			for (int i = 0; i < llistaOrdenada.size() ; i++) {
				System.out.println(llistaOrdenada.size());
				System.out.println(llistaOrdenada.get(i));
				bw.write(llistaOrdenada.get(i));
			}
		} catch (IOException ioe) {
			System.out.println("No s'ha pogut escriure al fitxer llistaOrdenada.txt");
		}
	}
			

	public static void main(String[] args) throws IOException {
			llegirFile();
			System.out.println(jocs);
			ordenarAlf();
			escriureFie();
			System.out.println(llistaOrdenada);
	}
}
