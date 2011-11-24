package MPR;

import java.util.ArrayList;
import java.util.List;

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
	 pierwsza.dodajKsiazki("Ferdydurke","Gombrowicz", "53.00");
	 pierwsza.dodajKsiazki("Fabryka oficerów","Kirst", "37.00");
	 pierwsza.dodajKsiazki("Czas pogardy","Sapkowski", "33.00");
	 
	 pierwsza.dodajGry("Europa Universalis III", "59.00");
	 pierwsza.dodajGry("Fifa 2011", "79.00");
	 pierwsza.dodajGry("Civilization V", "109.00");
	 pierwsza.dodajGry("Call of Duty", "59.00");
	 
	 
	 pierwsza.wypiszKsiazki();
     pierwsza.wypiszGazety();
     pierwsza.wypiszGry();
     
     pierwsza.znajdzKiazki("Sienkiewicz");
     pierwsza.szukajGazety("Polityka");
     pierwsza.pokazGre("Fifa 2011");
     
     pierwsza.usunKsiazka("Sienkiewicz");
     pierwsza.usunGazeta("Polityka");
     pierwsza.usunGra("Call of Duty");
     
     System.out.println("*********************************");
    		 
     pierwsza.wypiszKsiazki();
     pierwsza.wypiszGazety();
     pierwsza.wypiszGry();
     
     
     pierwsza.zmienGazete("Wprost", "4.00");
     pierwsza.wypiszGazety();
     
     pierwsza.zmienKsiazke("Krew elfów", "Sapkowski", "33.00");
     pierwsza.wypiszKsiazki();
     
     pierwsza.zmienGre("Fifa 2011", "59.00");
     pierwsza.wypiszGry();
}
}


