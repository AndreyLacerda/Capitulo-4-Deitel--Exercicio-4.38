package br.edu.ifsp.spo.lp1a3.sp3013049.cap4;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		System.out.print("Insira o número para criptografar: ");
		Scanner scan = new Scanner(System.in);
		int senha = scan.nextInt();
		
		Encrypter crip = new Encrypter(senha); 
		crip.criptografar();
		
		System.out.print("Insira o número para descriptografar: ");
		int senhaCriptografada = scan.nextInt();
		
		Decrypter descrip = new Decrypter(senhaCriptografada);
		descrip.descriptografar();
		
	}

}
