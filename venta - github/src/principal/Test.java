package principal;

import leer.Leer;


public class Test {

	public static void main(String[] args) {
		/*
		 * SÃ³lo se debe aÃ±adir mÃ©todos para establecer los valores de los
		 * atributos, poder imprimirlos datos en pantalla y calcular cantidad a
		 * pagar segÃºn el precio de venta. De momento, no hace falta gestionar
		 * el almacÃ©n con los artÃ­culos que quedan, sÃ³lo se pedirÃ¡ la cantidad
		 * de artÃ­culos que lleva el cliente y se darÃ¡ el precio a pagar segÃºn
		 * esa cantidad.
		 */

		System.out
				.println("Bienvenido a la tienda de JUEGOS, MÃšSICA Y PELÃ�CULAS\n--------\n"
						+ "El programa simula una tienda que vende juegos, mÃºsica y pelÃ­culas\n"
						+ "Los artÃ­culos sÃ³lo se pueden vender si estÃ¡n disponibles en la tienda\n"
						+ "El usuario puede:\n"
						+ "\t Comprar productos de los existentes.\n"
						+ "\t AÃ±adir nuevos productos a la cesta.\n"
						+ "\t Consultar el importe de la cuenta.");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; // Variables para seleccionar el
												// producto y la cantidad que se
												// quiere comprar

		// Se instancian y cargan los productos
		Producto disco1 = new Musica("Portishead", 18.53, 6, true, "Trip Hop");
		Producto disco2 = new Musica("Radiohead", 21.2, 20, true, "Rock");
		Producto cine1 = new Cine("Hierro 3", 30.2, 5, true, "Kim Ki Duk");
		Producto juego1 = new Videojuego("Mario Bross", 35.11, 400, false,"Plataformas");
		Producto juego2 = new Videojuego("Tomb Raider", 35.11, 300, false,"Plataformas");
		Producto juego3 = new Videojuego("fifa", 35.11, 10, false,"Plataformas");
		Producto cine2 = new Cine("El hombre araña", 30.2, 5, true, "chackie chan");
		// Se crea el array "catÃ¡logo" para contener los productos. Su dimensiÃ³n
		// viene del nÃºmero de veces que se
		// instancia el contructor de Producto
		Producto catalogo[] = new Producto[Producto.dimesionArray];
		// Se crea el objeto gestion para trabajar (mostrar y vender productos,
		// y mostrar caja)
		Gestion gestion = new Gestion();

		// Se rellena el array catÃ¡logo
		catalogo[0] = disco1;
		catalogo[1] = disco2;
		catalogo[2] = cine1;
		catalogo[3] = juego1;
		catalogo[4] = juego2;
		catalogo[5] = juego3;
		catalogo[5] = cine2;
		do {
			System.out.println("\n\nIntroduzca la opciÃ³n que desea realizar:\n"
					+ "1. Mostrar productos\n" + "2. Vender productos\n"
					+ "3. Mostrar caja\n"
					+ "SALIR --> Pulse cualquier otro nÃºmero\n");
			switch (Leer.datoInt()) {
			case 1:
				gestion.mostrarProductos(catalogo);
				break;
			case 2:
				System.out.println("Â¿Que producto desea comprar?");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("Â¿CuÃ¡nta cantidad desea comprar?");
				lecturaCantidad = Leer.datoInt();
				// Se carga el producto y la cantidad solicitada por el usuario
				gestion.comprarProducto(catalogo, lecturaProducto,
						lecturaCantidad);
				break;
			case 3:
				System.out.println(gestion.mostrarCaja() + " â‚¬");
				break;
			default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		System.out.println("---- Gracias por usar la aplicaciÃ³n. ----");

	}

}
