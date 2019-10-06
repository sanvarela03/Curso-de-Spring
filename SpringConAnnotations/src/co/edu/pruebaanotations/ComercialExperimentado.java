package co.edu.pruebaanotations;

import org.springframework.stereotype.Component;

@Component("1")
public class ComercialExperimentado implements IEmpleados {

	@Override
	public String getTareas() {

		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {

		return "Informe generado por el comercial";
	}

}
