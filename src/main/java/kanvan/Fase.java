package kanvan;

import java.util.*;

public class Fase
{
	private String nombre;
	private FlujoTrabajo FlujoTrabajo;
	private ArrayList<Tarea> Tarea;

	public Fase(String nombre, kanvan.FlujoTrabajo flujoTrabajo) {
		this.nombre = nombre;
		this.Tarea = new ArrayList<kanvan.Tarea>();
		FlujoTrabajo = flujoTrabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public kanvan.FlujoTrabajo getFlujoTrabajo() {
		return FlujoTrabajo;
	}

	public void setFlujoTrabajo(kanvan.FlujoTrabajo flujoTrabajo) {
		FlujoTrabajo = flujoTrabajo;
	}

	public ArrayList<kanvan.Tarea> getTarea() {
		return Tarea;
	}

	public void setTarea(ArrayList<kanvan.Tarea> tarea) {
		Tarea = tarea;
	}

	@Override
	public String toString() {
		return "Fase{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}