package Desafios.BootcampOO;

import java.time.LocalDate;

import Desafios.BootcampOO.Dominio.Bootcamp;
import Desafios.BootcampOO.Dominio.Curso;
import Desafios.BootcampOO.Dominio.Dev;
import Desafios.BootcampOO.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aprenda Java do Zero");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring Boot");
        curso2.setDescricao("Aprenda Spring Boot");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria sobre Carreira");
        mentoria.setDescricao("Dicas de carreira em TI");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Formação Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Brunão");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Concluídos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("----------------");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Concluídos " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


        System.out.println("----------------");

        bootcamp.rankingXp();



    }
}
