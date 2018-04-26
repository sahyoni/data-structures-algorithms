package come.ds;

public class DynamicDemo {

	public static void main(String[] args) {
		Dynamic dArray= new Dynamic();
		dArray.put(4);
		System.out.println("size" + dArray.getSize());
		dArray.put(13);
		System.out.println("size" + dArray.getSize());
		dArray.put(14);
		System.out.println("size" + dArray.getSize());
		dArray.put(15);
		System.out.println("size" + dArray.getSize());
		dArray.put(16);
	}

}
