package spring_25_problem_1b;

public class UniversitySystem {
	public static void main(String[] args) {
		   Department cse = new Department(15);
	        Department swe = new Department(35);
	        Department nfe = new Department(10);

	        Professor FAF = new Professor(1);
	        Professor MIZ = new Professor(2);
	        Professor NJO = new Professor(3);

	        Course Algo = new Course(122, 1.5);
	        Course IBC = new Course(101, 3.0);
	        Course OOP = new Course(211, 3.0);

	        // Department - Professor relation
	        cse.addProfessor(FAF);
	        cse.addProfessor(MIZ);

	        swe.addProfessor(FAF);
	        swe.addProfessor(NJO);

	        nfe.addProfessor(NJO);

	        // Professor - Department relation (keep them consistent)
	        FAF.addDept(cse);
	        FAF.addDept(swe);

	        MIZ.addDept(cse);

	        NJO.addDept(swe);
	        NJO.addDept(nfe);

	        // Professor - Course relation
	        FAF.addCourse(Algo);
	        FAF.addCourse(OOP);

	        MIZ.addCourse(OOP);

	        NJO.addCourse(IBC);

	        // Course - Professor relation
	        Algo.addProfessor(FAF);
	        OOP.addProfessor(FAF);
	        OOP.addProfessor(MIZ);
	        IBC.addProfessor(NJO);

	        // Display info

	        System.out.println("CSE Department Professors:");
	        cse.display();

	        System.out.println("\nSWE Department Professors:");
	        swe.display();

	        System.out.println("\nNFE Department Professors:");
	        nfe.display();

	        System.out.println("\nDetails for Professor FAF:");
	        FAF.displayD();
	        FAF.displayC();

	        System.out.println("\nDetails for Professor MIZ:");
	        MIZ.displayD();
	        MIZ.displayC();

	        System.out.println("\nDetails for Professor NJO:");
	        NJO.displayD();
	        NJO.displayC();

		
	}
}