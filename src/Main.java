import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda os conceitos de POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso("Curso JavaScript", "Aprenda os conceitos de JS", 4);


        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprenda os conceitos de POO");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Dev 1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("conteudos concluidos Dev 1: " + dev1.getConteudosConcluidos());
         System.out.println("conteudos inscritos Dev 2: " + dev1.getConteudosInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos Dev 2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("conteudos concluidos Dev 2: " + dev2.getConteudosConcluidos());
         System.out.println("conteudos inscritos Dev 2: " + dev2.getConteudosInscritos());

    }
}
