package JavaM;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertingMultipleDoc { 
	 public static void main( String args[] ) 
	   {  
	      MongoClient mongo = new MongoClient( "localhost" , 27017 ); // Creating a Mongo client 
	      System.out.println("Connected to db");  
	      
	     MongoDatabase database = mongo.getDatabase("College");  // Accessing the database 

	      MongoCollection<Document> collection = database.getCollection("Student_Details"); //accessing collection
	      System.out.println("Collection selected successfully");


	   // Adding multiple doc
	      List<Document> doc=new ArrayList<>(); 
	      doc.add(new Document("id", 1)
	    	        .append("name", "vishu")
	    	        .append("ph_no", 12345678)
	    	        .append("email", "vishu@mail.com"));

	     doc.add(new Document("id", 2)
	    	        .append("name", "sabaat")
	    	        .append("ph_no", 87654321)
	    	        .append("email", "sabaat@mail.com"));
	      
	     for (Document d : doc) {
	    	 collection.insertOne(d);
	    	}
		  
	      System.out.println("Document inserted successfully");     
	   } 

}
