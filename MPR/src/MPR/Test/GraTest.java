package MPR.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MPR.Gra;



public class GraTest {
	
	 private Gra Test = new Gra("nazwa", "cena");
	 
	 @Before
		public void setUp() throws Exception {
		}

	 @After
		public void tearDown() throws Exception {
		}
	 
	 @Test
	 public void testGra() {
			
			assertTrue(Test.getNazwa().equals("nazwa"));
			assertEquals(Test.getCena(), "cena");
		}
	 
	 
	 @Test
		public void testGetNazwa() {
			
			assertSame(Test.getNazwa(), "nazwa");
		}

		@Test
		public void testSetNazwa() {
			
			Test.setNazwa("nazwa1");
            assertTrue(Test.getNazwa().equals("nazwa1"));
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




