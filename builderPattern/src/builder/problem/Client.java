package builder.problem;

public class Client {

	public static void main(String[] args){
		
		String from="client table";
		String where="client name = ...";
		
		
		// using sql query
		
		// Define the builder for sql


		// build the query by using the director
		SqlQuery sqlQuery = new SqlQuery();
        sqlQuery.setFrom(from); // step one
        sqlQuery.setWhere(where); // step two
        sqlQuery.execute(); // step three 
		
		// using mongodb query
        MongoDbQuery mongoDbQuery = new MongoDbQuery();
        mongoDbQuery.setFrom(from);//step one again
        mongoDbQuery.setWhere(where); // step two again
        mongoDbQuery.execute();// step three
        
        /*
        the problem is the same steps takes palce every time we build  a query
        
        */


    }
	
}
