import java.util.List;
import java.util.Random;

/**
 * 
 */

/**
 * @author chnhideyoshi
 *
 */
public class QuickSort {
	
	public static int middleSort(int[] arr,int low, int high)
	{
		int tmp=arr[low];
		while(low<high)
		{
			while(low<high&&arr[high]>tmp)
				high--;
			arr[low]=arr[high];
			while(low<high&&arr[low]<tmp)
				low++;
			arr[high]=arr[low];
		}
		arr[low]=tmp;
		return low;
	}

	public static void quickSort(int[] arr, int low, int high)
	{
		int middle;
		if(low>=high)return;
		if(low<high)
		{
			middle = middleSort(arr,low,high);
			quickSort(arr,low,middle-1);
			quickSort(arr,middle+1,high);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rng = new Random();
		//System.out.print("haha");
		int[] arr = new int[10];
		//System.out.print(arr.length);
		for(int i=0;i<10;i++)
		{
			int value = rng.nextInt(100);
			arr[i] = value;
			System.out.println(value);
		}
		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(arr[i]);
//		}
		quickSort(arr,0,9);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
