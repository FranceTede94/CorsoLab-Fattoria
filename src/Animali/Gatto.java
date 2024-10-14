package Animali;

public class Gatto extends Animale {
	
	private String tipoAnimale;
	
	public Gatto(String nom, String tipoAnim) {
		super(nom);
		this.tipoAnimale = tipoAnim;
		
	}

	public void emettiVerso() {
		System.out.println("fa Miao");
	}

	
	public String toString() {
		return super.toString() + tipoAnimale;
	}

}
