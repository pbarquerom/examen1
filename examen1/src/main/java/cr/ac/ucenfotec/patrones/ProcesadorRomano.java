package cr.ac.ucenfotec.patrones;

import org.springframework.util.StringUtils;

public class ProcesadorRomano {
	public int convierte(String numRomano) throws Exception {
		int equivalente = 0;
		
		ocurrenciasDeI(numRomano);
		
		String[] numRomanoParts = numRomano.split("");
		for(String numRomanoDigit : numRomanoParts) {
			if(numRomanoDigit.equals("I")) {
				equivalente += 1;
			}else if(numRomanoDigit.equals("V")) {
				equivalente = 5;
			}else if(numRomanoDigit.equals("X")) {
				equivalente = 10;
			}
		}
		
		return equivalente;
	}
	
	private void ocurrenciasDeI(String numRomano) throws Exception {
		int ocurrenciasDeI = StringUtils.countOccurrencesOf(numRomano, "I");
		if(ocurrenciasDeI > 3) {
			throw new Exception();
		}
	}
}
