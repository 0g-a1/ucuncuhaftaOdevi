package ucuncuDersOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instructor instructor = new Instructor
				(
						1,1, "Engin", "Demiroð", "engindemirog@gmail.com" , "12346" 
				);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(instructor);             //override
		instructorManager.instructorLogIn(instructor);
		instructorManager.addLecture("Java + REACT");
		
		System.out.println("\n" + " ----------------------- " + "\n");
		
		Student student1 = new Student
				(
						2,1,"Kunfu","Panda","ejdersavascisi58@kapui.com","asd123"
				);
		
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(student1);
		studentManager.selectLecture("Java + REACT");
		
		
	}

}
