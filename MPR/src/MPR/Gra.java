package MPR;

public class Gra {
	
	String nazwa;
	String cena;

	public Gra(String nazwa, String cena) {
		
	this.nazwa = nazwa;
	this.cena = cena;
	}

	public void wypiszGra() {
	System.out.println("Nazwa: " + nazwa + "\nCena: " + cena);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}
}
