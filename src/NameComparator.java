
public class NameComparator implements Comparator <Persona>{
	
	public int compare (Persona source, Persona target)
	{
		return source.name.compareTo(target.name);
	}
}
