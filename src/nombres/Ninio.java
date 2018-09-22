package nombres;

public class Ninio implements Comparable<Ninio>
{
    protected String nombre = null;
    protected int apariciones = 0;
    
    public Ninio(String nombre, int apariciones)
    {
	this.nombre = nombre;
	this.apariciones = apariciones;
    }

    @Override
    public int compareTo(Ninio o)
    {
	return o.apariciones - this.apariciones;
    }
}
