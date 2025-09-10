package RoboCortador;

public class Main {
public static void main(String[] args) {
	 Cortador cortador = new Serra();
     

     RoboCortadorPizza robo = new RoboCortadorPizza(cortador);
     robo.executarCorte(); 

     
}
}
