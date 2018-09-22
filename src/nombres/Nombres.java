package nombres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Nombres
{
    public static void resolver(String path) throws IOException
    {
	// Archivo de entrada
	Scanner sc = new Scanner(new File(path + ".in"));
	
	// Arbol de pares
	TreeMap<String, Integer> nombres = new TreeMap<String, Integer>();
	
	// Cantidad de nombres a leer
	int n = sc.nextInt();
	
	// Cantidad de nombres a retornar
	int b = sc.nextInt();

	// Cargo los nombres
	for (int i = 0; i < n; i++)
	{
	    String nombre = sc.next();
	    
	    if(nombres.containsKey(nombre))
	    {
		int value = nombres.get(nombre) + 1;
		
		nombres.replace(nombre, value);
	    }
	    else
	    {
		nombres.put(nombre, 1);
	    }
	}
	
	// Cantidad de ninios cargados en el arbol
	int cantidad = nombres.size();
	
	Ninio [] nenes = new Ninio[cantidad];
	
	for (int i = 0; i < cantidad; i++)
	{
	    // Saco del arbol y lo meto en el array
	    Map.Entry<String, Integer> auxiliar = nombres.pollFirstEntry();
	    nenes[i] = new Ninio(auxiliar.getKey(), auxiliar.getValue());
	}
	
	// FIN DE LA LECTURA
	sc.close();
		
	// Ordeno por cantidad de apariciones
	Arrays.sort(nenes);
	
	if(b > nenes.length)
	{
	    b = nenes.length;
	}

	// PROCESO/ESCRITURA
	PrintWriter out = new PrintWriter(new FileWriter(path + ".out"));
	
	for (int i = 0; i < b; i++)
	{
	    if(nenes[i].apariciones > 1)
	    {
		out.println(nenes[i].nombre + " " + nenes[i].apariciones);
	    }
	}
	
	// FIN DE LA ESCRITURA
	out.close();
    }
}
