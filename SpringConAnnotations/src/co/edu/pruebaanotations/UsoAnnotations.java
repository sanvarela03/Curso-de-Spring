package co.edu.pruebaanotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {

		// leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// pedir un bean al contenedor,(como lo pedimos? : utilizando la java
		// annotation)

		IEmpleados Antonio = contexto.getBean("1", IEmpleados.class);

		// usar el bean
		System.out.println(Antonio.getTareas());
		System.out.println(Antonio.getInforme());
		// usar el contexto
		contexto.close();
	}

}
