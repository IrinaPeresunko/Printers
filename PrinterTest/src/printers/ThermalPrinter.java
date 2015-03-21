package printers;

class ThermalPrinter extends Printer{
	
	private String colorPrinting="monochrome";
	
	public ThermalPrinter(String name,String nameOfCompany,double printSpeed,String printQuality){
		super(name,nameOfCompany,printSpeed,printQuality);
	}
	public String toString(){
		return super.toString()+"[color printing = "+colorPrinting+"]";
	}
	public void getDescription(){
		System.out.println("Thermal printing (or direct thermal printing) is a digital printing process"
				+ " which produces a printed image by selectively heating coated thermochromic paper,"
				+ " or thermal paper as it is commonly known, when the paper passes over the thermal"
				+ " print head. The coating turns black in the areas where it is heated, producing an image."
				+ " Two-colour direct thermal printers can print both black and an additional colour (often red)"
				+ " by applying heat at two different temperatures.");
	}
	public boolean equals(Object otherObject){
		if (!super.equals(otherObject)) return false;
	    ThermalPrinter other = (ThermalPrinter) otherObject;
	    return colorPrinting.equals(other.colorPrinting);
	}
	public int compareTo(Object obj) {
		double otherPrintSpeed = ((ThermalPrinter)obj).getPrintSpeed();
	    
		if(this.getPrintSpeed()==otherPrintSpeed){
			return 0;
		}
		else{
			return (this.getPrintSpeed() > otherPrintSpeed)?1:-1;
		}
	}
}
