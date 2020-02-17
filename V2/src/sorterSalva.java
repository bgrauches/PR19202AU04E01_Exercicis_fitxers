import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class sorterSalva {

	static ArrayList<String> lectura = new ArrayList<String>();
	
	static String paraula0;
	static String paraula1;
	
	//Metode per llegir arxiu 
	public static void llegirFile() throws IOException{
		String filePath = "C:\\Users\\Tomeu\\Desktop\\jocs.txt";
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(filePath));
			String linia;
			//Mentres hi hagi linies, afegeix linies
			while ((linia=bf.readLine()) != null) {

				lectura.add(linia);
			}
			bf.close();
		} catch (FileNotFoundException e) {
			System.out.println("No es troba el fitxer Videojoggos.txt");
		} catch (IOException e) {
			System.out.println("No se pot llegir Videojoggos.txt");
		}
	}
	
	public static void llegirArray() throws IOException {
		
		int size = lectura.size();
		
		for (int c1 = 0; c1 <= size; c1++) {
			
			paraula0 = lectura.get(c1);
			paraula1 = lectura.get(c1 + 1);
			
			 for (int i = 0; i < paraula0.length(); i++) { 
		            if (paraula0.charAt(i) < paraula1.charAt(i)) {
		            	break;
		            } else if (paraula0.charAt(i) > paraula1.charAt(i))  {
		            	lectura.add(c1, paraula1);
		            	lectura.remove(c1+1);
		            	lectura.add(c1 + 1, paraula0);
		            	lectura.remove(c1+2);
		            	
		            	break;
		            }
		        }
         	System.out.println(lectura);
         	escriureFile();
		}
		
	}
	
	public static void escriureFile() throws IOException{
		
		try {
			FileWriter writer = new FileWriter("C:\\\\Users\\\\Tomeu\\\\Desktop\\\\llistaOrdenada.txt");  
		    BufferedWriter bw = new BufferedWriter(writer); 
			
			for (int i = 0; i < lectura.size() ; i++) {
				bw.write(lectura.get(i) + "\n");
			}
			bw.close();
		} catch (IOException ioe) {
			System.out.println("No s'ha pogut escriure al fitxer llistaOrdenada.txt");
		}
	}
	
	public static void main(String[] args) throws IOException {

		System.out.println("Bienvenidos \n");
		
		llegirFile();
		
		System.out.println(lectura);
		System.out.println("\n");
		
		llegirArray();
		
		escriureFile();
		
	}

}
