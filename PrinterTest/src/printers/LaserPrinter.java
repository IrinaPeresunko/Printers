package printers;

class LaserPrinter extends Printer{
	
	public LaserPrinter(String name,String nameOfCompany,double printSpeed,String printQuality){
		super(name,nameOfCompany,printSpeed,printQuality);
	}
	public String toString(){
		return super.toString();
	}
	public void getDescription(){
		System.out.println("Laser printing is an electrostatic digital printing process."
				+ " It produces high-quality text and graphics (and moderate-quality photographs)"
				+ " by repeatedly passing a laser beam back and forth over a negatively charged"
				+ " cylindrical drum to define a differentially-charged image");
	}
	public boolean equals(Object otherObject){
		if (!super.equals(otherObject)) return false;
		else return true;
	}
	public int compareTo(Object obj) {
		double otherPrintSpeed = ((LaserPrinter)obj).getPrintSpeed();
	    
		if(this.getPrintSpeed()==otherPrintSpeed){
			return 0;
		}
		else{
			return (this.getPrintSpeed() > otherPrintSpeed)?1:-1;
		}
	}

}
