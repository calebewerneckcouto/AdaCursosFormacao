package LiskovSubstitution;

public class Main {
	public static void main(String[] args) {
		Veiculo tesla = new CarroEletrico();
		Veiculo fusca = new MotorCarro(); // também funciona porque CombustionVehicle herda Vehicle

		tesla.acelerar();
		tesla.frear();

		fusca.acelerar();
		fusca.frear();
	}
}
