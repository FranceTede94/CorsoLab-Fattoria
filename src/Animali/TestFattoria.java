package Animali;

public class TestFattoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animale ciccio = new Gatto("Pallina", "gatto");
		System.out.println(ciccio);
		
		ciccio.emettiVerso();
		
		
		ciccio = new Cane("Luna", "cane");
		System.out.println(ciccio);
		ciccio.emettiVerso();
		
		ciccio = new Gatto("Jack", "gatto");
		System.out.println(ciccio);
		ciccio.emettiVerso();
		
		
	}
	

}
