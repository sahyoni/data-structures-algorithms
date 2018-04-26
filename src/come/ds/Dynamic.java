package come.ds;

import java.util.Arrays;

public class Dynamic {
int[] data;//array
int size;//int for the array size
	public Dynamic() {//inistialize any new instance
		size=1;//defulte size for any new instance = 1
		data= new int[size];
		// TODO Auto-generated constructor stub
	}
	public int getSize() {
return data.length;	
	}
public int get(int index) {//getter
	return data[index];//the return value is int
}
public void put(int element) {//setter (add element to the array)
	ensureCapacity(size+1);//check the cabacity
	data[size++]=element;
	
}
public void ensureCapacity(int minCapacity) {//is the size enough for the adding?
	int oldCapacity=data.length;
	if(minCapacity>oldCapacity) {//the new size > the old size?
		int newCapacity=oldCapacity*2;//if yes, make the size double (*2)
		if(newCapacity<minCapacity)
			newCapacity=minCapacity;
		data= Arrays.copyOf(data, newCapacity);//assign the new values to a new array with double size
	}
}
}
