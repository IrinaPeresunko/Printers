package printers;

class InkJetPrinter extends Printer{
	
	public InkJetPrinter(String name,String nameOfCompany,double printSpeed,String printQuality){
		super(name,nameOfCompany,printSpeed,printQuality);
	}
	public String toString(){
		return super.toString();
	}
	public void getDescription(){
		System.out.println("Inkjet printing is a type of computer printing that recreates"
				+ " a digital image by propelling droplets of ink onto paper, plastic, or other substrates."
				+ "Inkjet printers are the most commonly used type of printer, and range "
				+ "from small inexpensive consumer models to very large professional machines"
				+ " that can cost tens of thousands of dollars, or more.");
	}
	public boolean equals(Object otherObject){
		if (!super.equals(otherObject)) return false;
		else return true;
	}
	

	public int compareTo(Object obj) {
		double otherPrintSpeed = ((InkJetPrinter)obj).getPrintSpeed();
	    
		if(this.getPrintSpeed()==otherPrintSpeed){
			return 0;
		}
		else{
			return (this.getPrintSpeed() > otherPrintSpeed)?1:-1;
		}
	}
}
