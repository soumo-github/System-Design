import Student.Student;

public class Main {

	public static void main(String[] args) {

		Student obj = new Student(23, 27, "Soumalya Dhar");
		Student cloneobj = (Student) obj.clone();
		System.out.println(cloneobj.getName() +" with age of " + cloneobj.getAge() +" has roll " +  cloneobj.getRollNo());

	}

}
