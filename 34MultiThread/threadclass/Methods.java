package threadclass;

public class Methods extends Thread {
    int startnum, endnum;
    String symbol;

    public void printLoop(int startnum, int endnum, String symbol) {
        for (int i = startnum; i < endnum; i++) {
            System.out.print(i + symbol + "");
        }
        System.out.println();
    }
    
}
