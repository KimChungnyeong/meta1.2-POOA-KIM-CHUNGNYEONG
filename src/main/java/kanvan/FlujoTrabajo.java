package kanvan;

import java.util.*;

public class FlujoTrabajo
{
	public FlujoTrabajo(String nombre)
	{
		this.nombre = nombre;
		this.Actividad=new ArrayList<kanvan.Actividad>();
		this.Fase=new ArrayList<kanvan.Fase>();
		this.Tarea=new ArrayList<kanvan.Tarea>();
	}

	private String nombre;
	private ArrayList<Fase> Fase;
	private ArrayList<Actividad> Actividad;
	private ArrayList<Tarea> Tarea;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<kanvan.Fase> getFase() {
		return Fase;
	}

	public void setFase(ArrayList<kanvan.Fase> fase) {
		Fase = fase;
	}

	public ArrayList<kanvan.Actividad> getActividad() {
		return Actividad;
	}

	public void setActividad(ArrayList<kanvan.Actividad> actividad) {
		Actividad = actividad;
	}

	public ArrayList<kanvan.Tarea> getTarea() {
		return Tarea;
	}

	public void setTarea(ArrayList<kanvan.Tarea> tarea) {
		Tarea = tarea;
	}

	@Override
	public String toString() {
		return "FlujoTrabajo{" +
				"nombre='" + nombre + '\'' +
				", Fase=" + Fase +
				", Actividad=" + Actividad +
				", Tarea=" + Tarea +
				'}';
	}
}