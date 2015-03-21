package printers;

public class SortedByName implements Comparator<LaserPrinter>{

	public int compare(LaserPrinter lp1, LaserPrinter lp2) {
		String str1 = lp1.getName();
        String str2 = lp2.getName();
       
        return str1.compareTo(str2);
	}

}
