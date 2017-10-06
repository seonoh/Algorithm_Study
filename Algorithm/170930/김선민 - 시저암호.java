package algorithm;

public class Kakao_0930_03 {
	String caesar(String s, int n) {
		String result = "";
		char[] ch = s.toCharArray();
		System.out.println(s.length());
		n = n%26;
		for(int i=0; i<s.length(); i++){
			if((ch[i] + n) > 122){
				ch[i] = (char) (ch[i]+n-26);
			}else if(ch[i] > 96){
				ch[i] = (char) (ch[i]+n);
			}else if((ch[i] + n) > 90){
				ch[i] = (char) (ch[i]+n-26);				
			}else if(ch[i] > 64){
				ch[i] = (char) (ch[i]+n);				
			}
			System.out.println(ch[i]);
			result += ch[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Kakao_0930_03 c = new Kakao_0930_03();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a Z z", 52));
	}
}
