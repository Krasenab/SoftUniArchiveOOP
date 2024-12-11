package restaurant;

import java.math.BigDecimal;

public class Food extends Product
{
	private double grams;
	public Food(String name, BigDecimal price,double grams) {
		super(name, price);
		this.setGrams(grams);
		
	}
	
	public void setGrams(double grams) 
	{
		if(grams>=0.1) 
		{
			this.grams = grams;
		}
	}
	public double getGrams() 
	{
		return this.grams;
	}
	
}
