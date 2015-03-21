package printers;

public class SortedByPrintSpeed implements Comparator<InkJetPrinter>{

	public int compare(InkJetPrinter ijp1, InkJetPrinter ijp2) {
		double printSpeed1 = ijp1.getPrintSpeed();
		double printSpeed2 = ijp2.getPrintSpeed();
	    
		if(printSpeed1==printSpeed2){
			return 0;
		}
		else{
			return (printSpeed1 > printSpeed2)?1:-1;
		}
	}

}
