package co.edu.IoC;

public class DirectorEmpleado implements IEmpleados {

	// Creacion de campo tipo ICreacionInformes
	private ICreacionInformes informeNuevo;
	
	private String email;
	private String nombreEmpresa;
	
	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {

		return "Gestionar plantilla empresa";
	}

	@Override
	public String getInforme() {

		return "Informe creado por el Director: "+informeNuevo.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}
