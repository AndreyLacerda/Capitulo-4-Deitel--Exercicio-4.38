package br.edu.ifsp.spo.lp1a3.sp3013049.cap4;

public class Encrypter {
	
	private int primeiroDig, segundoDig, terceiroDig, quartoDig;
	
	public Encrypter (int numero) {
		
		this.primeiroDig = numero/1000;
		this.quartoDig = numero%10;
		numero = numero/10;
		this.terceiroDig = numero%10;
		numero = numero/10;
		this.segundoDig = numero%10;
		
	}
	
	public void criptografar() {
		
		soma7();
		mod10();
		inverter();
		System.out.print("Senha Criptografada: "+primeiroDig);
		System.out.print(segundoDig);
		System.out.print(terceiroDig);
		System.out.println(quartoDig);
		
	}
	
	private void soma7() {

		primeiroDig += 7;
		segundoDig += 7;
		terceiroDig += 7;
		quartoDig += 7;
		
	}
	
	private void mod10() {
		
		primeiroDig %= 10;
		segundoDig %= 10;
		terceiroDig %= 10;
		quartoDig %= 10;
		
	}
	
	private void inverter() {
		
		int temp = terceiroDig;
		terceiroDig = primeiroDig;
		primeiroDig = temp;
		temp = quartoDig;
		quartoDig = segundoDig;
		segundoDig = temp;
		
	}

}