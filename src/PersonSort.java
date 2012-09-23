
public class PersonSort {
	

		static Persona [] p = {
				new Persona ("Juan",21,734567),
				new Persona ("Ana",19,238732),
				new Persona ("Luis",15,127306)
		};
		
		
		public static <T> void sort (T [] p, Comparator<T> comp)
		{
			for (int i=0; i<p.length;i++)
				for(int j=i; j< p.length;j++)
					if (comp.compare(p[i],p[j])>0){
						T temp = p[i];
						p[i]=p[j];
						p[j]=temp;
					}
			
		}
		public static void main (String [] args)
		{
			Comparator<Persona> Comparator = new AgeInvComparator();
			sort(p, Comparator);
			for (int i=0; i<p.length ; i++)
				System.out.println(p[i].name + " - "+ p[i].age + " - "+ p[i].DNI);
		}
}
