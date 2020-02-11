package PRU04E01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class P1 {
	
	static ArrayList<String> jocs = new ArrayList<String>(); 
	static ArrayList<Byte> abecedari = new ArrayList<Byte>();
	
	
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
		catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer Videojoggos.txt");
		}
		catch (IOException f) { 
			System.out.println("No es pot llegir fruita.txt");
		}
	
	}
	
	//Metode per ordenar alfabèticament
	public void ordenarAlf() {
		<String>.tocharArray();
		
	}
	

	public static void main(String[] args) throws IOException {
			
			llegirFile();
	}
}
