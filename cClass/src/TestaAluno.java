import java.util.HashSet;
import java.util.Set;

public class TestaAluno {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // todos os collections de set não repetem elementos e são mais rapidos nas buscas

        System.out.println(alunos);
    }
}
