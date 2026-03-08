package Bank;

public class customer {
    
    public static void main(String[] args) {

        BankAccount SBI_CUS_A0001 = new BankAccount("5685858265", "Amit Kumar", 0);
        BankAccount SBI_CUS_A0002 = new BankAccount("5685858266", "Rohit Kumar", 200);
        BankAccount SBI_CUS_A0003 = new BankAccount("5685858267", "Sumit Kumar", 500);
        BankAccount SBI_CUS_A0004 = new BankAccount("5685858268", "Aman Kumar", 0);

        System.out.println(SBI_CUS_A0001);

        SBI_CUS_A0001.depositMoney(5000);
        SBI_CUS_A0001.withdrawMoney(100);
        System.out.println(SBI_CUS_A0001);

        System.out.println(SBI_CUS_A0002);
        SBI_CUS_A0002.depositMoney(6500);


        System.out.println(SBI_CUS_A0003);
        SBI_CUS_A0003.depositMoney(8210);

        System.out.println(SBI_CUS_A0004);
        SBI_CUS_A0004.depositMoney(321);


        System.out.println(SBI_CUS_A0001);
        System.out.println(SBI_CUS_A0002);
        System.out.println(SBI_CUS_A0003);
        System.out.println(SBI_CUS_A0004);

        SBI_CUS_A0001.withdrawMoney(50000); // You withdraw 4900.00
        System.out.println(SBI_CUS_A0001);


        SBI_CUS_A0001.depositMoney(-532);  // Invalid Deposit
        System.out.println(SBI_CUS_A0001);

    }

}
