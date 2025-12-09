package myjava;

public class Myarryadd {

	public static void main(String[] args)
	{
		
	     int []arryone= {1,2,3,5};
	     
	     int [] arrytow= {5,7,9,8};
	     
	     int [] sum= new int[arryone.length];
	     
	     for(int i=0;i <arryone.length; i++)
	     {
	    	sum[i]= arryone[i] + arrytow[i];
	     }
	     
	     System.out.println("Arry elements");
	     
	     for(int value:sum)
	     {
	    	 System.out.println(value);
	     }
	     
	      

	}

}
