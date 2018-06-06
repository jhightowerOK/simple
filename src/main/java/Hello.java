import beans.*;

public class Hello{
	public static void main(String[] args){

	   Student student = new Student();
	   student.setFirstName("Jim");
	   student.setLastName("Smith");

  	   System.out.printf("%s, %s\n",student.getLastName(),student.getFirstName());
	}
}
