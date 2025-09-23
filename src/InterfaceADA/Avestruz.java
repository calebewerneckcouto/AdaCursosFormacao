package InterfaceADA;

class Avestruz extends Ave implements Anda {
    public Avestruz(String nome) { super(nome); }
    public void andar() { System.out.println(nome + " corre velozmente no solo."); }
}