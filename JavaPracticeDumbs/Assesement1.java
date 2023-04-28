package day8;
class Book{
	int ISBNnumber;
	String Author;
	String Publisher;
	String Bookname;

Book(int ISBNnumber,String Bookname,String Author,String Publisher){
	this.Bookname=Bookname;
	this.ISBNnumber=ISBNnumber;
	this.Author=Author;
	this.Publisher=Publisher;
}

public int getISBNnumber() {
	return ISBNnumber;
}

public void setISBNnumber(int iSBNnumber) {
	ISBNnumber = iSBNnumber;
}

public String getAuthor() {
	return Author;
}

public void setAuthor(String author) {
	Author = author;
}

public String getPublisher() {
	return Publisher;
}

public void setPublisher(String publisher) {
	Publisher = publisher;
}

public String getBookname() {
	return Bookname;
}

public void setBookname(String bookname) {
	Bookname = bookname;
}
public void getBookInfo() {
	System.out.println(Author+ISBNnumber+Publisher+Bookname);
}

}

public class Assesement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book BookTest[]=new Book[30];
		BookTest[10]=new Book(1234, "ABC", "BGH", "NHJU");
		BookTest[11]=new Book(1234, "abc", "bvg", "bnhg");
        for( int i=0; i<30; i++){
            BookTest[10].getBookInfo();
            BookTest[11].getBookInfo();
            
		
	}

}}
