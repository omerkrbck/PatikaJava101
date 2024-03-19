
public class Main {
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "5555");
		Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
		Teacher t3 = new Teacher("Kulyutmaz", "BIO", "1111");

		
		Course tarih = new Course("Tarih", "101","TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "FZK");
		fizik.addTeacher(t2);
		
		Course biyo = new Course("Biyoloji", "101", "BIO");
		biyo.addTeacher(t3);
		
		
		Student s1 = new Student("Saban", "123", "4", tarih, fizik, biyo);
		s1.addBulkExamNote(100, 80, 20, 90, 80, 60);
		s1.isPass();
		
		Student s2 = new Student("Necmi", "444", "4", tarih, fizik, biyo);
		s2.addBulkExamNote(60, 75, 80, 95, 20, 45);
		s2.isPass();
	}
}
