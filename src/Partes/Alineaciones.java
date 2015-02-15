package Partes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Alineaciones {

	public static void main(String[] args) {
		
		//JugadorSeleccion jugador = null;
//		String arrayJugador [];
		ArrayList<JugadorSeleccion> delanteros;
		ArrayList<JugadorSeleccion> centrocampista;
		ArrayList<JugadorSeleccion> defensas;
		ArrayList<JugadorSeleccion> porteros;
		
		defensas = new ArrayList<JugadorSeleccion>();
		delanteros = new ArrayList<JugadorSeleccion>();
		
//		ArrayList<String> 
//		 
	
	try {
		 	String linea1;
	        
			File miArchivo = new File("./jugadores.txt");
			FileReader lector = new FileReader(miArchivo);
			BufferedReader br = new BufferedReader(lector);
			 	
			while (( linea1 = br.readLine())!=null){
					if( linea1.startsWith("-")){
					linea1 = linea1.substring(1);
//					System.out.println(linea1);
					String arrayJugador[]=linea1.split(",");
//					System.out.println(arrayJugador[2]);
					
						if( arrayJugador[2].equals( "delantero")==true){
							JugadorSeleccion jugador = new JugadorSeleccion(arrayJugador); 
							//delanteros = new ArrayList<JugadorSeleccion>();
							
							//for (int i=1; i<=4; i++){
							
							delanteros.add(jugador); 
							//}
							
//							delanteros.add(jugador);
							
//							System.out.println(jugador.getNombre());
//							for(JugadorSeleccion elemento : delanteros){
//								System.out.println(elemento.getDorsal());
//							}
						}
						
						if(arrayJugador[2].equals("centroCampista")==true){
							
							JugadorSeleccion jugador = new JugadorSeleccion(arrayJugador); 
							 
							centrocampista = new ArrayList<JugadorSeleccion>();
							 
							 centrocampista.add(jugador);
							 
							 System.out.println(jugador.getDorsal());
						}
						
						if( linea1.toLowerCase().indexOf( "defensa".toLowerCase())!=-1){
							
							JugadorSeleccion jugador = new JugadorSeleccion(arrayJugador); 
							 
							 defensas = new ArrayList<JugadorSeleccion>();
							 
							 defensas.add(jugador);
							 
//							 System.out.println(jugador.getDorsal());
						}
						
						if( linea1.toLowerCase().indexOf( "portero".toLowerCase())!=-1){
							
							JugadorSeleccion jugador = new JugadorSeleccion(arrayJugador); 
							 
							 porteros = new ArrayList<JugadorSeleccion>();
							 
							 porteros.add(jugador);
							 
//							 System.out.println(jugador.getDorsal());
						}
						
					}
				}	
				br.close();
			}
				catch (IOException e) {
					System.out.println("El archivo no se encuentra");
				}
	System.out.println(delanteros.size());
	Iterator<JugadorSeleccion> nombreIterator =delanteros.iterator();
	while(nombreIterator.hasNext()){
		JugadorSeleccion elemento = nombreIterator.next();
		System.out.print(elemento.dorsal+" / ");
	}

	}
}




////DOrsal = 1
//		Nombre= iker
//		equipo = real
//		posicion= porte
//		internacionalidades= 23

//for(int i = 0; i<defensas.size(); i++){
//System.out.println(jugador.getDorsal(i));//con el for recorre las posiciones y las muestra.
//}
//
