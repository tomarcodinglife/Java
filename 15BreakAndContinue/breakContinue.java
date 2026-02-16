
public class breakContinue{
    public static void main(String[] args){
        
        breakMethod(10, 5);
        System.out.println("----------------------------------");
        continueMethod(5, 3);

    }

    public static void breakMethod(int myNum, int breakNum){
        
        for(int num =1; num <= myNum; num++){
            if(num  == breakNum){
                break; 
            }
            System.out.println(num);
        }
    }

    public static void continueMethod(int myNum, int continueNum){
        
        for(int num = 1; num <= myNum; num++){
            if (num == continueNum) {
                continue;
            }
            System.out.println(num);
        }
    }


}