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
		 
		 public Ksiazka znajdz (String autor) {
			 
			  for (Ksiazka Autor : Ksiazki) {
			      if (Autor.getAutor().equals(autor)) {
		          return Autor;
		          }
			 }
		  return null;
		  }
		 
		 
		 public Gazeta szukaj (String tytul) {
			
			 for (Gazeta Tytul : Gazety) {
			 if (Tytul.getTytul().equals(tytul)) {
				 
			return Tytul;
		          }
			     }
			 return null;
		 		} 
		 
			 
		 public Gra pokaz (String nazwa) {
			 
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
			 
		     szukaj(tytul).getCena();
			 Gazety.set(Gazety.indexOf(szukaj(tytul)), new Gazeta(tytul, nowaCena));
			 szukaj(tytul).wypiszGazeta();
		 }
			 
		 
	     public void zmienKsiazke(String nowyTytul, String autor, String cena) {
			 
		     znajdz (autor).getTytul();
			 Ksiazki.set(Ksiazki.indexOf(znajdz (autor)), new Ksiazka(nowyTytul, autor, cena));
		     znajdz(autor).wypiszKsiazka();
	     }
		 

		 public void zmienGre(String nazwa, String nowaCena) {
			 
		     pokaz(nazwa).getCena();
			 Gry.set(Gry.indexOf(pokaz (nazwa)), new Gra(nazwa,  nowaCena));
			 pokaz(nazwa).wypiszGra();
		 }
		 
		 
			 
		 public void usunKsiazka(String autor) {
			 Ksiazki.remove(znajdz(autor));
			 
		 }
		 
		 
		public void usunGazeta(String tytul) {
			 Gazety.remove(szukaj(tytul));
		 }
		 
		
		public void usunGra(String nazwa) {
			 Gry.remove(pokaz(nazwa));
		 }
		
		
	}

		