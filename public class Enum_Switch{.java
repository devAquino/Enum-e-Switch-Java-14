public class Enum_Switch{
	
	private enum DIA {SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO};
	
	public static void main(String[] args) {
		System.out.println(diasSemanas(DIA.SEGUNDA));
		System.out.println(diasSemanas(DIA.DOMINGO));
		
	}
	
	public static String diasSemanas(DIA dias) {
		return switch(dias) {
			case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia útil";  
			case SABADO, DOMINGO -> "Fim de semana";
		};
	}
}