package come.ds;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//One dimensional Array
		int[] number= new int[5];//Array length 5 (0,1,2,3,4)
		number[0]=1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		System.out.println("simple array");
		for(int i=0;i<number.length;i++)
			System.out.print(number[i] + "\t");
		//Array of objects
		System.out.println("\nobject array");
		Students[] stu= new Students[3]; //(Array of objects)data type, opject name, new instanse from the object
		stu[0]= new Students("mohammad", 1);
		stu[1]= new Students("john", 2);
		stu[2]= new Students("don", 3);
		for (Students students : stu) {//for each|students|
			System.out.println("stuent name:" + students.name +"\t"+"id:" + students.id);
		}
		//tow dimensional Array
		int[][] data= new int[3][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		data[2][0]=7;
		data[2][1]=8;
		data[2][2]=9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(data[i][j]+ "\t");
			System.out.println("\n");
		}
	}

}
