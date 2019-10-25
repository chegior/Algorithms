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
		System.out.println("and after the return value is :" + union(data[1],data[9]));		
		}
		
	public static int union(int p, int q) {
		System.out.println("Here at function union"+ p +" and " + q);
		return p+q;
	}
	}