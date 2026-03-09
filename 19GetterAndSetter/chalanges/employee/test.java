package employee;

public class test {
    
    public static void main(String[] args) {
        
        employee EMP001 = new employee("Aman Kumar", 34,    30000);

        System.out.println(EMP001.displayEmployee());

        EMP001.setEmployeeName("Rahul");
        System.out.println(EMP001);
    
    }

    

    

}
