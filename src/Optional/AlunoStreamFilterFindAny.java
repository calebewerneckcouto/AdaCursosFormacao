package Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlunoStreamFilterFindAny {

    public static void main(String[] args) {

        List<String> alunos = new ArrayList<>();
        alunos.add("João - nota 7");
        alunos.add("Maria - nota 10");
        alunos.add("Pedro - nota 8");
        alunos.add("Ana - nota 10");
        alunos.add("Carlos - nota 6");

       
        Optional<String> alunoNota10 = alunos.stream()
                .filter(aluno -> aluno.contains("nota 10"))
                .findAny();

      
        Optional<String> alunoNota10Primeiro = alunos.stream()
                .filter(aluno -> aluno.contains("nota 10"))
                .findFirst();

      
        if (alunoNota10.isPresent()) {
            System.out.println("Aluno encontrado com findAny: " + alunoNota10.get());
        } else {
            System.out.println("Nenhum aluno tirou 10");
        }

      
        if (alunoNota10Primeiro.isPresent()) {
            System.out.println("Primeiro aluno encontrado com findFirst: " + alunoNota10Primeiro.get());
        } else {
            System.out.println("Nenhum aluno tirou 10");
        }

       
        alunoNota10.ifPresent(aluno ->
                System.out.println("Encontrado com ifPresent (findAny): " + aluno)
        );

      
        alunoNota10Primeiro.ifPresent(aluno ->
                System.out.println("Encontrado com ifPresent (findFirst): " + aluno)
        );

        
        String resultado = alunoNota10.orElse("Nenhum aluno tirou 10");
        System.out.println("Resultado final (findAny): " + resultado);

       
        String resultado2 = alunoNota10Primeiro.orElse("Nenhum aluno tirou 10");
        System.out.println("Resultado final (findFirst): " + resultado2);
    }
}