package com.learning.java.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comaprison {
	public static void main(String[] args) {
	    List<Player> footballTeam = new ArrayList<>();
	    Player player1 = new Player(59, "John", 30);
	    Player player2 = new Player(67, "Roger", 22);
	    Player player3 = new Player(45, "Steven", 24);
	    footballTeam.add(player1);
	    footballTeam.add(player2);
	    footballTeam.add(player3);
	 
	    System.out.println("Before Sorting : " + footballTeam);
	    ComaprePlayer comaprePlayer = new ComaprePlayer();
	    Collections.sort(footballTeam, comaprePlayer);
	    System.out.println("After Sorting : " + footballTeam);
	    Collections.reverse(footballTeam);
	    System.out.println("After Reverse Sorting : " + footballTeam);
	}
	
	
	public static class Player{
		public Player(int ranking, String name, int age) {
			super();
			this.ranking = ranking;
			this.name = name;
			this.age = age;
		}
		private int ranking;
	    private String name;
	    private int age;
		public int getRanking() {
			return ranking;
		}
		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
		}
	    
	}
	
	public static class ComaprePlayer implements Comparator<Player>{

		@Override
		public int compare(Player o1, Player o2) {
			return o1.getAge() - o2.getAge();
		}
		
	}
}
