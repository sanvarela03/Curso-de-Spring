package co.edu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		/*
		 * IEmpleados empleado1 = new DirectorEmpleado();
		 * 
		 * System.out.println(empleado1.getTareas());
		 */

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");// el
																												// archivo
																												// de
																												// configuracion
																												// xml
																												// llamado
																												// "applicationContext"

		IEmpleados santiago = contexto.getBean("Empleado", IEmpleados.class);
		System.out.println(santiago.getTareas());
		System.out.println(santiago.getInforme());
		contexto.close();
	}

}
