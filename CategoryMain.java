package newone;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class CategoryMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		Set<Category> c=new HashSet<Category>();
		Category ctg=new Category
            (110011,1111,01,10,"HouseHold","Furniture","Singapore","These are related to houses","Made by wood");
		c.add(ctg);
		ctg=new Category
			(110012,1112,02,20,"Footwear","sandal","Hyderabad","Footwear","made by bata");
		c.add(ctg);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("d:\\file.json"), c);
		System.out.println("JSON created successfully");
	}

}
