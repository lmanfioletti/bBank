import java.util.Comparator;
import java.util.Iterator;

public class TestaSetDeAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções", "Lucas Manfioletti");
        System.out.println(javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        javaColecoes.matricula(new Aluno("Rodrigo Turini", 34672));
        javaColecoes.matricula(new Aluno("Guilherme Silveira", 5617));
        javaColecoes.matricula(new Aluno("Mauricio Aniche", 17645));

        System.out.println("Alunos matriculados");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        Iterator<Aluno> iterador = javaColecoes.getAlunos().iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        }






    }

}
