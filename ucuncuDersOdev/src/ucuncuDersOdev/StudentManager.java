package ucuncuDersOdev;

public class StudentManager extends UserManager {

	public void studentLogIn(Student student) {
		
		System.out.println(student.getStudentId() + " id numaralý öðrenci giriþ yaptý.");
	}
	
	public void selectLecture(String dersSec) {
		
		System.out.println(dersSec + " dersi seçildi.");
	}
	
	public void leftLecture() {
		
		System.out.println("Ders býrakýldý.");
	}
	
	
}
