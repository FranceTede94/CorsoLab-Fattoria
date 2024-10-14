package Animali;

public class Cane extends Animale{
	
	private String tipoAnimale;
	
	public Cane(String nom, String TipAnim) {
		super(nom);
		this.tipoAnimale = TipAnim;
		
	}

	public void emettiVerso() {
		System.out.println("fa Bau Bau");
	}
	
	public String toString() {
		return super.toString() + tipoAnimale;
	}


}
