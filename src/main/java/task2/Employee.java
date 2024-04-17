package task2;

public class Employee {
    private Customer.Gender gender;
    private String name;
    public Employee(String name, Customer.Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Customer.Gender getGender() {
        return gender;
    }

    public void setGender(Customer.Gender gender) {
        this.gender = gender;
    }
}
