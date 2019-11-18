import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class fileReader
 {

	public static void main(String[] args) throws IOException
{
		TreeMap<String, Integer> h = new TreeMap<String, Integer>();
		BufferedReader input = new BufferedReader(new FileReader(new File("input.txt")));
try {
	        String line = null;
	        while ((line = input.readLine()) != null)
	 {
	        	String[] l = line.split(" ");
	        	for(String s : l)
		{
	        		if(h.containsKey(s))
			{
	        			int counter = h.get(s);
	        			counter++;
	        			h.put(s, counter);
	        		}else
			{
	        			h.put(s, 1);
	        		}
	        	}
	  }
Set<Map.Entry<String, Integer>> entrySet = h.entrySet();

              for (Map.Entry<String, Integer> entry : entrySet) 
	    {

                        System.out.println(entry.getValue() + "\t" + entry.getKey());
	    } 
 input.close();
}
 catch (IOException error)
 {

            System.out.println("Invalid File"); 

}		

}
}