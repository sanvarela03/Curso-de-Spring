package co.edu.IoC;

public class SecretarioEmpleado implements IEmpleados {

	private ICreacionInformes informeNuevo;

	// Campos que se van a inyectar
	private String email;
	private String nombreEmpresa;

	@Override
	public String getTareas() {

		return "Gestionar agenda de los jefes";
	}

	@Override
	public String getInforme() {

		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

	public void setInformeNuevo(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
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

	public ICreacionInformes getInformeNuevo() {
		return informeNuevo;
	}

}
