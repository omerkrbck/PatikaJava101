
public class Student {

	Course c1;
	Course c2;
	Course c3;
	
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	// Constructor metot paremetreli
	public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0.0;
		this.isPass = false;
	}
	
	void addBulkExamNote(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3) {
		System.out.println("******************************************");
		if (note1 >= 0 && note1 <= 100) {
			this.c1.note = note1;
		}
		if (verbalNote1 >= 0 && verbalNote1 <= 100) {
			this.c1.verbalNote = verbalNote1;
		}
		if (note2 >= 0 && note2 <= 100) {
			this.c2.note = note2;
		}
		if (verbalNote2 >= 0 && verbalNote2 <= 100) {
			this.c2.verbalNote = verbalNote2;
		}
		if (note3 >= 0 && note3 <= 100) {
			this.c3.note = note3;
		}
		if (verbalNote3 >= 0 && verbalNote3 <= 100) {
			this.c3.verbalNote = verbalNote3;
		}
	}
	
	void isPass() {
		this.avarage = (this.c1.note * 0.80 + this.c1.verbalNote * 0.20 + this.c2.note * 0.80 + this.c2.verbalNote * 0.20 + this.c3.note * 0.80 + this.c3.verbalNote * 0.20) / 3.0;
		if (this.avarage >= 55) {
			System.out.println("Hababam Sinifi Uyaniyor. Sinifi Gectiniz ... ");
			this.isPass = true;
		}else {
			System.out.println("Hababam Sinifi Sinifta Kaldi ... ");
			this.isPass = false;
		}
		printNote();
	}
	
	void printNote() {
		System.out.println(this.c1.name + " Notu\t:" + this.c1.note + "  Sozlu Notu\t:" + this.c1.verbalNote);
		System.out.println(this.c2.name + " Notu\t:" + this.c2.note + "  Sozlu Notu\t:" + this.c2.verbalNote);
		System.out.println(this.c3.name + " Notu\t:" + this.c3.note + "  Sozlu Notu\t:" + this.c3.verbalNote);
		System.out.println("Ortalamaniz : " + this.avarage);
	}
}
