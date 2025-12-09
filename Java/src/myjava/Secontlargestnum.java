package myjava;

public class Secontlargestnum 
{
	
	public static void main (String args[])
	{
	
	  int [] arry= {1,2,5,9,11,8,4};
	  
	   Integer first=null,  second=null;
	   
	   for(int m: arry)   
	   {
		   
		  
		   
		   if(first==null || m>first)
		   {
			   second=first;
			   
			   first=m;
			   
			   
		   }
		   
		   else if(second==null||m>second && m!= first)
		   {
			   second=m;
		   }
		   
		   if(second!=first)
		   {
			   System.out.println("Second Higset number" + second);
		   }
		   
		   else
		   {
			   System.out.println("Not detime");
		   }
		   
	   }
	  
	  
	}
	  
	    

}
