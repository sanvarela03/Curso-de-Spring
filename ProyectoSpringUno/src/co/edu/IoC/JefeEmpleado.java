package co.edu.IoC;

public class JefeEmpleado implements IEmpleados {
	private ICreacionInformes informeNuevo;

	public JefeEmpleado(ICreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos " + informeNuevo.getInforme();
	}
}
