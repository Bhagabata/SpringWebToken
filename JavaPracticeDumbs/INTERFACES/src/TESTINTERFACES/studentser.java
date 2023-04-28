package TESTINTERFACES;

import java.io.*;

public class studentser implements Serializable{
	private String name;
	   private transient int age;
	   public studentser(String name, int age){
	      this.name = name;
	      this.age = age;
	   }
	   public String getName() {
	      return this.name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public void setAge(int age) {
	      this.age = age;
	   }
	   public int getAge() {
	      return this.age;
	   }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		studentser std1 = new studentser("Krishna", 30);
	      FileOutputStream fos = new FileOutputStream("d:\\student2.ser");
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(std1);
	      FileInputStream fis = new FileInputStream("d:\\student2.ser");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      studentser std2 = (studentser) ois.readObject();
	      System.out.println(std2.getName());
	}

}
