package application;

import java.io.*;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		//Escreve linhas em formato txt
		String path = "C:\\Arquivos\\Escrita\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			System.out.println("Foi escrito as linhas ");
			for (String line : lines) {                            /*FileWriter(path) - Create a new one and replace*/
				bw.write(line);                                    /*FileWriter(path,true) - Create a new one if you don't have it and add*/   
				bw.newLine();
			}
		}
		catch(IOException e) {
			System.out.println("Segue o erro reportado:");
			e.printStackTrace();
		}
	}  
}
