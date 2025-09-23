package InterfaceADA;

public class Main {
    public static void main(String[] args) {
        Ave[] aves = {new Pardal("Pardalito"), new Pinguim("Pinguinzinho"), new Avestruz("Avestruzão"), new SuperAve("AveCompleta")};
        for (Ave ave : aves) { ave.descricao(); ave.realizarAcoes(); System.out.println(); }
    }
}