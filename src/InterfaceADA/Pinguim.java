package InterfaceADA;

public class Pinguim extends Ave implements Nada, Anda {
    public Pinguim(String nome) { super(nome); }
    public void nadar() { System.out.println(nome + " nada com graça no mar gelado."); }
    public void andar() { System.out.println(nome + " anda cambaleando em terra firme."); }
}