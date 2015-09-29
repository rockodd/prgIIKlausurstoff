import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;


public class Doppelnamen {
HashSet<String> namen = new HashSet<String>();

public void checkUsernames() throws IOException{
	String name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter printwriter = new PrintWriter(new FileOutputStream("duplicates.log"));
	while((name = br.readLine())  != null){
		if (!namen.add(name)){
			printwriter.println(name);
			printwriter.flush();
			System.out.println("Doppelter Name in LogDatei geschriebn");
		}
		
	}
	printwriter.close();
}
public static void main(String[] args) throws IOException{
	Doppelnamen doppelnamen = new Doppelnamen();
	doppelnamen.checkUsernames();
}
}
