package Animali;

public class Animale {
	
		private String nome;
			
		public Animale(String nom) {
			this.nome = nom;
		}
	
		public void emettiVerso() {
		
		System.out.println("Che verso fa?");
		
		}
	
		public String toString() {
			
			return "L'animale si chiama " + nome + " ed è un ";
		}
	
	
}
