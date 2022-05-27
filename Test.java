
public class Test {
	
	public static void main() {
		
		AutoFactory audi= new AudiFactory();
		
		for (final Auto auto: audi.getautoList()) {
			
			System.out.println(auto.getMarka()+" "+auto.getmodel()+" "+auto.getBeygirGucu()+" ");
			
		}
		
	}

}
