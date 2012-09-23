

public class DniComparator implements Comparator<Persona> {
	
	public int compare (Persona source, Persona target)
	{
		return source.DNI- target.DNI;	
	}

}
