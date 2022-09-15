import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Testando {

    public static void main(String[] args){
        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);
        //aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println(aula);
        }

        System.out.println(aulas.get(0));

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula " + aula);
        });

        Collections.sort(aulas);
        System.out.println(aulas);



    }
}
