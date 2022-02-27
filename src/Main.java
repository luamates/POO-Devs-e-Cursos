import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso de java");
        curso1.setDescricao("aprenda agora mesmo a programar em java como um profissional!");
        curso1.setCargaHoraria(52);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso de js");
        curso2.setDescricao("Javascript está presente literalmente em qualquer lugar, então este curso lhe prepara para ingressar no mercado de trabalho com muitas habilidades!");
        curso2.setCargaHoraria(35);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Mentoria aplicada pelo empreendedor de tecnologia Elon Musk");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT JAVA");
        bootcamp.setDescricao("Aprenda muito com o bootcamp da GFT e ainda tenha a possibilidade de conseguir uma vaga como starter na alemã de tecnologia!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAmates = new Dev();
        devAmates.setNome("Lucas");
        devAmates.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas:" + devAmates.getConteudosInscritos());
        devAmates.progredir();
        devAmates.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas:" + devAmates.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas:" + devAmates.getConteudosConcluidos());
        System.out.println("XP:" + devAmates.calcularTotalXp());


        System.out.println("-------");


        Dev devMusk = new Dev();
        devMusk.setNome("Musk");
        devMusk.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Musk:" + devMusk.getConteudosInscritos());
        devMusk.progredir();
        devMusk.progredir();
        devMusk.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Musk:" + devMusk.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Musk:" + devMusk.getConteudosConcluidos());
        System.out.println("XP:" + devMusk.calcularTotalXp());

    }

}
