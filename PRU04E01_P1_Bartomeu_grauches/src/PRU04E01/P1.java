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
	
	//tenim llisat srings de entrada i que despres sortirá ordenat
	static ArrayList<String> jocs = new ArrayList<String>(); 
	static ArrayList<String> llistaOrdenada = new ArrayList<String>(); 
	
	//Pillam paraules de les posicions 0 i 1 de l'array d'entrada
	static String paraula0 = jocs.get(0);
	static String paraula1 = jocs.get(1);
	
	//Feim array de les lletres que formen la paraula
	static char[] charParaula0 = paraula0.toCharArray();
	static char[] charParaula1 = paraula1.toCharArray();
	
	//Transformam a ASCII els caràcters de les posicions 0 de cada paraula, es plan es compararles
	static int ascii1 = charParaula0[0];
	static int ascii2 = charParaula1[0]; 
	
	//String on se guarda la paraula0 en cas de que sigui > a paraula1
	static String paraulaAux;
	
	static char newChar1 = (char) ascii1;
	static char newChar2 = (char) ascii2;

	//Per cambiar les posicions depenent de si ascii es menor o major
	public static void metodeGuay() {
		if (ascii1 > ascii2) {
			ascii1 = char1.se
		}
		else {
		
		}
	}
	
	
	//Metode per llegir arxiu 
	public static void llegirFile() throws IOException{
	
		try {
			FileInputStream inputStr = new FileInputStream("C:\\Users\\bgrauches\\Desktop\\Videojoggos.txt");
			InputStreamReader inputRead = new InputStreamReader(inputStr);
			BufferedReader llegir = new BufferedReader(inputRead);
			String linia = "";
			while (linia != null) {
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
	
	//Metode per ordenar alfabèticament
	public void ordenarAlf(int [] jocs) {
		int tam = jocs.length;
		
		//comprova array jocs
		for (paraula0. = 0; paraula0 < tam - 1; ascii1++) {
			
			//comprova chars
			for (ascii2 = 0; ascii2 < tam - ascii2 - 1; ascii2++) {
				
			}
		}
		
			
		
	}
	
	//Metode per escriure les paraules ordenades a un altre arxiu
	public void escriureFie() throws IOException{
		
		try {
			FileOutputStream outpStr = new FileOutputStream("C:\\Users\\bgrauches\\Desktop\\LlistaOrdenada.txt");
			OutputStreamWriter outWrite = new OutputStreamWriter(outpStr); 
			
			for(int i = 0 ; i < jocs.size(); i++ ) {
				outWrite.write(jocs.get(i)+"\n");
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
	}
}
