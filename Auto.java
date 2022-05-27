
public  abstract class Auto {
	
	
	private String marka=null;
	private String model=null;
	private int beygirGucu=0;
	
	public Auto(final String marka, final String model, final int beygirGucu) {
		
		setMarka(marka);
		setModel(model);
		setBeygirGucu(beygirGucu);
	
	}
	
	public String getMarka() {
		
		return marka;
		
	}
	
	public void setMarka(String marka) {
		
		this.marka=marka;
	}
	
	public String getmodel() {
		
		return model;
		
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public int getBeygirGucu() {
		
		return beygirGucu;
	}
	
	public void setBeygirGucu(int beygirGucu) {
		
		this.beygirGucu=beygirGucu;
	}
	
	

}
