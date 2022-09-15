import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {
    public static void main(String [] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Lucas Manfioletti");
        System.out.println(javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
        System.out.println(javaColecoes.getAulas());

        //cria copia da lista e ordena a copia por titulo
        List<Aula> copiaJavaColecoes = new ArrayList<>(javaColecoes.getAulas());
        copiaJavaColecoes.sort(Comparator.comparing(Aula::getTitulo));
        System.out.println(copiaJavaColecoes);


    }
}
