package MPR.Test;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MPR.Gazeta;
import MPR.Gra;
import MPR.Ksiazka;
import MPR.Osoba;

public class OsobaTest {
	
	 String Imie;
	 String Nazwisko;
	 
	 List<Gazeta> Gazety = new ArrayList<Gazeta>();
	 List<Ksiazka> Ksiazki = new ArrayList<Ksiazka>();
	 List<Gra> Gry = new ArrayList<Gra>();

	 	
	 Osoba Test = new Osoba("imie", "nazwisko", Ksiazki, Gazety, Gry);
	
			 		 
	 
	@Before
	public void setUp() throws Exception {
		
			 		 
		
		 Gazety.add(new Gazeta("gazeta1", "cena1"));
		 Gazety.add(new Gazeta("gazeta2", "cena2"));
		 Gazety.add(new Gazeta("gazeta3", "cena3"));
		 Gazety.add(new Gazeta("gazeta4", "cena4"));
		 
		 Ksiazki.add(new Ksiazka("ksiazka1","autor1","cena1"));
		 Ksiazki.add(new Ksiazka("ksiazka2","autor1","cena2"));
		 Ksiazki.add(new Ksiazka("ksiazka3","autor2","cena3"));
		 Ksiazki.add(new Ksiazka("ksiazka4","autor3","cena4"));
		 
		 Gry.add(new Gra("gra1", "cena1"));
		 Gry.add(new Gra("gra2", "cena2"));
		 Gry.add(new Gra("gra3", "cena3"));
		 Gry.add(new Gra("gra4", "cena4"));
		  
	}

	@After
	public void tearDown() throws Exception {
	} 

	@Test
	public void testOsoba() {
		
		Osoba Test1 = new Osoba("imie1", "nazwisko1", Ksiazki, Gazety, Gry);
		
		assertNotNull(Test);
		assertNotNull(Gazety);
		
		assertNotSame("imie", Test, Test1);
		assertNotSame("nazwisko",Test , Test1);
		assertEquals(Test.Ksiazki, Test1.Ksiazki);
		}

	
	@Test
	public void testDodajKsiazki() {
		 
		assertFalse(Ksiazki.size() == 1);
		assertTrue(Ksiazki.size() == 4);
		
	}

	@Test
	public void testDodajGazety() {
		
		assertFalse(Gazety.size() == 2);
		assertTrue(Gazety.size() == 4);
		
		
	}

	@Test
	public void testDodajGry() {
		
		assertFalse(Gry.size() == 0);
		assertTrue(Gry.size() == 4);
		
	}

	@Test
	public void testZnajdz() {
		
		assertNotNull(Test.znajdzKsiazke("autor2"));
		assertNull(Test.znajdzKsiazke("autor"));
	
	}
	@Test
	public void testSzukaj() {
		
		assertNotNull(Test.znajdzGazete("gazeta3"));
		assertNull(Test.znajdzGazete("gazeta"));
	}

	@Test
	public void testPokaz() {
		
		assertNotNull(Test.znajdzGre("gra1"));
		assertNull(Test.znajdzGre("gra"));
	}

	@Test
	public void testSzukajAutora() {	
			
		assertNotNull(Test.SzukajAutora("autor2"));
		assertTrue(Test.SzukajAutora("autor1").size()==2);
		assertFalse(Test.SzukajAutora("autor1").size()==5);
		
		
	}

	@Test
	public void testZmienGazete() {
		
		Test.zmienGazete("gazeta2", "cena02");
		
		assertNotNull(Test.znajdzGazete("gazeta2").getCena());
		assertTrue(Test.znajdzGazete("gazeta2").getCena().equals("cena02"));
		assertFalse(Test.znajdzGazete("gazeta2").getCena().equals("cena22"));
		
	}

	@Test
	public void testZmienKsiazke() {
		
		Test.zmienKsiazke("tytul04","autor3","cena4");
		
		assertNull(Test.znajdzKsiazke("autor5"));
		assertTrue(Test.znajdzKsiazke("autor3").getTytul().equals("tytul04"));
		assertFalse(Test.znajdzKsiazke("autor3").getTytul().equals("tytul44"));
		
		
	}

	@Test
	public void testZmienGre() {
		
                Test.zmienGre("gra1", "cena01");
		
		assertNotNull(Test.znajdzGre("gra1").getCena());
		assertTrue(Test.znajdzGre("gra1").getCena().equals("cena01"));
		assertFalse(Test.znajdzGre("gra1").getCena().equals("cena11"));
		
	}

	@Test
	public void testUsunKsiazka() {
		
		Test.usunKsiazka("autor3");
		
		assertNull(Test.znajdzKsiazke("autor3"));
		assertTrue(Ksiazki.size() == 3);
	}

	@Test
	public void testUsunGazeta() {
		
		Test.usunGazeta("gazeta1");
		
		assertNull(Test.znajdzGazete("gazeta1"));
		assertNotNull(Test.znajdzGazete("gazeta2"));
		assertTrue(Gazety.size() == 3);
		
	}

	@Test
	public void testUsunGra() {
		
		Test.usunGra("gra4");
		Test.usunGra("gra3");
		
		assertTrue(Gry.size() == 2);
		assertFalse(Gry.size() == 3);
		assertNull(Test.znajdzGre("gra3"));
		
	}

}
