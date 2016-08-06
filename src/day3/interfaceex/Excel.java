package day3.interfaceex;

public class Excel implements Office{

	@Override
	public void New() {
		System.out.println("Excel New .xls");
	}

	@Override
	public void Open() {
		System.out.println("Excel Open .xls");
	}

	@Override
	public void Save() {
		System.out.println("Excel Save .xls");
	}

}
