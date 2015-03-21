package printers;

import java.util.Arrays;

public class PrinterTest {

	public static void main(String[] args) {
		Printer[] printers = new Printer[3];
		
		printers[0]=new InkJetPrinter("Ink jet printer","Samsung",60,"average");
		printers[1]=new LaserPrinter("Laser printer","Canon",100,"excellent");
		printers[2]=new ThermalPrinter("Thermal printer","HP",80,"good");
		
		for(Printer i:printers){
			System.out.println(i);
		}
		
		System.out.println("inkJetPrinter.equals(LaserPrinter): " + printers[0].equals(printers[1]));

		ThermalPrinter testThermalPrinter=new ThermalPrinter("Thermal printer","HP",80,"good");
		
		System.out.println("testThermalPrinter.equals(ThermalPrinter): " + 
								testThermalPrinter.equals(printers[2]));
		
		
		LaserPrinter[] laserPrinters = new LaserPrinter[3];
		laserPrinters[0]=new LaserPrinter("Laser printer1","Canon",100,"excellent");
		laserPrinters[1]=new LaserPrinter("Laser printer2","HP",150,"good");
		laserPrinters[2]=new LaserPrinter("Laser printer3","Samsung",80,"average");
		
		Arrays.sort(laserPrinters);
		System.out.println("After sorting:(Comparable)");
		for(LaserPrinter i:laserPrinters){
			System.out.println(i);
		}
		
	}

}
