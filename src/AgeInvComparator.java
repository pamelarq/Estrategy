
public class AgeInvComparator implements Comparator<Persona> {
	
	public int compare (Persona source, Persona target)
	{
		return target.age - source.age;
	}

}
