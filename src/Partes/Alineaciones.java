
package Partes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Alineaciones {
	
	
	static ArrayList<JugadorSeleccion> delanteros= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> centrocampista= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> defensas= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> porteros= new ArrayList<JugadorSeleccion>();
	static HashMap<Integer, JugadorSeleccion> alineacion = new HashMap<Integer, JugadorSeleccion>();

	public static void main(String[] args) {
		 
	try {
		 	String linea1;
			File miArchivo = new File("src/jugadores.txt");
			FileReader lector = new FileReader(miArchivo);
			BufferedReader br = new BufferedReader(lector);
			JugadorSeleccion jugador = null;
			String arrayJugador [];
			
			
	
			 	
			while (( linea1 = br.readLine())!=null){
					if( linea1.startsWith("-")){
					System.out.println(linea1);
					arrayJugador=linea1.substring(1).split(",");
					
					jugador = new JugadorSeleccion(arrayJugador); 
					
//					System.out.println(jugador.toString());
//					
						if( jugador.getPosicion().equals( "delantero")){
		
							delanteros.add(jugador);
							
//							System.out.println(jugador.getNombre());
						}
						
						else if(jugador.getPosicion().equals("centrocampista")){
							 
							 centrocampista.add(jugador);
							 
//							 System.out.println(jugador.getDorsal());
						}
						
						else if(jugador.getPosicion().equals("defensa")){
							 
							 defensas.add(jugador);
							 
//							 System.out.println(jugador.getDorsal());
						}
						
						else if(jugador.getPosicion().equals("portero")){
							 
							 porteros.add(jugador);
							 
//							 System.out.println(jugador.getDorsal());
						}
						
					}
				}
//			for(int i = 0; i<porteros.size(); i++){
//				System.out.println(porteros.get(i).getNombre());//con el for recorre las posiciones y las muestra.
//			}
// AQUI EMPEZAMOS CON LA SELECCION DE LA LA ALINEACION 			
			Scanner lector1=new Scanner(System.in);
			
			int lineaDefensiva;
			int lineaCentral;
			int lineaDelantera;
//AQUI LO REPIDO MIENTRAS EL NUMEO TOTAL DE JUGADORES SEA DISTINTO DE 10			
			do { 
				
			System.out.println("El total de jugadores de la alineacion ha de ser 10");
				
			System.out.println("\n¿Cuantos defensas quiere?");
			lineaDefensiva=lector1.nextInt();
			
			
			System.out.println("¿Cuantos centrocampistas quiere?");
			lineaCentral=lector1.nextInt();
			
		
			System.out.println("¿Cuantos delanteros quiere?");
			lineaDelantera=lector1.nextInt();
			
			} while (lineaDefensiva+lineaCentral+lineaDelantera !=10);
			
			
// EMPEZAMOS LA ELECCION DE LOS JUGADORES POR CADA LINEA DEL EQUIPO REPITIENDOLO SEGUN EL NUMERO DE JUGADAORES ELEJIDOS EN CADA LINES
			
			//DEFENSAS
			
			System.out.println("Elija los defensas, por su dorsal:\n ");
			
			for (int i=0; i<lineaDefensiva; i++){//repito la eleccion tantas veces como numero de defensas puso
				
				for (int j = 0; j< defensas.size();j++){
					
					System.out.println( "DORSAL = " + defensas.get(j).getDorsal() + " NOMBRE = " + defensas.get(j).getNombre() + " POSICION = "  + defensas.get(j).getPosicion()+ " VECES INTERNACIONAL = " + defensas.get(j).getInternacionalidad());
				
				}
					String jugadorElejido = lector1.next();
					
//					System.out.println(defensaElejido);
					 for (int k = 0; k< defensas.size();k++){
						 if (defensas.get(k).getDorsal().equals(jugadorElejido)){
							 alineacion.put(Integer.parseInt(defensas.get(k).getDorsal()), defensas.get(k));
							 defensas.remove(k);
//							 k = defensas.size()+1;
						 }
						 
					 }
			}
			
			
			// CENTROCAMPISTAS
			
			System.out.println("Elija los Centrocampistas, por su dorsal:\n ");
			
			for (int i=0; i<lineaCentral; i++){//repito la eleccion tantas veces como numero de defensas puso
				
				for (int j = 0; j< centrocampista.size();j++){
					
					System.out.println( "DORSAL = " + centrocampista.get(j).getDorsal() + " NOMBRE = " + centrocampista.get(j).getNombre() + " POSICION = "  + centrocampista.get(j).getPosicion()+ " VECES INTERNACIONAL = " + centrocampista.get(j).getInternacionalidad());
				
				}
					String jugadorElejido = lector1.next();
					

					 for (int k = 0; k< centrocampista.size();k++){
						 if (centrocampista.get(k).getDorsal().equals(jugadorElejido)){
							 alineacion.put(Integer.parseInt(centrocampista.get(k).getDorsal()), centrocampista.get(k));
							 centrocampista.remove(k);
						 }
					 }
			}
			
			// DELANTEROS
			
						System.out.println("Elija los Delanteros, por su dorsal:\n ");
						
						for (int i=0; i<lineaDelantera; i++){//repito la eleccion tantas veces como numero de defensas puso
							
							for (int j = 0; j< delanteros.size();j++){
								
								System.out.println( "DORSAL = " + delanteros.get(j).getDorsal() + " NOMBRE = " + delanteros.get(j).getNombre() + " POSICION = "  + delanteros.get(j).getPosicion()+ " VECES INTERNACIONAL = " + delanteros.get(j).getInternacionalidad());
							
							}
								String jugadorElejido = lector1.next();
								

								 for (int k = 0; k< delanteros.size();k++){
									 if (delanteros.get(k).getDorsal().equals(jugadorElejido)){
										 alineacion.put(Integer.parseInt(delanteros.get(k).getDorsal()), delanteros.get(k));
										 delanteros.remove(k);
									 }
								 }
						}
						
						//PORTEROS
						
						System.out.println("Elija los Porteros, por su dorsal:\n ");
						
						for (int i=0; i<1; i++){//repito la eleccion tantas veces como numero de defensas puso
							
							for (int j = 0; j< delanteros.size();j++){
								
								System.out.println( "DORSAL = " + porteros.get(j).getDorsal() + " NOMBRE = " + porteros.get(j).getNombre() + " POSICION = "  + porteros.get(j).getPosicion()+ " VECES INTERNACIONAL = " + porteros.get(j).getInternacionalidad());
							
							}
								String jugadorElejido = lector1.next();
								

								 for (int k = 0; k< porteros.size();k++){
									 if (porteros.get(k).getDorsal().equals(jugadorElejido)){
										 alineacion.put(Integer.parseInt(porteros.get(k).getDorsal()), porteros.get(k));
										 porteros.remove(k);
									 }
								 }
						}
						
						//tengo que mostrar aqui el has de mi alineacion, aqui creo un array con los dorsales que metio y recupero el valor del hueco del array(dorsal) y muestro del has el jugador ocon sis valores
//						System.out.println(alineacion.get());
				//ESTO NO LO CONTROLO
						Iterator it=  alineacion.keySet().iterator();// con esto establezcon este objeto iterator hace que avanzae de clave en clave es una coleccion que guarda las claves
						
						String clave;
//						int valor;
						
						while(it.hasNext()){
							clave= (String) it.next(); //devuelve la clave
//							valor = alineacion.get(clave);//aqui el contenido se lo asigno a valor
							System.out.println(clave+"="+ alineacion.get(clave));//aqui muestro la clave con su valor
						}//si quisiese cambiar una 
						
						br.close();
			
		}
				catch (IOException e) {
					System.out.println("El archivo no se encuentra");
				}

	}
}
