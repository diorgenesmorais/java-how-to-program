package com.dms.jcp10ed.poli;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "113.108.12345-6", 800.0);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "113.112-12345-7", 16.75, 40.0);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "113.112.12345-7", 10000.0,
				0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Diorgenes", "Morais",
				"113-112-12345-7", 5000.0, 0.04, 300.0);

		System.out.println("Employees processed individually:");
		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
				basePlusCommissionEmployee.earnings());

		// cria um array Employee de quatro elementos
		Employee[] employees = new Employee[4];

		// inicializa o array com Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");
		// processa genericamente cada elemento no employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invoca toString

			// determina se elemento é um BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast da referência de Employee para
				// referência a BasePlusCommissionEmployee
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			} // fim do if
			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		} // for final

		// obtém o nome do tipo de cada objeto no array employees
		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getSimpleName());
		}
	}
}
