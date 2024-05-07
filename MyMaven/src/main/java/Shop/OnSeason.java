package Shop;
import java.util.Scanner;

public class OnSeason extends OffSeason {
	
	public void discount(float price)
	{
		
		float discount= price*0.4f;
		price= price-discount;
		System.out.println("Total price of clothes purchased during offseason is:"+price);
		System.out.println("Discount of clothes purchased during offseason is:"+discount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OffSeason off= new OnSeason();
		OnSeason on= new OnSeason();
     Scanner sc= new Scanner(System.in);
     int option=0;
     while(true)
     {
     System.out.println("Choose an option: ");
     System.out.println("1. Off Season");
     System.out.println("2. On Season");
     System.out.println("3. Exit");
     
    option=sc.nextInt();
     switch(option)
     {
     case 1: off.discount(5000);
     		break;
     		
     case 2: on.discount(7000);
     		break;
     
     case 3: System.exit(0);
     
     default: System.out.println("Wrong option chosen");
     }
     }
	}

}
