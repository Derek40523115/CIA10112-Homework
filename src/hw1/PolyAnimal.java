package hw1;

//import module20_23.EmployeePoly;
//import module20_23.FullTimeEmployeePoly;
//import module20_23.ManagerPoly;
//import module20_23.PartTimeEmployeePoly;
//import xxx.Animal;
//import xxx.Elephant;

public class PolyAnimal {
	
	public static void main(String[] args) {
//		Object[] objs = new Object[2];
//		
//		objs[0] = new Elephant(10, 500.0f, "David");
//		objs[1] = new Animal(2, 5.0f);
		
		Animal[] a = new Animal[2];
		a[0] = new Elephant("Elephant", 8, 1200);
		a[1] = new Animal(3, 8);
		
		
//		EmployeePoly[] e = new EmployeePoly[3]; // 宣告員工陣列,準備置入員工3人
//		
//		e[0] = new FullTimeEmployeePoly(7002, "peter", 40000.0);
//		e[1] = new ManagerPoly(7003, "merry", 50000.0, 10000.0);
//		e[2] = new PartTimeEmployeePoly(7004, "John", 1000.0, 8);
//		
//		for (int i = 0; i < e.length; i++)
//			System.out.println(e[i].getSalary());
	}
}
