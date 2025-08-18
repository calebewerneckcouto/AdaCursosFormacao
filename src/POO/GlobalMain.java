package POO;

public class GlobalMain {

    static int contGlobal = 0; // contador global
    int contLocal = 0;         // contador de cada instância

    public static void main(String[] args) {
        GlobalMain m1 = new GlobalMain();
        m1.incrementar();
        m1.incrementar();
        System.out.println("m1.contLocal = " + m1.contLocal);

        GlobalMain m2 = new GlobalMain();
        m2.incrementar();
        System.out.println("m2.contLocal = " + m2.contLocal);

        System.out.println("contGlobal = " + contGlobal);
    }

    int incrementar() {
        contLocal += 1;
        incrementarGlobal();
        return contLocal;
    }

    static int incrementarGlobal() {
        contGlobal += 1;
        return contGlobal;
    }
}
