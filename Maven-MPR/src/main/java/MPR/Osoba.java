package MPR;

import java.util.ArrayList;

import java.util.List;

public class Osoba {
	
	
		 String Imie;
		 String Nazwisko;
		 		 
		public List<Gazeta> Gazety = new ArrayList<Gazeta>();
		public List<Ksiazka> Ksiazki = new ArrayList<Ksiazka>();
		public List<Gra> Gry = new ArrayList<Gra>();
		
		 
		 
		 public Osoba (String imie, String nazwisko, List<Ksiazka> Ksiazki , List<Gazeta> Gazety, List<Gra> Gry ) {
			 
			 this.Imie = imie;
			 this.Nazwisko = nazwisko;
			 
			 this.Gazety = Gazety;
			 this.Ksiazki = Ksiazki;
			 this.Gry = Gry;
			  }
		 
 public Osoba (String imie, String nazwisko ) {
			 
			 this.Imie = imie;
			 this.Nazwisko = nazwisko;
			 	
 }
		 
public String getImie() {
	return Imie;
}

public void setImie(String imie) {
	Imie = imie;
}

public String getNazwisko() {
	return Nazwisko;
}

public void setNazwisko(String nazwisko) {
	Nazwisko = nazwisko;
}

		public void wypiszWszystko(){
			 
			 System.out.println(""); 
			 System.out.println("Książki :");
	         for (Ksiazka k : Ksiazki)
	                 k.wypiszKsiazka();
	         System.out.println(""); 
	        		 
	         System.out.println("Gazety i czasopisma :");
	    	 for (Gazeta G : Gazety)
	    	           G.wypiszGazeta();
	    	  System.out.println("");
			 
			 System.out.println("Gry:");
	         for (Gra g : Gry)
	                 g.wypiszGra();
	         System.out.println("" );
			 
			 
			 
		 }
		 public void dodajKsiazki(String tytul, String autor, String cena)  {
			 Ksiazki.add(new Ksiazka(tytul, autor, cena));
			
			 }
		 
		 public void dodajGazety(String tytul, String cena)  {
			 Gazety.add(new Gazeta(tytul, cena));
			
			 }
		 public void dodajGry(String nazwa, String cena)  {
			 Gry.add(new Gra(nazwa, cena));
			
			 }
		 
		 public Ksiazka znajdzKsiazke (String autor) {
			 
			  for (Ksiazka Autor : Ksiazki) {
			      if (Autor.getAutor().equals(autor)) {
		          return Autor;
		          }
			 }
		  return null;
		  }
		 
		 
		 public Gazeta znajdzGazete (String tytul) {
			
			 for (Gazeta Tytul : Gazety) {
			 if (Tytul.getTytul().equals(tytul)) {
				 
			return Tytul;
		          }
			     }
			 return null;
		 		} 
		 
			 
		 public Gra znajdzGre (String nazwa) {
			 
			 for (Gra Nazwa : Gry) {
			 if (Nazwa.getNazwa().equals(nazwa)) {
			 return Nazwa;
		                    }
			          }
			 return null;
			 }
		
		 public List<Ksiazka> SzukajAutora (String autor){
			 
			 List<Ksiazka> wyszukane = new ArrayList<Ksiazka>();
			    for (Ksiazka k : Ksiazki)
			      if(k.getAutor().equals(autor)){
			      k.wypiszKsiazka();
			    wyszukane.add(k);
			 
			 }
			 
			 return wyszukane ; 
			 
		}
		 
		 
						 
		 
		 public void zmienGazete(String tytul, String nowaCena) {
			 
		     znajdzGazete(tytul).getCena();
			 Gazety.set(Gazety.indexOf(znajdzGazete(tytul)), new Gazeta(tytul, nowaCena));
			 znajdzGazete(tytul).wypiszGazeta();
		 }
			 
		 
	     public void zmienKsiazke(String nowyTytul, String autor, String cena) {
			 
		     znajdzKsiazke (autor).getTytul();
			 Ksiazki.set(Ksiazki.indexOf(znajdzKsiazke (autor)), new Ksiazka(nowyTytul, autor, cena));
		     znajdzKsiazke(autor).wypiszKsiazka();
	     }
		 

		 public void zmienGre(String nazwa, String nowaCena) {
			 
		     znajdzGre(nazwa).getCena();
			 Gry.set(Gry.indexOf(znajdzGre (nazwa)), new Gra(nazwa,  nowaCena));
			 znajdzGre(nazwa).wypiszGra();
		 }

		 
		 
			 
		 public void usunKsiazka(String autor) {
			 Ksiazki.remove(znajdzKsiazke(autor));
			 
		 }
		 
		 
		public void usunGazeta(String tytul) {
			 Gazety.remove(znajdzGazete(tytul));
		 }
		 
		
		public void usunGra(String nazwa) {
			 Gry.remove(znajdzGre(nazwa));
		 }
		}
		
		
	

		