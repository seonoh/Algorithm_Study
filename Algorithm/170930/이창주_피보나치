class Fibonacci {
	public long fibonacci(int num) {
		
		long[] mem = new long[num+1];
    
    mem[0]=0;
    mem[1]=1;
    for(int i=2; i<=num; i++){
    	mem[i]=mem[i-1]+mem[i-2];
    }
		return mem[num];
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
