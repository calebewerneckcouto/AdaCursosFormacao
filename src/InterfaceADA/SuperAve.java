package InterfaceADA;

class SuperAve extends Ave implements Voa, Nada, Anda {
    public SuperAve(String nome) { super(nome); }
    public void voar() { System.out.println(nome + " voa majestosamente!"); }
    public void nadar() { System.out.println(nome + " nada como um golfinho!"); }
    public void andar() { System.out.println(nome + " anda com elegância!"); }
    public void descricao() { System.out.println("Sou uma SUPER ave " + nome + ":"); }
}