import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Containers 
{
	int count;
	HashMap<String,Integer> store=new HashMap<String,Integer>();
	
	Containers()
	{
		//int random = (int )(Math.random() * 10 + 1);
		//System.out.println(random);
		
		unique();
		
		
	}
	public void unique()
	{
	       ArrayList<Integer> unique = new ArrayList<Integer>();
	        for (int i=1; i<11; i++) 
	        {
	            unique.add(new Integer(i));
	        }
	        
	        Collections.shuffle(unique);
	        
	        for (int i=0; i<4; i++) 
	        {
	            //System.out.println(unique.get(i));
	        	switch(unique.get(i))
	        	{
		        	case(1):store.put("red", i+1);
		        			break;
		        	case(2):store.put("blue", i+1);
	    					break;
		        	case(3):store.put("green", i+1);
	    					break;
		        	case(4):store.put("white", i+1);
	    					break;
		        	case(5):store.put("black", i+1);
	    					break;
		        	case(6):store.put("yellow", i+1);
	    					break;
		        	case(7):store.put("violet", i+1);
	    					break;
		        	case(8):store.put("indigo", i+1);
	    					break;
		        	case(9):store.put("orange", i+1);
	    					break;
		        	case(10):store.put("grey", i+1);
	    					break;
    			
	        	}
	        	
	        	
	        }
	        //System.out.println(store.toString());
	        
	}
	
	public int check(String a,String b,String c,String d)
	{
		count++;
		int hit=0;
		int pseudohit=0;
		
		if(store.containsKey(a))
		{
			if(store.get(a)==1)
			{
				hit++;
			}
			else
			{
				pseudohit++;
			}
		}
		if(store.containsKey(b))
		{
			if(store.get(b)==2)
			{
				hit++;
			}
			else
			{
				pseudohit++;
			}
		}
		if(store.containsKey(c))
		{
			if(store.get(c)==3)
			{
				hit++;
			}
			else
			{
				pseudohit++;
			}
		}
		if(store.containsKey(d))
		{
			if(store.get(d)==4)
			{
				hit++;
			}
			else
			{
				pseudohit++;
			}
		}
		System.out.println();
		System.out.println("                                   RESULTS");
		System.out.println("Hit :"+hit);
		System.out.println("pseudohit :"+pseudohit);
		System.out.println("Number of attempts so far :"+count);
		
		if(hit==4)
		{

			return count;
			
		}
		
		return 0;
		
	}
}
