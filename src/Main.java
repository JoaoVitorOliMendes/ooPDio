import oopDio.Curso;

public class Main {

	public static void main(String[] args) {
		Curso cursoJava = new Curso();
		cursoJava.setTitulo("Curso Java");
		cursoJava.setDescricao("Curso de Java Spring");
		cursoJava.setCargaHoraria(8);
		
		System.out.println(cursoJava);
		
		Curso cursoJs = new Curso();
		cursoJava.setTitulo("Curso Js");
		cursoJava.setDescricao("Curso de Js Angular");
		cursoJava.setCargaHoraria(6);
		
		System.out.println(cursoJs);
	}

}
