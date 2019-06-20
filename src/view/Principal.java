package view;

import java.io.IOException;

import controller.CursoController;

public class Principal {

	private static CursoController cursos;

	public static void main(String[] args) {
		String iniciarServ = "cmd /c java -cp hsqldb.jar org.hsqldb.Server -database.0 Cursos -dbname.0 Cursos";
		try {
			Runtime.getRuntime().exec(iniciarServ);
		} catch (IOException e) {
			e.printStackTrace();
		}
		cursos = new CursoController();
		cursos.listaCurso();
	}

}
