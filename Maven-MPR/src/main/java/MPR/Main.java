package MPR;

import java.util.ArrayList;
import java.util.List;

import ServicesProjectMPR.KsiazkaDBM;
import ServicesProjectMPR.OsobaDBM;



public class Main  {

	public static void main(String[] args) {
	
	List<Gazeta> Gazety = new ArrayList<Gazeta>();
	List<Ksiazka> Ksiazki = new ArrayList<Ksiazka>();
	List<Gra> Gry = new ArrayList<Gra>();	
	
	 Osoba pierwsza = new Osoba("Jan", "Kowalski", Ksiazki , Gazety, Gry);
	
	 pierwsza.dodajGazety("Rzeczpospolita", "2.00");
	 pierwsza.dodajGazety("Wyborcza", "2.50");
	 pierwsza.dodajGazety("Wprost", "3.60"); 
	 pierwsza.dodajGazety("Polityka", "4.00");
	 
	 pierwsza.dodajKsiazki("Potop","Sienkiewicz", "39.00");
	 pierwsza.dodajKsiazki("Ogniem i meczem","Sienkiewicz", "53.00");
	 pierwsza.dodajKsiazki("Fabryka oficerów","Kirst", "37.00");
	 pierwsza.dodajKsiazki("Czas pogardy","Sapkowski", "33.00");
	 
	 pierwsza.dodajGry("Europa Universalis III", "59.00");
	 pierwsza.dodajGry("Fifa 2011", "79.00");
	 pierwsza.dodajGry("Civilization V", "109.00");
	 pierwsza.dodajGry("Call of Duty", "59.00");	 
	 
	 pierwsza.wypiszWszystko();
     
	 System.out.println("**********Wypisanie list po usunięciu elementów**********");
     pierwsza.znajdzKsiazke("Kirst");
     pierwsza.znajdzGazete("Polityka");
     pierwsza.usunGra("Call of Duty");
     pierwsza.znajdzGre("Call of Duty");
    		 
     pierwsza.wypiszWszystko();
     
     System.out.println("**************Zmiana ceny gazety***********");    
     pierwsza.zmienGazete("Wprost", "4.00");
     System.out.println("********Zmiana tytułu książki************");
     pierwsza.zmienKsiazke("Krew elfów", "Sapkowski", "33.00");
     System.out.println("*********Zmiana tytułu gry***************");
     pierwsza.zmienGre("Fifa 2011", "59.00");
     System.out.println("***Wyszukanie więcej niż jednej książki danego autora****");
     pierwsza.SzukajAutora("Sienkiewicz");
     
     
     

/*---------------------------------------------------------------------------------
|                          JDBM                                                     |
-----------------------------------------------------------------------------------*/
	
	System.out.println(" ******************JDBC********************* ");
	
	
	
	OsobaDBM czlowiek = new OsobaDBM();
	KsiazkaDBM  Kniga = new KsiazkaDBM ();
	Kniga.UsunWszystkieKsiazki();
	czlowiek.UsunWszystkieOsoby();
	
    Osoba pierwszy = new Osoba ("Bogdan", "Wisniewski");
	czlowiek.DodajOsobe(pierwszy);
	Osoba drugi = new Osoba ("Andrzej", "Kancik");
	czlowiek.DodajOsobe(drugi);
	
	Ksiazka ksiazka1 = new Ksiazka ("Katar", "Lem", "25,00");
	Kniga.DodajKsiazke(ksiazka1, czlowiek.ZnajdzOsobe("Wisniewski"));
	Ksiazka ksiazka2 = new Ksiazka("Ptasiek", "Wharton", "19,00");
	Kniga.DodajKsiazke(ksiazka2, czlowiek.ZnajdzOsobe("Wisniewski"));
	Ksiazka ksiazka3 = new Ksiazka ("2 Wieze", "Tolkien", "49,00");
	Kniga.DodajKsiazke(ksiazka3 ,czlowiek.ZnajdzOsobe("Wisniewski"));
	
	}	
	
}



