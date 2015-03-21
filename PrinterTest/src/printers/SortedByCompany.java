package printers;

public class SortedByCompany implements Comparator<ThermalPrinter>{

	public int compare(ThermalPrinter tp1, ThermalPrinter tp2) {
		String str1 = tp1.getNameOfCompany();
        String str2 = tp2.getNameOfCompany();
       
        return str1.compareTo(str2);
	}

}
