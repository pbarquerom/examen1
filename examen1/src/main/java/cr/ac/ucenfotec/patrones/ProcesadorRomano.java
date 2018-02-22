package cr.ac.ucenfotec.patrones;

public class ProcesadorRomano {
	public int convierte(String numRomano) {
		int equivalente = 0;
		String[] numRomanoParts = numRomano.split("");
		for(String numRomanoDigit : numRomanoParts) {
			if(numRomanoDigit.equals("I")) {
				equivalente += 1;
			}
		}
		
		return equivalente;
	}
}
