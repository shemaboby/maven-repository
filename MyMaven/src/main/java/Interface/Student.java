package Interface;

public class Student implements InterfaceOne,InterfaceTwo{
	
	
	public void display()
	{
		System.out.println("Student Marks is: "+mark);
	}
	public void  displayMarks() {
		System.out.println("Student Marks is: "+marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.display();
		s.displayMarks();
	}

}
