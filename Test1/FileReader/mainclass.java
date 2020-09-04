package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class mainclass {

	public static void doReadFile(String path) throws Exception
	{
		File f = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		String line = "";
		HashMap<Integer,HashSet<String>> map=new HashMap<>();
		
		while((line = br.readLine())!= null)
		{
			String str[]=line.split(" ");
			for(String s:str)
				if(s.length()>=4)
				{
					int len=s.length();
					while( len>=2 && (s.charAt(len-1)=='.' || s.charAt(len-1)=='!' || s.charAt(len-1)==':' || s.charAt(len-1)==',') )	
						len--;
					if(len>=4) {
						Set<String> x=map.get(len);
						if(x==null)
							x=new HashSet<String>();
						x.add(s.substring(0,len));
						map.put(len,(HashSet<String>) x);
					}
				}
		}
	
		
		for(int i:map.keySet())
		{
			System.out.println("words with length:"+i +" are -");
			for(String s:map.get(i))
				System.out.print(s+",");
			System.out.print("\n");
		}
		
		
		br.close();
	}
	public static void main(String[] args) {
		
		String file_path="C:\\Users\\smaheshwari\\Desktop\\Test-master\\CaseStudy.txt";
	
		try {
			mainclass.doReadFile(file_path);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("file not found, please check the file path and try again!");
		}
		
		
	}
}
