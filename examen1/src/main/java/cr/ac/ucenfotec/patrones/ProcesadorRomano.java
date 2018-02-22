package cr.ac.ucenfotec.patrones;

import org.springframework.util.StringUtils;

public class ProcesadorRomano {
	public int convierte(String numRomano) throws Exception {
		int equivalente = 0;
		
		ocurrenciasDeI(numRomano);
		ocurrenciasDeL(numRomano);
		ocurrenciasDeX(numRomano);
		
		String[] numRomanoParts = numRomano.split("");
		for(String numRomanoDigit : numRomanoParts) {
			if(numRomanoDigit.equals("I")) {
				equivalente += 1;
			}else if(numRomanoDigit.equals("V")) {
				equivalente = 5;
			}else if(numRomanoDigit.equals("X")) {
				equivalente = 10;
			}else if(numRomanoDigit.equals("L")) {
				equivalente = 50;
			}else if(numRomanoDigit.equals("C")) {
				equivalente = 100;
			}else if(numRomanoDigit.equals("D")) {
				equivalente = 500;
			}else if(numRomanoDigit.equals("M")) {
				equivalente = 1000;
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
	
	private void ocurrenciasDeL(String numRomano) throws Exception {
		int ocurrenciasDeI = StringUtils.countOccurrencesOf(numRomano, "L");
		if(ocurrenciasDeI > 1) {
			throw new Exception();
		}
	}
	
	private void ocurrenciasDeX(String numRomano) throws Exception {
		int ocurrenciasDeI = StringUtils.countOccurrencesOf(numRomano, "X");
		if(ocurrenciasDeI > 3) {
			throw new Exception();
		}
	}
}
