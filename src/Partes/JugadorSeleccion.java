package Partes;

import java.util.HashMap;

public class JugadorSeleccion extends HashMap {
	
	     String[] jugador;
	     String nombre; 
	     String equipo; 
		 String posicion;
		 String dorsal; 
		 String internacionalidad;
		 
	public JugadorSeleccion (String [] jugador){
		
		this.nombre = (String)jugador[0];
		this.equipo = (String)jugador[1];
		this.posicion = (String)jugador[2];
		this.dorsal = (String)jugador[3];
		this.internacionalidad = (String)jugador[4];
		
	}

	public String[] getJugador() {
		return jugador;
	}
	public void setJugador(String[] jugador) {
		this.jugador = jugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	public String getInternacionalidad() {
		return internacionalidad;
	}
	public void setInternacionalidad(String internacionalidad) {
		this.internacionalidad = internacionalidad;
	}

}
