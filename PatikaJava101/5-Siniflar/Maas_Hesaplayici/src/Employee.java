
public class Employee {

	// 4 Nitelik
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	// 5 metot
	// Concstructor metot
	Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if (this.salary < 1000) {
			return 0;
		} else {
			return this.salary * 0.03;
		}
	}
	
	int bonus(){
		
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}else {
			return 0;
		}
	}
	
	double raiseSalary(){
		
		if ((2021 - this.hireYear) <= 9){
			return this.salary * 0.05;
		} else if ((2021 - this.hireYear) > 9 && (2021 - this.hireYear) <= 19){
			return this.salary * 0.1;
		}else {
			return this.salary * 0.15;
		}
	}
	
	
	void ToString() {
		System.out.println("**********************************");
		System.out.println("*****     MAAS HESAPLAMA     *****");
		System.out.println("Adi\t:" + this.name);
		System.out.println("Maasi\t:" + this.salary);
		System.out.println("Calisma Saati\t:" + this.workHours);
		System.out.println("Baslangic Yili\t:" + this.hireYear);
		System.out.println("Vergi\t:" + tax());
		System.out.println("Bonus\t:" + bonus());
		System.out.println("Maas Artisi :" + raiseSalary());
		System.out.println("Vergi ve Bonuslar Ile Birlikte Maas :" + (this.salary + bonus() - tax()));
		System.out.println("Toplam Maas :" + ((this.salary + bonus() - tax())+ raiseSalary()));
		System.out.println("**********************************");
	}
}
