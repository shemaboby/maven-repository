package AggregationConcepts;

public class Address {
    String houseNum, city,state, country;
    int zipcode;
    
    public Address(String houseNum,String city,String state,String country,int zipcode)
    {
    	this.houseNum=houseNum;
    	this.city=city;
    	this.state=state;
    	this.country=country;
    	this.zipcode=zipcode;
    }
}
