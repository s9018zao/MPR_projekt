package MPR;

public class Ksiazka {
	
		String tytul;
		String autor;
		String cena;

		public Ksiazka(String tytul, String autor, String cena) {
			
		this.tytul = tytul;
		this.autor = autor;
		this.cena = cena;
		}

		public void wypiszKsiazka() {
		System.out.println("Nazwa: " + this.tytul + "\nAutor : " + this.autor + "\nCena: " + this.cena);
		}

		public String getTytul() {
			return tytul;
		}

		public void setTytul(String tytul) {
			this.tytul = tytul;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getCena() {
			return cena;
		}

		public void setCena(String cena) {
			this.cena = cena;
		}

		


}
