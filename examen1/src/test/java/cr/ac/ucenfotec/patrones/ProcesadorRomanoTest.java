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
	public void stringVacioTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(0, procesador.convierte(""));
	}
	
	@Test
	public void stringDeUnCharTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(1, procesador.convierte("I"));
	}
	
	@Test
	public void stringDeDosCharTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(2, procesador.convierte("II"));
	}
	
	@Test
	public void stringDeTresCharTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(3, procesador.convierte("III"));
	}
	
	@Test(expected = Exception.class)
	public void stringDeCuatroCharTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		procesador.convierte("IIII");
	}

}
