package co.edu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {

		/*
		 * IEmpleados empleado1 = new DirectorEmpleado();
		 * 
		 * System.out.println(empleado1.getTareas());
		 */
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");// el archivo de configuracion xml llamado "applicationContext"
		
		/*
		IEmpleados santiago = contexto.getBean("Director", IEmpleados.class);
		System.out.println(santiago.getTareas());
		System.out.println(santiago.getInforme());
		*/
		/*
		IEmpleados maria = contexto.getBean("Secretario", IEmpleados.class);
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		*/
		
		/*
		SecretarioEmpleado maria = contexto.getBean("Secretario", SecretarioEmpleado.class);
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println("Email: "+maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		*/
		
		DirectorEmpleado felipe = contexto.getBean("Director", DirectorEmpleado.class);
		System.out.println(felipe.getTareas());
		System.out.println(felipe.getInforme());
		System.out.println("Email: "+felipe.getEmail());
		System.out.println(felipe.getNombreEmpresa());
		
		contexto.close();
	}

}
