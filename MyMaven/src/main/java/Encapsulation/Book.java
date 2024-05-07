package Encapsulation;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDetails bd= new BookDetails();
		bd.setBookName("Hello World");
		bd.setAuthor("John Philip");
		bd.setPageCount(250);
		System.out.println(bd.getBookName());
		System.out.println(bd.getAuthor());
		System.out.println(bd.getPageCount());
		
	}

}
