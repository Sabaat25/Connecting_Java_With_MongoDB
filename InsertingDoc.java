package JavaM; 

import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import org.bson.Document;    

public class InsertingDoc { 
	public static void main(String[] args) {
		      MongoClient mongo = new MongoClient( "localhost" , 27017 ); // Creating a Mongo client 
		      System.out.println("Connected to the database ");  
		      
		      MongoDatabase database = mongo.getDatabase("School");  // Accessing the database 

		      MongoCollection<Document> collection = database.getCollection("Student_Details"); //accessing collection
		      System.out.println("Collection selected successfully"); 
		      
		      Document document = new Document(); 
		      document.append("id", 1);
		      document.append("name", "Sabaat"); 
		      document.append("ph_no", 12345678) ;
		      document.append("mail", "sabaat@mail.com"); 
		   
		      collection.insertOne(document); 
		      
		      //In this document is an object
		      //To add another data create one more object
		      Document document1 = new Document(); 
		      document1.append("id", /2////////////);
		      document1.append("name", "Vishu"); 
		      document1.append("ph_no", 12345678) ;
		      document1.append("mail", "vishu@mail.com"); 
		   
		      collection.insertOne(document1); 
		      System.out.println("Document inserted successfully");     
		   } 
	}


