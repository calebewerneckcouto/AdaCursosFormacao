package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAvancado {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("Ana", "TI", 4500, 28),
            new Funcionario("Carlos", "RH", 3200, 35),
            new Funcionario("Beatriz", "TI", 5000, 40),
            new Funcionario("Daniel", "Financeiro", 6000, 50),
            new Funcionario("Eduardo", "TI", 4200, 30),
            new Funcionario("Fernanda", "RH", 3500, 27)
        );

        // 1️⃣ Filtrar funcionários da TI com salário > 4000
        List<Funcionario> tiBemPagos = funcionarios.stream()
            .filter(f -> f.departamento.equals("TI") && f.salario > 4000)
            .collect(Collectors.toList());
        System.out.println("Funcionários da TI com salário > 4000:");
        tiBemPagos.forEach(System.out::println);

        System.out.println("\n--------------------------------\n");

        // 2️⃣ Ordenar por idade crescente
        List<Funcionario> ordenadosPorIdade = funcionarios.stream()
            .sorted(Comparator.comparingInt(f -> f.idade))
            .collect(Collectors.toList());
        System.out.println("Funcionários ordenados por idade:");
        ordenadosPorIdade.forEach(System.out::println);

        System.out.println("\n--------------------------------\n");

        // 3️⃣ Agrupar por departamento
        Map<String, List<Funcionario>> grupoDept = funcionarios.stream()
            .collect(Collectors.groupingBy(f -> f.departamento));
        System.out.println("Funcionários agrupados por departamento:");
        grupoDept.forEach((dep, lista) -> {
            System.out.println(dep + ":");
            lista.forEach(f -> System.out.println("  " + f.nome));
        });

        System.out.println("\n--------------------------------\n");

        // 4️⃣ Média salarial por departamento
        Map<String, Double> mediaSalarial = funcionarios.stream()
            .collect(Collectors.groupingBy(
                f -> f.departamento,
                Collectors.averagingDouble(f -> f.salario)
            ));
        System.out.println("Média salarial por departamento:");
        mediaSalarial.forEach((dep, media) -> System.out.println(dep + ": R$" + media));

        System.out.println("\n--------------------------------\n");

        // 5️⃣ Reduzir para total da folha de pagamento
        double totalSalarios = funcionarios.stream()
            .map(f -> f.salario)
            .reduce(0.0, Double::sum);
        System.out.println("Total da folha de pagamento: R$" + totalSalarios);

        System.out.println("\n--------------------------------\n");

        // 6️⃣ Mapear nomes para lista de Strings em maiúsculo
        List<String> nomesMaiusculos = funcionarios.stream()
            .map(f -> f.nome.toUpperCase())
            .collect(Collectors.toList());
        System.out.println("Nomes em maiúsculo:");
        nomesMaiusculos.forEach(System.out::println);

        System.out.println("\n--------------------------------\n");

        // 7️⃣ Encontrar o funcionário mais velho
        funcionarios.stream()
            .max(Comparator.comparingInt(f -> f.idade))
            .ifPresent(f -> System.out.println("Funcionário mais velho: " + f));

        System.out.println("\n--------------------------------\n");

        // 8️⃣ Verificar se todos têm salário > 3000
        boolean todosBemPagos = funcionarios.stream()
            .allMatch(f -> f.salario > 3000);
        System.out.println("Todos os funcionários têm salário > 3000? " + todosBemPagos);

        // 9️⃣ Verificar se existe alguém do departamento Financeiro
        boolean temFinanceiro = funcionarios.stream()
            .anyMatch(f -> f.departamento.equals("Financeiro"));
        System.out.println("Existe funcionário do Financeiro? " + temFinanceiro);
    }
}
