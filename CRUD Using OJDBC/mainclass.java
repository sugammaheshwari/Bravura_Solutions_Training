import java.sql.SQLException;
import java.util.*;

public class mainclass {

	public static void main(String[] args)
	{
		DataBaseConnectionClass db_obj=null;
		try {
			db_obj=new DataBaseConnectionClass();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Couldn't Establish a connection to the data base , Try again !");
		}
		
		//insert(db_obj,7,"uv","stud",18);
		
		update_by_id(db_obj,999,1,"Maheshwari","Sugam",22);
		
		show_all(db_obj);
		
		//get_in_range(db_obj,10000,10000);
	}
	
	
	public static void insert(DataBaseConnectionClass db_obj,int id,String last,String first,int age)
	{
		boolean i=false;
		try {
			i=db_obj.insert_entry(id,last,first,age);
			if(i==true)
				System.out.println("insert Successfull!");
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("COUDNT INSERT!");
			}
		if(i==false)
			System.out.println("COUDNT INSERT!");
	}
	
	public static void show_all(DataBaseConnectionClass db_obj)
	{
		List<person2> list = null;
		try {
			list=db_obj.get_all_records();
			display_(list);
			System.out.println("Fetched all records!");
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("ERORRRRR!!!!");
		}
		
		if(list.size()==0)
			System.out.println("Empty DataBase!!!");
	}
	
	public static void get_in_range(DataBaseConnectionClass db_obj,int a1,int a2)
	{
		List<person2> list=null;
		try {
			list=db_obj.get_student_range(a1, a2);
			display_(list);
			System.out.println("Fetched all records!");
		}catch(Exception e)
		{
			System.out.println(e);
			System.out.println("ERORRRRR!!!!");
		}
		
		if(list.size()==0)
			System.out.println("No results Found !");
	}
	
	
	public static void update_by_id(DataBaseConnectionClass db_obj,int oid,int nid,String last,String first,int age)
	{ 
		boolean i=false;
		try {
			i=db_obj.update_entry_by_id(oid,nid,last,first,age);
			if(i==true)
				System.out.println("UPDATED :" + oid +"->" + nid);
		}
		catch(Exception e)
		{
			System.out.println(e + "NOT ABLE TO update :" + oid +"->" + nid);
		}
		
		if(i==false)
			System.out.println("NOT ABLE TO update :" + oid +"->" + nid);
	}
	
	public static void delete_by_id(DataBaseConnectionClass db_obj,int oid)
	{
		boolean i=false;
		try {
			i=db_obj.delete_entry_by_ID(oid);
			System.out.println("DELETED entry with ID :" + oid );
		}
		catch(Exception e)
		{
			System.out.println(e + "NOT ABLE TO delete entry with ID :" + oid );
		}
		
		if(i==false)
			System.out.println("NOT ABLE TO delete entry with ID :" + oid );
		
	}
	
	public static void display_(List<person2> list)
	{
		for(person2 p:list)
			System.out.println(p);
	}
	
	
}
