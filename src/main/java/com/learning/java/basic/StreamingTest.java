package com.learning.java.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Data;

public class StreamingTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StreamingTest streamingTest = new StreamingTest();
		streamingTest.simpleStream();
		streamingTest.graphStream();
		streamingTest.moreStream();
	}

	public void simpleStream() throws IOException, ClassNotFoundException {
		Cat cat = new Cat();
		cat.setAge("10");
		cat.setColor("white");

		FileOutputStream fs = new FileOutputStream("cat.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(cat);
		os.close();

		FileInputStream fis = new FileInputStream("cat.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cat c = (Cat) ois.readObject();
		ois.close();
		System.out.println(c.getAge());
		System.out.println(c.getColor());
	}

	public void graphStream() throws IOException, ClassNotFoundException {
		Dog dog = new Dog();
		Collor collor = new Collor();
		collor.setColor("red");
		collor.setSize("10");
		dog.setCollor(collor);
		dog.setName("Nesty");

		FileOutputStream fs = new FileOutputStream("dog.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(dog);
		os.close();

		FileInputStream fis = new FileInputStream("dog.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		Dog out = (Dog) is.readObject();
		System.out.println(out.getName());
		System.out.println(out.getCollor().getColor());
		System.out.println(out.getCollor().getSize());
	}

	public void moreStream() throws IOException, ClassNotFoundException {
		DogNew dog = new DogNew();
		Collor collor = new Collor();
		collor.setColor("black");
		collor.setSize("20");
		Cooky cooky = new Cooky(10);
		dog.setCollor(collor);
		dog.setName("NestyNew");
		dog.setCooky(cooky);

		FileOutputStream fs = new FileOutputStream("dognew.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(dog);
		os.close();

		FileInputStream fis = new FileInputStream("dognew.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		DogNew out = (DogNew) is.readObject();
		System.out.println(out.getName());
		System.out.println(out.getCollor().getColor());
		System.out.println(out.getCollor().getSize());
		System.out.println(out.getCooky().getSize());
	}
}

@Data
class Cat implements Serializable {
	private String color;
	private String age;
}

@Data
class DogNew implements Serializable {
	private String name;
	private Collor collor;
	private transient Cooky cooky;

	private void writeObject(ObjectOutputStream os) {
		// throws IOException { // 1
		try {
			os.defaultWriteObject(); // 2
			os.writeInt(cooky.getSize()); // 3
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException { // 4
		try {
			is.defaultReadObject(); // 5
			cooky = new Cooky(is.readInt()); // 6
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

@Data
class Dog implements Serializable {
	private String name;
	private Collor collor;
}

@Data
class Collor implements Serializable {
	private String size;
	private String color;
}

@Data
class Cooky {
	Cooky(int s) {
		size = s;
	}

	private int size;
}
