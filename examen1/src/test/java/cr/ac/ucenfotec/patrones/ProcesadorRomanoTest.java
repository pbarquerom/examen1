package cr.ac.ucenfotec.patrones;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProcesadorRomanoTest {
	
	@Test
	public void stringVacioTest() {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(0, procesador.convierte(""));
	}

}
