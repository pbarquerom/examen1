package cr.ac.ucenfotec.patrones;

import org.springframework.util.StringUtils;

public class ProcesadorRomano {
	public int convierte(String numRomano) throws Exception {
		int equivalente = 0;
		
		int ocurrenciasDeI = StringUtils.countOccurrencesOf(numRomano, "I");
		if(ocurrenciasDeI > 3) {
			throw new Exception();
		}
		
		String[] numRomanoParts = numRomano.split("");
		for(String numRomanoDigit : numRomanoParts) {
			if(numRomanoDigit.equals("I")) {
				equivalente += 1;
			}
		}
		
		return equivalente;
	}
}
