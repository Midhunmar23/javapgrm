package myjava;

import java.util.ArrayList;

public class Arrylist
{
	public static void main (String args [])
	{
		ArrayList<String> Vechiles= new ArrayList<String>();
		
		Vechiles.add("Car");
		Vechiles.add("Train");
		Vechiles.add("Bus");
		Vechiles.add("RLV");
		
		
		Vechiles.add(0, "LMV3");
		
		System.out.print(Vechiles);
	}
	

}
