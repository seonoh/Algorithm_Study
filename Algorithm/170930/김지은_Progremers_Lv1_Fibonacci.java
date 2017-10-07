import java.util.Collection;
public class test5 {
		public static long fibonacci(int n) {
		  long temp, cur = 1, before = 0;
		  if(n <= 1) {
		     return n;
		  }
		  else {
		     for(int i=1; i<n; i++) {
		       temp = cur;
		      cur = before + cur;
		      before = temp;
		     }
		  return cur;
		  }
		}

		  // 아래는 테스트
		   public static void main(String[] args) {
		      int testCase = 3;
		      System.out.println(fibonacci(testCase));
		   }
}
