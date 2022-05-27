import java.util.ArrayList;

public abstract class AutoFactory {
	
	private ArrayList<Auto> autoList =new ArrayList<Auto>();
	
	public AutoFactory () {
		createAuto();
	}
	
	public abstract void createAuto();
	
	public ArrayList<Auto> getautoList (){
		return autoList;
	}
	
	public void setAutoList (final ArrayList<Auto> autoList){
		
		this.autoList=autoList;
	}

}
