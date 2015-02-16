package Partes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

public class Alineaciones {
	
	static ArrayList<JugadorSeleccion> delanteros= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> centrocampista= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> defensas= new ArrayList<JugadorSeleccion>();
	static ArrayList<JugadorSeleccion> porteros= new ArrayList<JugadorSeleccion>();

	public static void main(String[] args) {
		 
	try {
		 	String linea1;
			File miArchivo = new File("C:/archivosJava/jugadores.txt");
			FileReader lector = new FileReader(miArchivo);
			BufferedReader br = new BufferedReader(lector);
			JugadorSeleccion jugador = null;
			String arrayJugador [];
			
			
	
			 	
			while (( linea1 = br.readLine())!=null){
					if( linea1.startsWith("-")){
//					System.out.println(linea1);
					arrayJugador=linea1.substring(1).split(",");
					
					jugador = new JugadorSeleccion(arrayJugador); 
					
//					System.out.println(jugador.toString());
					
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
			
			System.out.println("Elija los defensas:\n ");
			
			for (int i=0; i<lineaDefensiva; i++){//repito la eleccion tantas veces como numero de defensas puso
				
				for (int j = 0; j< defensas.size();j++){
					
					System.out.println( defensas.get(j).getDorsal());
				
				}
					String defensaElejido = lector1.next();
					System.out.println(defensaElejido);
					
					defensas.remove(jugador.getDorsal().equals(defensaElejido));
					
					
			}
			
			// CENTROCAMPISTAS
			
			System.out.println("Elija un centrocampista:\n ");
			
			for (int i = 0; i< centrocampista.size();i++){
				
				System.out.println( centrocampista.get(i).getNombre());
				
				
			}
			br.close();
			
		}
				catch (IOException e) {
					System.out.println("El archivo no se encuentra");
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
