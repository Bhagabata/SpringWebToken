package TESTINTERFACES;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
	      e.name = "Reyan Ali";
	      e.age = 30;
	      try (
	         FileOutputStream fileOut = new FileOutputStream("d:\\test.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	      ) {
	         out.writeObject(e);
	      }catch (IOException i) {
	         System.out.println(i.getMessage());
	      }
	      try (
	         FileInputStream fileIn = new FileInputStream("d:\\test.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	      ) {
	         e = (Employee)in.readObject();
	         System.out.println(e.name);
	         System.out.println(e.age);
	      } catch (IOException i) {
	         System.out.println(i.getMessage());
	      } catch (ClassNotFoundException e1) {
	         System.out.println(e1.getMessage());
	      }
	}

}

class Employee implements Externalizable {
	   public Employee(){}
	   String name;
	   int age;
	   public void writeExternal(ObjectOutput out) throws IOException {
	      out.writeObject(name);
	      out.writeInt(age);
	   }
	   public void readExternal(ObjectInput in) throws IOException,
	   ClassNotFoundException {
	      name = (String)in.readObject();
	      age = in.readInt();
	   }
	}
