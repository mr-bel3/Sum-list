
public class Summing2 
{
	public static int addIterative(int list[])
	{
		int sum = 0;
		for (int i=0 ;i < list.length; i++ )
		{
			sum += list[i];
		}
		return sum;
	}
	
	public static int addRecursive(int list[])
	{
		return addRecursion(list, 0);
	}
	
	public static int addRecursion(int list[], int startIndex)
	{
		if (list.length == startIndex)
		{
			return 0;
		}
		
		else
		{
			
			return list[startIndex ] + addRecursion(list, startIndex + 1);
		}
	}
		
		

	public static void main(String[] args) 
	{
		int nums[] = {2,3,43,24,54,645,64};
		System.out.println(addRecursion(nums,0));
	}

}
