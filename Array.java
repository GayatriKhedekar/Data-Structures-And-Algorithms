
public class Array {
	 int[] arr;
	
	int count=0;
	
public void display(int[] arr)
{
	for(int i=0; i<arr.length ; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public void reverseDisplay(int[] arr)
{
	for(int i=arr.length-1; i>=0 ; i--)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public void minimumNo(int[] arr)
{
  int min=arr[0];
   for(int i=0; i<arr.length; i++)
   {
	   if(min>arr[i])
	   {
		   min=arr[i];
	   }
   }
   System.out.println("minimum number "+min);  
}
public void maximumNo(int[] arr)
{
  int max=arr[0];
   for(int i=0; i<arr.length; i++)
   {
	   if(max<arr[i])
	   {
		   max=arr[i];
	   }
   }
   System.out.println("maximum number "+max);  
}
public void shiftZeroToLeft(int[] arr)
{
	int temp;
	for(int i=0; i<arr.length-1;i++)
	{
	     if(arr[i]==0)
	     {
	    	 temp=arr[i];
	    	 arr[i]=arr[i+1];
	    	 arr[i+1]=temp;
	     }
		
	}
}
public int[] resize(int[] arr,int capacity)
{
	int[] temp=new int[capacity];
			for(int i=0;i<arr.length;i++)
			{
				temp[i]=arr[i];
			}
	arr=temp;
	return arr;
}
public void arrayDemo()
{
	int[] arr=new int[5];
	display(arr);
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	display(arr);
	reverseDisplay(arr);
	minimumNo(arr);
	maximumNo(arr);
	arr[2]=0;
	display(arr);
	reverseDisplay(arr);
	minimumNo(arr);
	maximumNo(arr);
	shiftZeroToLeft(arr);
	display(arr);
	reverseDisplay(arr);
	minimumNo(arr);
	maximumNo(arr);

	
}
public static void main(String[] args) {
	Array array=new Array();
	array.arrayDemo();
	int[] original=new int[] {5,1,3,4,8};
	System.out.println("size of array"+original.length);
	original=array.resize(original, 10);
	System.out.println("size of array after resize "+original.length);
	
}

}
