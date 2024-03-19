
public class Course {

	Teacher teacher;     // Teacher sınıfında teacher nesnesı uretıldı. Bos olarak. Genelde en uste yazılır.
	String name;
	String code;
	String prefix;
	double note;
	double verbalNote;
	
	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;    // varsayılan olrak sıfır gırıldı. 
		this.verbalNote = 0; // varsayılan olrak sıfır gırıldı. 
	}
	
	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
		} else {
			System.out.println("Ogretmen ve Ders Bolumleri Uyusmuyor...");
		}
	}
	
	void printTeacher() {
		 this.teacher.print();
	}
}
