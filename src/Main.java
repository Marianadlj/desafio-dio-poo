import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();

        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Descrição curso javascript");
        curso2.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
