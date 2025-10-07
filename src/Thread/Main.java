package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		
		  
		        // Criando um ThreadPool com 3 threads fixas
		        ExecutorService executor = Executors.newFixedThreadPool(3);
		        
		        System.out.println("Iniciando processamento de 5 tarefas com 3 threads...\n");
		        
		        // Submetendo 5 tarefas para execução
		        for (int i = 1; i <= 5; i++) {
		            final int taskId = i;
		            executor.submit(() -> {
		                String threadName = Thread.currentThread().getName();
		                System.out.println("Tarefa " + taskId + " iniciada na thread: " + threadName);
		                
		                try {
		                    // Simulando algum processamento
		                    Thread.sleep(2000);
		                } catch (InterruptedException e) {
		                    Thread.currentThread().interrupt();
		                }
		                
		                System.out.println("Tarefa " + taskId + " concluída na thread: " + threadName);
		            });
		        }
		        
		        // Finalizando o executor
		        executor.shutdown();
		        
		        try {
		            // Aguardando até que todas as tarefas sejam concluídas
		            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
		                executor.shutdownNow();
		            }
		        } catch (InterruptedException e) {
		            executor.shutdownNow();
		            Thread.currentThread().interrupt();
		        }
		        
		        System.out.println("\nTodas as tarefas foram concluídas!");
		    
	}
}
