public class Averagenumber {
    static int a=10,b=20,c=30,d=40,e=50;
    static int total;
    static int avg;

    public static void printsum(){
        total=a+b+c+d+e;
        System.out.println("Total ="+total);
    }
    public static void printaverage(){
        avg=total/5;
        System.out.println("Average ="+avg);
    }
    public static void main (String[] args){
        printsum();
        printaverage();

    }
}
