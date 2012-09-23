
public class AgeComparator implements Comparator<Persona> {
	
	public int compare (Persona source, Persona target)
	{
		return source.age - target.age;
	}

}
