package printers;

abstract class Printer implements Comparable<Object>{
	private String name;
	private String nameOfCompany;
	private double printSpeed;
	private String printQuality;
	
	public abstract void getDescription();
	
	public Printer(String name,String nameOfCompany,double printSpeed,String printQuality){
		this.name=name;
		this.nameOfCompany=nameOfCompany;
		this.printSpeed=printSpeed;
		this.printQuality=printQuality;
	} 
	
	public boolean equals(Object otherObject){
		
		if (this == otherObject) return true;
	  	if (otherObject == null) return false;
	  	if (getClass() != otherObject.getClass()) return false;

	  	Printer other = (Printer) otherObject;
	  	return name.equals(other.name) && nameOfCompany.equals(other.nameOfCompany) &&
	    		  printSpeed == other.printSpeed && printQuality.equals(other.printQuality);
	}
	public String toString(){
		return getClass().getName()+"[name = "+name+" , "+"company = "+nameOfCompany+" , "+
				"print speed = "+printSpeed+" , "+ "print quality = "+printQuality+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public double getPrintSpeed() {
		return printSpeed;
	}
	public void setPrintSpeed(double printSpeed) {
		this.printSpeed = printSpeed;
	}
	public String getPrintQuality() {
		return printQuality;
	}
	public void setPrintQuality(String printQuality) {
		this.printQuality = printQuality;
	}

}
