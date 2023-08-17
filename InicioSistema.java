package interfaceTest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class InicioSistema {

	public static void main(String[] args) {

		int opcionRepetir = 1;
		JOptionPane.showMessageDialog(null, "Usted inicio conversor");
		String cantidadS="";
		double cantidad;
		String[] arregloTipo = { "Monedas", "Temperatura G° a F" };


		// Este do se encarga de repetir la app
		do {
			//pregunta si va a cambiar moneda o temperatura
			//String cadena = "";
			int valorASCII = 0;
			int cont = 0;
			int j = 0;
			Scanner sc = new Scanner(System.in);
			
			int opcionTipo = JOptionPane.showOptionDialog(null, "¿Que moneda va a cambiar?", "¿Que quiere cambiar?", 0,
					JOptionPane.QUESTION_MESSAGE, null, arregloTipo, "Monedas");
			String[] arregloOpcion = { "Salir", "Otra vez" };

			// Este if se encarga de seaber si escogeremos moneda o temperatura
			if (opcionTipo == 0) {
				// Escogimos monedas

				//Las monedas que aceptamos y abajo su valor en pesos MX
				String[] arregloMoneda = { "Pesos MX", "Dolares", "Euros", "Libras Esterlinas", "Yen Japonés","Won sul-coreanos" };
				double[] arregloValor = {       1,       0.059,    0.054,       0.046,              8.52,         78.21 };

				  //aqui escogemos la moneda que vamos a entregar
				int opcion = JOptionPane.showOptionDialog(null, "¿Que moneda va a cambiar?", "Escoja su moneda", 0,
						JOptionPane.QUESTION_MESSAGE, null, arregloMoneda, "Peso MX");
				
				
				for(j =0; j>=cont; j++) {
					if(cont>0)
					{
						cont=0;
					}
					
					//¨¨¨¨¨¨cadena = JOptionPane.showInputDialog("ingrese cadena");
					cantidadS = JOptionPane.showInputDialog("Escriba la cantidad de " + arregloMoneda[opcion] + " que va a cambiar");
					//System.out.println("ingresa una palabra: ");
					//cadena = sc.next(); 
					
					for(int v = 0; v < cantidadS.length(); v++ ) {
						char caracter = cantidadS.charAt(v);
						valorASCII = (int) caracter;
							if( valorASCII < 48 || valorASCII >57 ) {
								if(valorASCII==46) {
									break;
								}
							cont++;
							JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "alert", JOptionPane.ERROR_MESSAGE);
						}
							
					}
					if(cont == 0) break;
				}
				
			
				//aqui escribimos la cantidad que vamos a cambiar (se guarda en string y abajo se cambia a double)
				//cantidadS = JOptionPane.showInputDialog("Escriba la cantidad de " + arregloMoneda[opcion] + " que va a cambiar");
				cantidad = Double.parseDouble(cantidadS);
				
				
				
				
				//aqui escogemos el tipo moneda que queremos recibir
				int opcion2 = JOptionPane.showOptionDialog(null, "¿Que moneda quiere a recibir?", "Escoja su moneda", 0,
						JOptionPane.QUESTION_MESSAGE, null, arregloMoneda, "Dolar");
				//while para no repetir la misma moneda
				int i = 0;
				while (i == 0) {
					if (opcion == opcion2) {
						JOptionPane.showMessageDialog(null, "No puede elegir la misma moneda");
						opcion2 = JOptionPane.showOptionDialog(null, "¿Que moneda quiere a recibir?",
								"Escoja su moneda", 0, JOptionPane.QUESTION_MESSAGE, null, arregloMoneda, "Dolar");
					} else {
						i++;
					}

				}//termina el no repetir moneda
				
				//aqui cambiamos la moneda a pesos MX y luego se convierte a la moneda deseada
				double cambio = cantidad / arregloValor[opcion];
				System.out.println(cambio);
				double recibir = cambio * arregloValor[opcion2];

				JOptionPane.showMessageDialog(null, "Usted debe recibir: " + recibir + arregloMoneda[opcion2]);

			}//TERMINA CONVERSOR DE MONEDA
			
			else {
				
				//EMPIEZA CONVERSOR DE GRADOS  en caso de ser escogido

				String[] arregloTemp = { "Grados Celsius", "Fahrenheit" };
				//Pregunta si queremos cambiar celsius o Fahrenheit
				int opcion = JOptionPane.showOptionDialog(null, "¿Que temperatura vas a registrar?",
						"Escoja su Temperatura", 0, JOptionPane.QUESTION_MESSAGE, null, arregloTemp, "Celsius");

				double resultado;
				if (opcion == 0) {
					
					for(j =0; j>=cont; j++) {
						if(cont>0)
						{
							cont=0;
						}
						
						//¨¨¨¨¨¨cadena = JOptionPane.showInputDialog("ingrese cadena");
						cantidadS = JOptionPane.showInputDialog("Escriba la temperatura en grados celsisus que va a cambiar");
						//System.out.println("ingresa una palabra: ");
						//cadena = sc.next(); 
						
						for(int v = 0; v < cantidadS.length(); v++ ) {
							char caracter = cantidadS.charAt(v);
							valorASCII = (int) caracter;
								if( valorASCII < 48 || valorASCII >57 ) {
									if(valorASCII==45) {
										break;
									}
								cont++;
								JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "alert", JOptionPane.ERROR_MESSAGE);
							}
								
						}
						if(cont == 0) break;
					}
					
					
					cantidad = Double.parseDouble(cantidadS);
					
					
					resultado = (cantidad * 9 / 5) + 32;
					JOptionPane.showMessageDialog(null,
							cantidadS + "° grados Celsius son: " + resultado + "° Fahrenheit");
				}else {
					
					for(j =0; j>=cont; j++) {
						if(cont>0)
						{
							cont=0;
						}
						
						//¨¨¨¨¨¨cadena = JOptionPane.showInputDialog("ingrese cadena");
						cantidadS = JOptionPane.showInputDialog("Escriba la temperatura en grados Fahrenheit que va a cambiar");
						//System.out.println("ingresa una palabra: ");
						//cadena = sc.next(); 
						
						for(int v = 0; v < cantidadS.length(); v++ ) {
							char caracter = cantidadS.charAt(v);
							valorASCII = (int) caracter;
								if( valorASCII < 48 || valorASCII >57 ) {
									if(valorASCII==45) {
										break;
									}
								cont++;
								JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros", "alert", JOptionPane.ERROR_MESSAGE);
							}
								
						}
						if(cont == 0) break;
					}
					
					cantidad = Double.parseDouble(cantidadS);
					resultado = (cantidad - 32) * 5 / 9;
					JOptionPane.showMessageDialog(null,
							cantidadS + "° grados Fahrenheit son: " + resultado + "° Celsius");
				}
				
			}
			//pregunta si se quiere repetir o terminar
			opcionRepetir = JOptionPane.showOptionDialog(null, "¿Quiere salir o volver a convertir?",
					"Salir o volver a intentar", 0, JOptionPane.QUESTION_MESSAGE, null, arregloOpcion, "Salir");

		} while (opcionRepetir == 1);

	}
}
