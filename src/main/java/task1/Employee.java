package task1;

public class Employee {
    Customer.Gender gender;

    public Employee(Customer.Gender gender) {
        this.gender = gender;
    }

    public Customer.Gender getGender() {
        return gender;
    }

    public void setGender(Customer.Gender gender) {
        this.gender = gender;
    }
}
