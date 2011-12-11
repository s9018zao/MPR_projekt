package MPR;


public class Gazeta {
	
	String tytul;
	String cena;

	public Gazeta(String tytul, String cena) {
		
	this.tytul = tytul;
	this.cena = cena;
	}

	public void wypiszGazeta() {
	System.out.println("Nazwa: " + this.tytul + "\nCena: " + this.cena);
	}
    
	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}



}
