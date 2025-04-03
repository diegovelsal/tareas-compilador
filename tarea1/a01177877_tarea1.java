import java.util.*;
import java.io.*;

// POO: Clase tarea1
public class a01177877_tarea1 {

    // import java.util.ArrayList;
    public static void arraylist_implementation() {
        // Crear una instancia de la clase ArrayList
        ArrayList<Integer> arraylist = new ArrayList<>();

        // Agregar elementos al arraylist
        arraylist.add(1); // insert
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);

        // Mostrar el arraylist
        System.out.println("Elementos en el arraylist: " + arraylist);

        // Mostrar tamaño del arraylist
        System.out.println("Tamaño del arraylist: " + arraylist.size());

        // Mostrar/extraer un elemento del arraylist
        System.out.println("Elemento en la posición 2 extraído del arraylist: " + arraylist.get(2)); // get

        // Eliminar último elemento del arraylist
        arraylist.remove(arraylist.size() - 1); // remove

        // Mostrar el arraylist después de eliminar un elemento
        System.out.println("Elementos en el arraylist después de eliminar último elemento: " + arraylist);

        // Iteración de un ArrayList
        for (Integer element : arraylist) {
            System.out.println("Elemento: " + element);
        }

        // Limpiar el ArrayList
        arraylist.clear(); // clear
    }

    // import java.util.Stack;
    public static void stack_implementation() {
        // Crear una instancia de la clase Stack
        Stack<Integer> stack = new Stack<>();

        // Agregar elementos al stack
        stack.push(1); // insert
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Mostrar el stack
        System.out.println("Elementos en el stack: " + stack);

        // Mostrar tamaño del stack
        System.out.println("Tamaño del stack: " + stack.size());

        // Mostar/popear el último elemento agregado al stack
        while (!stack.isEmpty()) {
            System.out.println("Elemento en la parte superior del stack eliminado: " + stack.pop()); // pop
        }
    }

    // import java.util.LinkedList;
    // import java.util.Queue;
    public static void queue_implementation() {
        // Crear una instancia de la clase Queue
        Queue<Integer> queue = new LinkedList<>();

        // Agregar elementos a la queue
        queue.add(1); // insert
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Mostrar la queue
        System.out.println("Elementos en la queue: " + queue);

        // Mostrar tamaño de la queue
        System.out.println("Tamaño de la queue: " + queue.size());

        // Mostrar/extraer el primer elemento agregado a la queue
        while (!queue.isEmpty()) {
            System.out.println("Elemento en la parte superior de la queue eliminado: " + queue.poll()); // poll
        }
    }

    // import java.util.HashMap;
    public static void hashmap_implementation() {
        // Crear una instancia de la clase HashMap
        HashMap<String, Integer> hashmap = new HashMap<>();

        // Agregar elementos al hashmap
        hashmap.put("Uno", 1); // insert
        hashmap.put("Dos", 2);
        hashmap.put("Tres", 3);
        hashmap.put("Cuatro", 4);
        hashmap.put("Cinco", 5);

        // Mostrar el hashmap
        System.out.println("Elementos en el hashmap: " + hashmap);

        // Mostrar tamaño del hashmap
        System.out.println("Tamaño del hashmap: " + hashmap.size());

        // Mostrar/extraer un elemento del hashmap
        System.out.println("Elemento Tres extraído del hashmap: " + hashmap.get("Tres")); // get

        // Eliminar un elemento del hashmap
        hashmap.remove("Cuatro"); // remove

        // Mostrar el hashmap después de eliminar un elemento
        System.out.println("Elementos en el hashmap después de eliminar 'Cuatro': " + hashmap);

        // Verificar si un elemento existe en el hashmap
        if (hashmap.containsKey("Cuatro") == true) { // containsKey
            System.out.println("El elemento 'Cuatro' existe en el hashmap.");
        } else {
            System.out.println("El elemento 'Cuatro' no existe en el hashmap.");
        }

        // Comparar dos hashmaps
        HashMap<String, Integer> hashmap2 = new HashMap<>();
        System.out.println("El hashmap es igual al hashmap2: " + hashmap.equals(hashmap2)); // equals

        // Iteración de un hashmap
        for (Map.Entry<String, Integer> entry : hashmap.entrySet()) {
            String key = entry.getKey(); // getKey
            Integer value = entry.getValue(); // getValue
            System.out.println("Clave: " + key + ", Valor: " + value);
        }

        // Limpiar el hashmap
        hashmap.clear(); // clear
    }

    // import java.util.HashSet;
    public static void hashset_implementation() {
        // Crear una instancia de la clase HashSet
        HashSet<Integer> hashset = new HashSet<>();

        // Agregar elementos al hashset
        hashset.add(1); // insert
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(5);

        // Mostrar el hashset
        System.out.println("Elementos en el hashset: " + hashset);

        // Mostrar tamaño del hashset
        System.out.println("Tamaño del hashset: " + hashset.size());

        // Mostrar/extraer un elemento del hashset
        System.out.println("Elemento 3 extraído del hashset: " + hashset.contains(3)); // contains

        // Eliminar un elemento del hashset
        hashset.remove(2); // remove

        // Mostrar el hashset después de eliminar un elemento
        System.out.println("Elementos en el hashset después de eliminar '2': " + hashset);

        // Verificar si un elemento existe en el hashset
        if (hashset.contains(2) == true) { // contains
            System.out.println("El elemento '2' existe en el hashset.");
        } else {
            System.out.println("El elemento '2' no existe en el hashset.");
        }

        // Comparar dos hashsets
        HashSet<Integer> hashset2 = new HashSet<>();
        System.out.println("El hashset es igual al hashset2: " + hashset.equals(hashset2)); // equals

        // Iteración de un hashset
        for (Integer element : hashset) {
            System.out.println("Elemento: " + element);
        }

        // Limpiar el hashset
        hashset.clear(); // clear
    }

    // import java.util.PriorityQueue;
    public static void heap_implementation() {
        // Crear una instancia de la clase PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Agregar elementos al minHeap
        minHeap.add(5); // insert
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(1);
        minHeap.add(4);

        // Mostrar el minHeap (MUESTRA ORDENADO)
        System.out.println("Elementos en el heap: " + minHeap);

        // Mostrar tamaño del minHeap
        System.out.println("Tamaño del heap: " + minHeap.size());

        // Mostrar/extraer el elemento con la prioridad más alta (menor valor)
        while (!minHeap.isEmpty()) {
            System.out.println("Elemento con la prioridad más alta eliminado: " + minHeap.poll()); // poll
        }

        // Crear una maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Agregar elementos al maxHeap
        maxHeap.add(5); // insert
        maxHeap.add(3);
        maxHeap.add(8);
        maxHeap.add(1);
        maxHeap.add(4);

        // Mostrar el maxHeap (MUESTRA ORDENADO)
        System.out.println("Elementos en el maxHeap: " + maxHeap);

        // Mostrar tamaño del maxHeap
        System.out.println("Tamaño del maxHeap: " + maxHeap.size());

        // Mostrar/extraer el elemento con la prioridad más baja (mayor valor)
        while (!maxHeap.isEmpty()) {
            System.out.println("Elemento con la prioridad más baja eliminado: " + maxHeap.poll()); // poll
        }
    }

    // Método principal, método main
    public static void main(String[] args) {
        try {
            // Redirigir la salida estándar a un archivo
            PrintStream fileOut = new PrintStream(new File("a01177877_tarea1.txt"));
            System.setOut(fileOut);
        } catch (Exception e) {
            System.out.println("Error al redirigir la salida a un archivo: " + e.getMessage());
        }
        
        // Llamada a método arraylist_implementation
        System.out.println("Ejemplo de ArrayList:");
        System.out.println("=========================================");
        arraylist_implementation();
        System.out.println("=========================================\n");

        // Llamada a método stack_implementation
        System.out.println("Ejemplo de Stack:");
        System.out.println("=========================================");
        stack_implementation();
        System.out.println("=========================================\n");

        // Llamada a método queue_implementation
        System.out.println("Ejemplo de Queue:");
        System.out.println("=========================================");
        queue_implementation();
        System.out.println("=========================================\n");

        // Llamada a método hashmap_implementation
        System.out.println("Ejemplo de HashMap:");
        System.out.println("=========================================");
        hashmap_implementation();
        System.out.println("=========================================\n");

        // Llamada a método hashset_implementation
        System.out.println("Ejemplo de HashSet:");
        System.out.println("=========================================");
        hashset_implementation();
        System.out.println("=========================================\n");

        // Llamada a método heap_implementation
        System.out.println("Ejemplo de Heap:");
        System.out.println("=========================================");
        heap_implementation();
        System.out.println("=========================================\n");
    }
}