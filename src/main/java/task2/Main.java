package task2;

import java.util.*;

//Добавить в основную программу перечисление с праздниками (нет праздника, Новый Год, 8 марта, 23 февраля),
//написать метод, принимающий массив сотрудников, поздравляющий всех сотрудников с Новым Годом,
//женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день.
public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Fred", Customer.Gender.MALE));
        list.add(new Employee("Alex", Customer.Gender.MALE));
        list.add(new Employee("Liza", Customer.Gender.FEMALE));
        list.add(new Employee("Marta", Customer.Gender.FEMALE));

        Calendar calendar1 = new GregorianCalendar(2024, Calendar.DECEMBER, 31);
        Calendar calendar2 = new GregorianCalendar(2024, Calendar.MARCH, 8);
        Calendar calendar3 = new GregorianCalendar(2024, Calendar.FEBRUARY, 23);
        Calendar calendar4 = new GregorianCalendar(2024, Calendar.DECEMBER, 1);

        writeNotifications(list, calendar1);
        writeNotifications(list, calendar2);
        writeNotifications(list, calendar3);
        writeNotifications(list, calendar4);
    }

    static void writeNotifications(ArrayList<Employee> list, Calendar calendar) {
        ArrayList<Employee> listTemp = new ArrayList<>(List.copyOf(list));
        Holidays holiday = Holidays.EMPTY;
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        if (month == 11 && day == 31) holiday = Holidays.NEW_YEAR;
        else if (month == 2 && day == 8) holiday = Holidays.MART_8;
        else if (month == 1 && day == 23) holiday = Holidays.FEBRUARY_23;

        switch (holiday) {
            case NEW_YEAR -> congratulate(listTemp, "Happy New Year ");
            case FEBRUARY_23 -> {
                listTemp.removeIf(employee -> employee.getGender().equals(Customer.Gender.FEMALE));
                congratulate(listTemp, "Happy 23 February ");
            }
            case MART_8 -> {
                listTemp.removeIf(employee -> employee.getGender().equals(Customer.Gender.MALE));
                congratulate(listTemp, "Happy 8 March ");
            }
            case EMPTY -> System.out.println("Today is an ordinary day");
        }

    }

    static void congratulate(ArrayList<Employee> list, String holiday) {
        for (Employee employee : list){
            System.out.println(holiday + employee.getName());
        }
    }

}
