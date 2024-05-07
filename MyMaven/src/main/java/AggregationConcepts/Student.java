package AggregationConcepts;

public class Student {
     String name;
     int rollnum;
     Address a;
     public Student(String name, int rollnum, Address a)
     {
    	 this.name=name;
    	 this.rollnum=rollnum;
    	 this.a=a;
     }
     
     public void display()
     {
    	 System.out.println("Student name is: "+name);
    	 System.out.println("Student rollnum is: "+rollnum);
    	 System.out.println("Address line 1 is: "+a.houseNum);
    	 System.out.println("Address line 2 is: "+a.city+ "   "+a.state);
    	 System.out.println("Address line 3 is: "+a.country +"  "+a.zipcode);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a= new Address("F-12 Bell Haven","Trivandrum","Kerala","India",695015);
		Student s= new Student("Shema",54,a);
		s.display();
	}

}
