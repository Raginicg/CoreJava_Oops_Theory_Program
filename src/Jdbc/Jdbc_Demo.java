package Jdbc;
/*
 * JDBC- Java database connectivity----> java.sql
 * 
 * JDBC is an API in java that allows application to interact with database.
 * JDBC provides some classes and interfaces through we can work with database
 * 
 * Classes- DriverManger, Date, Time
 * 
 * Interfaces- Statement, Connection, Prepared Statement, result Set, Driver 
 */
public class Jdbc_Demo {
/*
 * Steps to connect with Database-
 * 
 * 1. Register the Driver class Dynamically--> mysqlConnector.jar (you can choose based on your requirements)
 * 	Class.forName ("com.mysql.cj.jdbc.Driver")  // you mysql path name
 * 
 * 2. Establish the Connection	
 * 	Connection con=DriverManager.getConnection("jdbc.mysql://localhost:3306/dbname", "mysqlusername", "password" ) // url/DatabaseName
 *
 * 3. Create the Statement
 * 	Statement st=con.createStatement();
 *
 * 4. Execute query
 * st.execute ("create table student (id int, name varchar(20))");
 *  
 *
 */
	
	//////////9999
}
