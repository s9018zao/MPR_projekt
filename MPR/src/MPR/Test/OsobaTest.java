package MPR.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import MPR.Gazeta;
import MPR.Gra;
import MPR.Ksiazka;
import MPR.Osoba;

public class OsobaTest {
	
	 String imie;
	 String nazwisko;
	 		 
	 private static List<Gazeta> Gazety = new ArrayList<Gazeta>();
	 private static List<Ksiazka> Ksiazki = new ArrayList<Ksiazka>();
	 private static List<Gra> Gry = new ArrayList<Gra>();
	
	 
	
	private static Osoba nowa = new Osoba("Adam", "Adamski", Ksiazki, Gazety, Gry);
	// Osoba nowa = new Osoba("Jan", "Jankowski", Ksiazki , Gazety, Gry);
	 
		

	@Test
	public void testOsoba() {
		
		assertTrue("nie dodalo osoby" + nowa.getimie().equals("Adam"));
		
		
		fail("Not yet implemented");
	}

	@Test
	public void testWypiszGazety() {
		fail("Not yet implemented");
	}

	@Test
	public void testWypiszKsiazki() {
		fail("Not yet implemented");
	}

	@Test
	public void testWypiszGry() {
		fail("Not yet implemented");
	}

	@Test
	public void testDodajKsiazki() {
		fail("Not yet implemented");
	}

	@Test
	public void testDodajGazety() {
		fail("Not yet implemented");
	}

	@Test
	public void testDodajGry() {
		fail("Not yet implemented");
	}

	@Test
	public void testZnajdz() {
		fail("Not yet implemented");
	}

	@Test
	public void testSzukaj() {
		fail("Not yet implemented");
	}

	@Test
	public void testPokaz() {
		fail("Not yet implemented");
	}

	@Test
	public void testSzukajAutora() {
		fail("Not yet implemented");
	}

	@Test
	public void testZmienGazete() {
		fail("Not yet implemented");
	}

	@Test
	public void testZmienKsiazke() {
		fail("Not yet implemented");
	}

	@Test
	public void testZmienGre() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunKsiazka() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunGazeta() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunGra() {
		fail("Not yet implemented");
	}

}
