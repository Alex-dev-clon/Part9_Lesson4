package task1;

import java.util.ArrayList;
import java.util.List;

//В класс покупателя добавить перечисление с гендерами,
//добавить в сотрудника свойство «пол» со значением
//созданного перечисления. Добавить геттеры, сеттеры.
public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(Customer.Gender.MALE));
        list.add(new Employee(Customer.Gender.MALE));
        list.add(new Employee(Customer.Gender.FEMALE));
        list.add(new Employee(Customer.Gender.FEMALE));

        for (Employee employee : list){
            System.out.println(employee.getGender());
        }

        list.get(0).setGender(Customer.Gender.FEMALE);
        System.out.println(list.get(0).getGender());
    }
}
