import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NavireTest {
	private Navire navire1;
	private Navire navire2;
	private Navire navire3;
	
	@BeforeEach
	void setUp() throws Exception {
		this.navire1 = new Navire(5,"PORTE_AVION",new Coordonne(2,3),Direction.NORD);
		this.navire2 = new Navire(5,"PORTE_AVION",new Coordonne(2,3),Direction.NORD);
		this.navire3 = new Navire(5,"PORTE_AVION",new Coordonne(2,3),Direction.SUD);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertTrue(this.navire1.equals(navire2));
		assertFalse(this.navire1.equals(navire3));
	}

}
