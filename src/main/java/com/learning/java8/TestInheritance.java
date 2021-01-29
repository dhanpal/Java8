package com.learning.java8;

public class TestInheritance {

	public static void main(String[] args) {
		Player player = new Player();
		player.doShape();
		
		Coach coach = new Coach();
		coach.doShape();
		
		TestInheritance testInheritance = new TestInheritance();
		testInheritance.showMe(player);
		testInheritance.showMe(coach);
	}
	
	public void showMe(GameShape gameShape){
		gameShape.doShape();
	}

}

class GameShape{
	public void doShape(){
		System.out.println("I am game shape");
	}
}

class Player extends GameShape{
	public void doShapePlayer(){
		System.out.println("I am game player");
	}
}

class Coach extends GameShape{
	public void doShapeCoach(){
		System.out.println("I am game coach");
	}
}