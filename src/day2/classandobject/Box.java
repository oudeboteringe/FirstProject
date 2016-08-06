package day2.classandobject;

public class Box {
	int length;
	int width;
	
	int calculateArea(int length, int width){
		int area = length * width;
		System.out.println("Area = " + area);
		return area;
	}

}
