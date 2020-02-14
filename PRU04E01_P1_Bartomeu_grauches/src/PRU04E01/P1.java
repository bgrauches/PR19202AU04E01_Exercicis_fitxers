package PRU04E01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P1 {
	
	//tenim llisat srings de entrada i que despres sortir� ordenat
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
	
	//Transformam a ASCII els car�cters de les posicions 0 de cada paraula, es plan es compararles
	static int ascii1; //= charParaula0[0];
	static int ascii2; //= charParaula1[0]; 
	
	//String on se guarda la paraula0 en cas de que sigui > a paraula1
	static String paraulaAux;


	//Per cambiar les posicions depenent de si ascii es menor o major
	public static void metodeGuay() {
		if (ascii2 < ascii1) {
			//guardam paraula0 a auxiliar pq no deletei
			paraulaAux = paraula0;
			
			//posam paraula1 a la posici� paraula0
			paraula0 = paraula1;
			
			//posar paraula0(paraulaAux) a la posici� paraula1
			paraula1 = paraulaAux;
		}
	
		else {
			System.out.println("Se queden on est�n");
		}
		
	}
	
	
	//Metode per llegir arxiu 
	public static void llegirFile() throws IOException{
	
		try {
			FileInputStream inputStr = new FileInputStream("C:\\Users\\bgrauches\\Desktop\\Videojoggos.txt");
			InputStreamReader inputRead = new InputStreamReader(inputStr);
			BufferedReader llegir = new BufferedReader(inputRead);
			String linia = llegir.readLine();
			while (linia != null) {
				jocs.add(llegir.readLine());
				System.out.println(linia);
				linia = llegir.readLine();
			}
			llegir.close();
		} 
		catch (FileNotFoundException a) {
			System.out.println("No es troba el fitxer Videojoggos.txt");
		}
		catch (IOException b) { 
			System.out.println("No es pot llegir Videojoggos.txt");
		}
	}
	
	//Metode per ordenar alfab�ticament
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
			FileOutputStream outpStr = new FileOutputStream("C:\\Users\\bgrauches\\Desktop\\LlistaOrdenada.txt");
			OutputStreamWriter outWrite = new OutputStreamWriter(outpStr); 
			
			for(int i = 0 ; i < jocs.size(); i++ ) {
				outWrite.write(llistaOrdenada.get(i)+"\n");
			}
			outWrite.close();
		}
		catch (FileNotFoundException a) {
			System.out.println("No es troba el fitxer LlistaOrdenada.txt");
		}
		
		catch(IOException e) { 
			System.out.println("No puc escriure en LlistaOrdenada.txt");
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
