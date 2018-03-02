
public class MethodMain extends MyList {
    public static void main(String[] args) {
        Person Daniel = new Person("Daniel");
        MyList employees = new MyList();
        employees.add(Daniel);



        //initial length is 10
        System.out.println(employees.checkLength());

        //It can increase itself
        for (int i = 0; i <21 ; i++) {
            employees.add(Daniel);
            employees.addItemSpecifically(21,Daniel);
        }

        System.out.println(employees.checkLength());

        employees.addItemSpecifically(14,Daniel);




    }

}
