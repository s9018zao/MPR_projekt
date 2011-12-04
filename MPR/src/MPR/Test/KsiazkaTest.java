package MPR.Test;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MPR.Ksiazka;

public class KsiazkaTest {
	
    private Ksiazka Test = new Ksiazka("tytul","autor", "cena");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKsiazka() {
		
		assertTrue(Test.getTytul().equals("tytul"));
		assertTrue(Test.getAutor().equals("autor"));
		assertEquals(Test.getCena(), "cena");
	}

	@Test
	public void testGetTytul() {
		
		assertSame(Test.getTytul(), "tytul");
	}

	@Test
	public void testSetTytul() {
		
		Test.setTytul("tytul1");
        assertTrue(Test.getTytul().equals("tytul1"));
	}
	
	@Test
	public void testGetAutor() {
		
		assertSame(Test.getAutor(), "autor");
	}

	@Test
	public void testSetAutor() {
		
		Test.setTytul("autor1");
        assertTrue(Test.getTytul().equals("autor1"));
	}


	@Test
	public void testGetCena() {
		assertTrue(Test.getCena().equals("cena"));
	}

	@Test
	public void testSetCena() {
		
		Test.setCena("cena1");
		assertEquals(Test.getCena(), "cena1");
	}
}



