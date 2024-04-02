import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] m = getTemperarure();
        System.out.println(calculateDays(m));

    }

    public static int[] getTemperarure(){
        System.out.println("ведите количество дней, а затем температуру: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] temperatures =  new  int[n];
        for (int i = 0; i <n ; i++) {
            temperatures[i] = scan.nextInt();
        }
         return temperatures;
        }

        public static int calculateDays(int[] massiv){
        int counter = 0;
        int days = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 0)
                counter++;
            else{
                if (counter> days){
                    days = counter;}
                counter = 0;}
        }

        return days;
    }
}