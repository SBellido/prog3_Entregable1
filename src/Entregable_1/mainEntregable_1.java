package Entregable_1;
/*ENUNCIADO
Utilizando su propia implementación de Lista desarrollada en este práctico, resuelva el siguiente problema: Dada una lista de entrada que contiene números de manera desordenada, se desea obtener todas las sub-secuencias de mayor tamaño posible de números ordenados de manera creciente que tengan longitud mayor o igual a 2.
 
Por ejemplo:
Lista de entrada = []
Salida = [] // No devuelve nada (una sub-secuencia vacía)
Lista de entrada = [1, 2, 3]
Salida = [1, 2, 3] // Una única sub-secuencia
Lista de entrada = [1, 2, 2]
Salida = [1, 2] // Una única sub-secuencia (la sub-secuencia [2] final se ignora por su longitud)
Lista de entrada = [3, 5, 2, 7, 19, 14, 28]
Salida = [3, 5]; [2, 7, 19]; [14, 28] // Tres sub-secuencias
Lista de entrada = [3, 5, 2, 2, 7, 19, 14, 28]
Salida = [3, 5]; [2, 7, 19]; [14, 28] // Tres sub-secuencias (la sub-secuencia [2] se ignora)
 
Editado el 13/4: Para evitar malas interpretaciones se aclaró en negrita que se trata siempre de las sub-secuencias de mayor tamaño posible. Es decir, para la lista de entrada = [1, 2, 3], el resultado debe ser la sub-secuencia [1, 2, 3] y no las sub-secuencias [1,2]; [2,3]
 */


public class mainEntregable_1 {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		DoubleLinkedList finalList = new DoubleLinkedList();

		Integer v1 = 0;
		Integer v2 = 0;
		list.insertFront(28);
		list.insertFront(14);
		list.insertFront(19);
		list.insertFront(7);
		list.insertFront(2);
		list.insertFront(2);
		list.insertFront(5);
		list.insertFront(3);
		MyIterator iterator = (MyIterator) list.iterator();
		list.getSecuense(v1, v2, iterator, finalList);
		
	}

}
