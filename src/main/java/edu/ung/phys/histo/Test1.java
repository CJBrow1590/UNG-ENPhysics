package edu.ung.phys.histo;


public class Test1 {
public static void main(String[] args) {
	
	Axis v1Axis = new Axis(10, 5, 25); // 10 bins from 5 to 25
	Axis v2Axis = new Axis(5, 0, 10); // 5 bins from 0 to 10
	Axis v3Axis = new Axis(4, 8, 12); // 4 bins from 8 to 12
	
	Histogram hist = new Histogram(v1Axis, v2Axis, v3Axis);
	
	System.out.println(hist.getBinIndices(5.1, 0.1, 8.1));
	System.out.println(hist.getBinIndices(5.1, 0.1, 44.1));
	System.out.println(hist.getBinIndices(1.1, 0.1, 8.1));
	System.out.println(hist.getBinIndices(24.9, 9.9, 11.9));
	System.out.println("");

	hist.fill(5.1, 0.1, 8.1);
	hist.fill(5.1, 0.1, 8.1);
	hist.fill(5.1, 0.1, 44.1);
	hist.fill(1.1, 0.1, 8.1);
	hist.fill(24.9, 9.9, 11.9);
	
	System.out.println(hist.getBinContent(hist.getBinIndices(5.1, 0.1, 8.1)));
	System.out.println(hist.getBinContent(hist.getBinIndices(5.1, 0.1, 44.1)));
	System.out.println(hist.getBinContent(hist.getBinIndices(5.1, 0.1, 44.1)));
}
}
