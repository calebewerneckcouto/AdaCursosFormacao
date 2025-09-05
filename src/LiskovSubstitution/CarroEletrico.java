package LiskovSubstitution;

public class CarroEletrico implements Veiculo {

	@Override
	public void frear() {
			System.out.println("Freando carro elétrico");
		
	}

	@Override
	public void acelerar() {
		    System.out.println("Acelerando carro elétrico");
		
	}

}
