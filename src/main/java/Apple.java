

import food.Fruit;

public class Apple extends Fruit{

	@Override
	public String getName() {
		return this.getName();
		
	}

	@Override
	public String getPrice() {
		return "10 very high";
		
	}
	
	public static void main(String[] args){
		Apple apple = new Apple();
		apple.setName("mango");
		apple.setPrice("1 cheap");
		
		System.out.println(apple.getName());
		System.out.println(apple.getPrice());
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPrice(String price) {
		// TODO Auto-generated method stub
		
	}

}
