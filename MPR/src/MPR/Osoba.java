package MPR;

import java.util.ArrayList;
import java.util.List;

public class Osoba {
	
	
		 String imie;
		 String nazwisko;
		 		 
		 List<Gazeta> Gazety = new ArrayList<Gazeta>();
		 List<Ksiazka> Ksiazki = new ArrayList<Ksiazka>();
		 List<Gra> Gry = new ArrayList<Gra>();
		 
		 public Osoba (String imie, String nazwisko, List<Ksiazka> Ksiazki , List<Gazeta> Gazety, List<Gra> Gry ) {
			 
			 this.imie = imie;
			 this.nazwisko = nazwisko;
			 
			 this.Gazety = Gazety;
			 this.Ksiazki = Ksiazki;
			 this.Gry = Gry;
			  }
		 
		 public void wypiszGazety() {
			 System.out.println("Gazety i czasopisma :");
	         for (Gazeta g : Gazety)
	                 g.wypiszGazeta();
	         System.out.println("");       
	 }
		
		 public void wypiszKsiazki() {
			 System.out.println("Klient  :" + imie + " " + nazwisko);
			 System.out.println(""); 
			 System.out.println("Książki :");
	         for (Ksiazka k : Ksiazki)
	                 k.wypiszKsiazka();
	         System.out.println(""); 
	}
		 
		 public void wypiszGry() {
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
			 
			 
			 for (Ksiazka g : Ksiazki) {
			 if (g.getAutor().equals(autor)) {
			 return g;
		                    }
			 
			          }
			 return znajdz (autor);
			 
			 }
		 
		 public void znajdzKiazki(String autor) {
				
			 System.out.println("Znaleziono ksiażke: " + znajdz(autor).getAutor()+ " znajduje się na pozycji : " + Ksiazki.indexOf(znajdz(autor)));
			 
		 }
		 
		 
		 
		 
		 public Gazeta szukaj (String tytul) {
			 for (Gazeta g : Gazety) {
			 if (g.getTytul().equals(tytul)) {
			 return g;
		                    }
			          }
			 return szukaj (tytul);
			 } 
		 
		 public void szukajGazety(String tytul) {
				
			 System.out.println("Znaleziono gazetę: " + szukaj(tytul).getTytul()+ " znajduje się na pozycji : " + Gazety.indexOf(szukaj(tytul)));
			 
		 }
		 
		 
		 public Gra pokaz (String nazwa) {
			 for (Gra g : Gry) {
			 if (g.getNazwa().equals(nazwa)) {
			 return g;
		                    }
			          }
			 return pokaz (nazwa);
			 }
		 
		 public void pokazGre(String nazwa) {
				
			 System.out.println("Znaleziono Grę : " + pokaz(nazwa).getNazwa()+ " znajduje się na pozycji : " + Gry.indexOf(pokaz(nazwa)));
			 
		 }
		 
		 public void zmienGazete(String tytul, String nowaCena) {
			 
		     szukaj(tytul).getCena();
			 Gazety.set(Gazety.indexOf(szukaj(tytul)), new Gazeta(tytul, nowaCena));
		 }
			 
		 
	     public void zmienKsiazke(String nowyTytul, String autor, String cena) {
			 
		     znajdz (autor).getTytul();
			 Ksiazki.set(Ksiazki.indexOf(znajdz (autor)), new Ksiazka(nowyTytul, autor, cena));
		 }
		 

		 public void zmienGre(String nazwa, String nowaCena) {
			 
		     pokaz (nazwa).getCena();
			 Gry.set(Gry.indexOf(pokaz (nazwa)), new Gra(nazwa,  nowaCena));
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

		