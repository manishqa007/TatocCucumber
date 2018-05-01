package com.qa.project.cucu.TatocCucumber.stepdefination;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import com.qa.project.cucu.TatocCucumber.driver.DriverFactory;
import com.qa.project.cucu.TatocCucumber.resource.QueryGateUtils;
import com.qa.project.cucu.TatocCucumber.utils.DbConnection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QueryGate extends DriverFactory{

	@Given("^Symbol text on query gate$")
	public void symbol_text_on_query_gate(){
		System.out.println("symbolText "+QueryGateUtils.symbolText);
	}
	
	@When("^connection is established$")
	public void connection_is_established() throws ClassNotFoundException, SQLException{
		DbConnection.db_Connection("com.mysql.jdbc.Driver",QueryGateUtils.url, QueryGateUtils.userName ,QueryGateUtils.password);	
	}
	
	@Then("^Check the number of column in tables And fetch the name and passkey$")
	public void check_the_number_of_column_in_tables_And_fetch_the_name_and_passkey() throws SQLException{
		ResultSet rs = DbConnection.stmt.executeQuery("select * from identity;");
		ResultSetMetaData identityMetaData = (ResultSetMetaData) rs.getMetaData();
		System.out.println("Total columns in Identity table are: "+identityMetaData.getColumnCount());
		System.out.println("Column name are : "+identityMetaData.getColumnLabel(1)+" "+identityMetaData.getColumnLabel(2));
		while (rs.next()){
			if(rs.getString(2).equalsIgnoreCase(QueryGateUtils.symbolText)){
				QueryGateUtils.id = rs.getInt(1);
				//System.out.println("Symbol found and its ID is: "+id);
				break;
			}
		}
		ResultSet rs1 = DbConnection.stmt.executeQuery("select * from credentials;");
		ResultSetMetaData credentialsMetaData = (ResultSetMetaData) rs1.getMetaData();
		System.out.println("Total columns in credentials table are: "+credentialsMetaData.getColumnCount());
		System.out.println("Column name are : "+credentialsMetaData.getColumnLabel(1)+" "+credentialsMetaData.getColumnLabel(2)+" "+credentialsMetaData.getColumnLabel(3));
		while (rs1.next()){
			if(QueryGateUtils.id==rs1.getInt(1)){
				QueryGateUtils.name=rs1.getString(2);
				QueryGateUtils.passkey = rs1.getString(3);
				//System.out.println("Credentials=> name: "+rs1.getInt(1)+" passkey: "+passkey);
				break;
			}
		}
	}
		
	@Then("^fill the fetched credentials$")
	public void fill_the_fetched_credentials() throws InterruptedException{
		Thread.sleep(500);
		System.out.println( "Id: "+QueryGateUtils.id+" Name: "+QueryGateUtils.name+" Passkey: "+QueryGateUtils.passkey);
		//System.out.println("I'm here....1");
		sendKeysByXpath(QueryGateUtils.nameXpath, QueryGateUtils.name);
		sendKeysByXpath(QueryGateUtils.passkeyXpath, QueryGateUtils.passkey);
	}
	
	@Then("^proceed to next page$")
	public void proceed_to_next_page(){
		clickByXpath(QueryGateUtils.proceed);
	}
	
}

