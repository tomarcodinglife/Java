public class Unary {
    public static void main (String[] args) {
        int x = 10;
        System.out.println(" x : " +  x);
        int y = -x;
        System.out.println(" x : " +  x);
        System.out.println(" y : " + y);
        int z = -y;
        System.out.println(" z : " + z);


        int a = ++x;
        System.out.println(" a : " + a);
        int b = --a;
        System.out.println(" b : " + b);

        int c = x++;
        System.out.println(" c : " + c);
        int d = c--;
        System.out.println(" d : " + d);

    }
}