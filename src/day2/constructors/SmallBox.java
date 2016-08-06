package day2.constructors;

public class SmallBox {
	int length;
	int width;
	
	SmallBox(){
		this.length = 5;
		this.width = 6;
		System.out.println("Constructor fired");
	}
	
	SmallBox(int len, int wid){
		length = len;
		width = wid;
	}
	
	void calculateArea(){
		System.out.println("Area = " + (length * width));
	}
}
