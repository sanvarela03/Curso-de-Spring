package co.edu.IoC;

public class DirectorEmpleado implements IEmpleados {

	// Creacion de campo tipo ICreacionInformes
	private ICreacionInformes informeNuevo;

	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {

		return "Gestionar plantilla empresa, mentiras soy vagin";
	}

	@Override
	public String getInforme() {

		return "Informe crado por el Director: "+informeNuevo.getInforme();
	}

}
