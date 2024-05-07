package Shop;

public class OffSeason {
	
	public void discount(float price)
	{
		
		float discount= price*0.15f;
		price=price-discount;
		System.out.println("Total price of clothes purchased during offseason is:"+price);
		System.out.println("Discount of clothes purchased during offseason is:"+discount);
	}

}
