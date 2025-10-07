package Thread;
public class DeadlockExemplo {
    
    private final Object recursoA = new Object();
    private final Object recursoB = new Object();
    
    public void executarDeadlock() {
        Thread thread1 = new Thread(() -> {
            synchronized (recursoA) {
                System.out.println("Thread 1: Bloqueou recurso A");
                
                try {
                    // Dorme para garantir que a thread 2 tenha tempo de bloquear o recurso B
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                
                System.out.println("Thread 1: Tentando bloquear recurso B...");
                synchronized (recursoB) {
                    System.out.println("Thread 1: Bloqueou recurso B");
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            synchronized (recursoB) {
                System.out.println("Thread 2: Bloqueou recurso B");
                
                try {
                    // Dorme para garantir que a thread 1 tenha tempo de bloquear o recurso A
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                
                System.out.println("Thread 2: Tentando bloquear recurso A...");
                synchronized (recursoA) {
                    System.out.println("Thread 2: Bloqueou recurso A");
                }
            }
        });
        
        thread1.start();
        thread2.start();
        
        // Aguarda um tempo para ver o deadlock acontecer
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Verifica se as threads ainda estão vivas (presas no deadlock)
        System.out.println("\nThread 1 viva: " + thread1.isAlive());
        System.out.println("Thread 2 viva: " + thread2.isAlive());
        
        if (thread1.isAlive() && thread2.isAlive()) {
            System.out.println("DEADLOCK CONFIRMADO! Ambas as threads estão bloqueadas.");
        }
    }
    
    public static void main(String[] args) {
        new DeadlockExemplo().executarDeadlock();
    }
}