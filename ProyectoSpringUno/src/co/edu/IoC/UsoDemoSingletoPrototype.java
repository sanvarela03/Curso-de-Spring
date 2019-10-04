package co.edu.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletoPrototype {

	public static void main(String[] args) {

		// Carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// peticion de Beans al contenedor Sptring

		SecretarioEmpleado Juanito = contexto.getBean("Secretario", SecretarioEmpleado.class);
		SecretarioEmpleado Peeblo = contexto.getBean("Secretario", SecretarioEmpleado.class);
		SecretarioEmpleado Manolo = contexto.getBean("Secretario", SecretarioEmpleado.class);
		SecretarioEmpleado RircarditoMilos = contexto.getBean("Secretario", SecretarioEmpleado.class);

		System.out.println(Juanito);
		System.out.println(Peeblo);
		System.out.println(Manolo);
		System.out.println(RircarditoMilos);

		if (Juanito == Peeblo) {
			System.out.println("Apuntan al mismo objeto");
		} else {
			System.out.println("No apuntan al mismo objeto");
		}

		contexto.close();

	}

}
