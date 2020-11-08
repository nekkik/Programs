import java.util.* ;
import java.lang.*;

class ListPermutation
{
	public static void main(String args[])
	{
		List<List<Integer>> list1 = new ArrayList<>();
		int [] nums = new int[]{1,2,3,4};
		int n = nums.length;

		permutation(list1, nums , n);
	}

	public static void permutation(List<List<Integer> >list1 , int[] nums, int n )
	{
		List<List<Integer>>  result = new ArrayList<>(list1);
		int i  = 0;
		result = permu2(result, nums, n, i);
		System.out.println(result);
	}

	public static List<List<Integer>> permu2(List<List<Integer>> list1 , int []nums , int n, int i)
	{

		List<Integer> list2 = new ArrayList<>();
		if(i==n)
		{	for(int x:nums)
				{list2.add(x);}

			list1.add(list2);
		}
		
		else
			for(int j=i;j<n;j++)
			{
				int temp = 0;
				temp = nums[i];
				nums[i]=nums[j];
				nums[j]=temp;

				permu2(list1, nums, n , i+1);

				temp = nums[i];
				nums[i]=nums[j];
				nums[j]=temp;


			}	
			return list1;
	}
}