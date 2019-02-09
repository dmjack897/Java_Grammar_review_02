package pra_2019_02_08_01;
import java.util.*;

public class pra_01 {
/*
  //サイズ指定配列の整列(feat.bubble sort)
	static int[] array = new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("-----------------------");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
*/
}

/*  
 	//サイズが決まっている配列の整列(feat.bubble sort)
Scanner sc = new Scanner(System.in);
int[] array = new int[5];
int num=0,min=100,index=0;
for(int i=0;i<5;i++)
{
	array[i] = sc.nextInt();
}

for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}

System.out.println("-------------------------");
for(int i=0;i<array.length;i++)
{
	for(int j=0;j<array.length-1-i;j++)
	{
		if(array[j]>array[j+1])
		{
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
		}
	}
}

for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
*/

