
public class Teste {
	public static void main(String args[]) {
		
		Carro palio = new Carro("Palio");		
		Carro gol = new Carro("Gol");		
		Carro fusca = new Carro("Gol");
		
		System.out.println(palio.equals(gol)); //false
		System.out.println(gol.equals(fusca)); //true
	}
}