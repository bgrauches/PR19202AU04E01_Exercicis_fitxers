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
	
	static ArrayList<String> jocs = new ArrayList<String>(); 
	int palabra;
	int palabraComp;
	int aux;
	
	
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
	public void ordenarAlf(int [] A) {
		for (palabra = 0; palabra < jocs.size()-palabra-1; palabraComp++) {
			for (palabraComp = 0; palabraComp<jocs.size()-palabra-1; palabraComp ++) {
				if (jocs [palabraComp +1] <jocs [palabraComp]) {
					aux = A [palabraComp+1];
					jocs [palabraComp +1] = jocs [palabraComp];
					jocs [palabraComp] = aux;
				}
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
