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

	@Test
	public void stringDeCharVTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(5, procesador.convierte("V"));
	}
	
	@Test
	public void stringDeCharXTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(10, procesador.convierte("X"));
	}
	
	@Test
	public void stringDeCharLTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(50, procesador.convierte("L"));
	}
	
	@Test
	public void stringDeCharCTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(100, procesador.convierte("C"));
	}
	
	@Test
	public void stringDeCharDTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(500, procesador.convierte("D"));
	}
	
	@Test
	public void stringDeCharMTest() throws Exception {
		ProcesadorRomano procesador = new ProcesadorRomano();
		Assert.assertEquals(1000, procesador.convierte("M"));
	}
}
