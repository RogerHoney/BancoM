package sistema;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestaSaida {

	public static void main(String[] args) throws IOException{
		OutputStream os = new FileOutputStream("arquivo.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		Scanner sc = new Scanner(System.in);
		String texto;
		System.out.println("Digite um texto: ");
		texto = sc.nextLine();
		bw.write(texto);
		bw.newLine();
		bw.close();
	}

}
