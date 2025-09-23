package InterfaceADA;

public class Pardal extends Ave implements Voa, Anda {
    public Pardal(String nome) { super(nome); }
    public void voar() { System.out.println(nome + " bate as asas e voa alto."); }
    public void andar() { System.out.println(nome + " anda no chão, bicando migalhas."); }
}