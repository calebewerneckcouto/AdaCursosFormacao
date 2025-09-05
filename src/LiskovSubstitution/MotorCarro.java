package LiskovSubstitution;

public class MotorCarro implements CombustaoVeiculo {

	@Override
	public void frear() {
		System.out.println("Carro a Combustao freando.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Carro a Combustao acelerando.");
		
	}

	@Override
	public void ligarMotor() {
		System.out.println("Motor do carro está funcionando.");
		
	}

}
