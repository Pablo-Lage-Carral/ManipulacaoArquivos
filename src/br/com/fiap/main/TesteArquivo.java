package br.com.fiap.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteArquivos {

	public static void main (String [] args){
		// TODO Auto-generated constructor stub
		
		
		//Class File pra leitura de arquivo
		File arquivo = new File("D:\\TesteArquivo\\Teste.txt");		
		Scanner leitor = null;
		
		try{
			// adicionar o arquivo para leitura na hora de instanciar
			leitor = new Scanner(arquivo);
			//Enquanto tiver linha havera continuidade na leitura
			while(leitor.hasNextLine()){
				System.out.println(leitor.nextLine());
			}
		} catch(IOException e){
			// TODO: handle exception
			System.out.println("Erro ao ler o arquivp -" + e.getMessage());
			
		} finally{
			if (leitor != null){
				leitor.close();
			}
		}
		
		
		
	}

}
