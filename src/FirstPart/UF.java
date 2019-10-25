package FirstPart;

import java.util.Arrays;

public class UF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = new int [10];
		for(int i = 0; i < 10;i++)
		{
			data[i]=i*1;
			System.out.println(i);
		}
		System.out.println("Hello World " + Arrays.toString(data));
		}
	}
