package br.edu.ifsp.spo.lp1a3.sp3013049.cap4;

public class Decrypter {
	
	private int primeiroDig, segundoDig, terceiroDig, quartoDig;
	
	public Decrypter (int numero) {
		
		this.primeiroDig = numero/1000;
		this.quartoDig = numero%10;
		numero = numero/10;
		this.terceiroDig = numero%10;
		numero = numero/10;
		this.segundoDig = numero%10;
		
	}
	
	public void descriptografar() {
		
		desinverter();
		antiModSoma();
		
		System.out.print("Senha Descriptografada: "+primeiroDig);
		System.out.print(segundoDig);
		System.out.print(terceiroDig);
		System.out.println(quartoDig);
		
	}
	
	private void antiModSoma() {
		
		if (primeiroDig >= 7) {
			primeiroDig = primeiroDig-7;
		}
		else {
			primeiroDig = primeiroDig+10-7;
		}
		
		if (segundoDig >= 7) {
			segundoDig = segundoDig-7;
		}
		else {
			segundoDig = segundoDig+10-7;
		}
		
		if (terceiroDig >= 7) {
			terceiroDig = terceiroDig-7;
		}
		else {
			terceiroDig = terceiroDig+10-7;
		}
		
		if (quartoDig >= 7) {
			quartoDig = quartoDig-7;
		}
		else {
			quartoDig = quartoDig+10-7;
		}
		
	}
	
	private void desinverter() {
		
		int temp = terceiroDig;
		terceiroDig = primeiroDig;
		primeiroDig = temp;
		temp = quartoDig;
		quartoDig = segundoDig;
		segundoDig = temp;
		
	}
	
}