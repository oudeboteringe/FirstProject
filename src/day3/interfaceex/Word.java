package day3.interfaceex;

public class Word implements Office{

	@Override
	public void New() {
		System.out.println("Word New .xls");
	}

	@Override
	public void Open() {
		System.out.println("Word Open .xls");
	}

	@Override
	public void Save() {
		System.out.println("Word Save .xls");
	}

}
