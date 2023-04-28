package collections;
import java.util.*;
import java.util.stream.Collectors;
public class ArrayList1 {
	 public static void main(String args[]){  
		   //Creating arraylist
		
		
		List <Movie>list=Arrays.asList(new Movie("hai","vijay",2000),new Movie("hai","vijay",2000));
		/*
		 * list.stream()//source .filter(m->m.getReleaseYear()==2000)//intermediate
		 * .map(Movie::getActor)//Intermediate .forEach(System.out::println);//Terminal
		 */
		    
	List<String>moviename= list.stream().map(m->m.getMovieName()).collect(Collectors.toList());
		 
		moviename.forEach(System.out::println);
			Set<String>movieset= list.stream().map(m->m.getMovieName()).collect(Collectors.toSet());
			 
			 moviename.forEach(System.out::println);
		 }  
		}  
