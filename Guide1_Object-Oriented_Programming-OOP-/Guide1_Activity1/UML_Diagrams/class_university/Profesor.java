public class Profesor extends Persona {

	private string nacionalidad;

	private int sueldo;

	private Estudiante[] estudiante;

	private Profesor.Facultad facultad;

	public class Facultad {

		private string nombre;

		private string profesor;

		private string estudiante;

		private Carrera[] carrera;

		private Curso[] curso;

	}

}
