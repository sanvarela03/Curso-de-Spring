package co.edu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// cargar el xml de configuracion

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// Obtencion del Bean

		IEmpleados Julian = contexto.getBean("Director", IEmpleados.class);
		
		
		System.out.println(Julian.getInforme());
		// Cerrar el contexto
		contexto.close();
	}

}
