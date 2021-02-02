//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListLast
{
	public static boolean go( List<Integer> ray)
	{
    int last = ray.get(ray.size() - 1);

    //create for loop with int x of ray
    for(int x = 0; x < ray.size() - 1; x++){

      //create if loop to compare the last number to current number in arraylist
      if(ray.get(x) == last){
        //return true
        return true;
      }
    }
    //return false
    return false;
	}
}