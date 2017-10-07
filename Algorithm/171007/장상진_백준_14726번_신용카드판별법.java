import java.util.Scanner;

public class Main {
    static String luhn(String num){
        int temp = 0;
        int[] nArray = new int[num.length()];

        for(int i=0; i<num.length(); i++){
            nArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));

            if(i%2==0){
                nArray[i] *= 2;
                if(nArray[i] >= 10){
                    temp += Integer.parseInt((nArray[i]+"").substring(0, 1)) + Integer.parseInt((nArray[i]+"").substring(1, 2));
                } else {
                    temp += nArray[i];
                }
            } else {
                temp+=nArray[i];
            }
        }

        if(temp%10 == 0) return "T";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            System.out.println(luhn(sc.next()));
        }
    }
}
