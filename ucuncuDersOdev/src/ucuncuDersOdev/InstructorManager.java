package ucuncuDersOdev;

public class InstructorManager extends UserManager {
	
	@Override
	public void signUp(User user) {
		
		System.out.println("Eðitmen kadrosuna " + user.getFirstName() + " " + user.getLastName() + " eklendi.");
	}
	
	public void instructorLogIn(Instructor instructor) {
		
		System.out.println(instructor.getInstructorId() + " id numaralý " + instructor.getFirstName() + " eðitmen giriþ yaptý.");
	}
	
	public void addLecture(String dersEkle) {
		
		System.out.println(dersEkle + "Ders eklendi.");
	}
	
	public void updateLecture() {
		
		System.out.println("Ders güncellendi.");
	}

	public void deleteLecture() {
	
		System.out.println("Ders silindi.");
	}
	
	

}
