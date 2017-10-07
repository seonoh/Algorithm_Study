import java.util.Scanner;

public class Main {
    static String gcd(String num){
        String[] array = num.split(" ");
        int result = 0;
        int temp = 0;

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(Integer.parseInt(array[i]) > Integer.parseInt(array[j])){
                    temp = euclidean(Integer.parseInt(array[i]), Integer.parseInt(array[j]));
                } else {
                    temp = euclidean(Integer.parseInt(array[j]), Integer.parseInt(array[i]));
                }
                result = temp > result? temp : result;
            }
        }

        return result+"";
    }

    static int euclidean(int num1, int num2){
        int temp = 1;

        while(temp > 0){
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }

        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for(int i=0; i<num; i++) {
            System.out.println(gcd(sc.nextLine()));
        }
    }
}
