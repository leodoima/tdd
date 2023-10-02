package main.cap7;

public class Developer extends Employee implements IFuncionario {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateTax() {
        return (super.getSalary() > 3000) ? super.getSalary() * 0.25 : super.getSalary() * 0.15;
    }
}
