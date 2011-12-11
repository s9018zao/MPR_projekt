
package MPR.Test;


import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MPR.Gazeta;


public class GazetaTest {
	
        private Gazeta Test = new Gazeta("tytul", "cena");

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void testGazeta() {
			
			assertTrue(Test.getTytul().equals("tytul"));
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
		public void testGetCena() {
			assertTrue(Test.getCena().equals("cena"));
		}

		@Test
		public void testSetCena() {
			
			Test.setCena("cena1");
			assertEquals(Test.getCena(), "cena1");
		}
}

		