package newone;

public class Category {
     
	      int  id,brand_id,type_id,dept_id_list;
	      String name,brand_name,location;
	      String description,brand_description;
	      public Category(int id,int brand_id,int type_id,int dept_id_list,String name,String brand_name,String location,String description,String brand_description)
		
	      {
	    	  this.id=id;
	    	  this.brand_id=brand_id;
	    	  this.type_id=type_id;
	    	  this.dept_id_list=dept_id_list;
	    	  this.name=name;
	    	  this.brand_name=brand_name;
	    	  this.location=location;
	    	  this.description=description;
	    	  this.brand_description=brand_description;
	      }
	      public int getId()
	      {
	    	  return id;
	      }
	      public int getBrand_id()
	      {
	    	  return brand_id;
	      }
	      public int getType_id()
	      {
	    	  return type_id;
	      }
	      public int getDept_id_list()
	      {
	    	  return dept_id_list;
	      }
	      public String getName()
	      {
	    	  return name;
	      }
	      public String getBrandName()
	      {
	    	  return brand_name;
	      }
	      public String getLocation()
	      {
	    	  return location;
	      }
	      public String getDescription()
	      {
	    	  return description;
	      }
	      public String getBrandDescription()
	      {
	    	  return brand_description;
	      }
	
	
	}



