package algorithm.Progremers;

/*
 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
 * 
 * A를 3만큼 밀면 D가 되고 z를 1만큼 밀면 a가 됩니다. 공백은 수정하지 않습니다.
 * 
 * 보낼 문자열 s와 얼마나 밀지 알려주는 n을 입력받아 암호문을 만드는 ceasar 함수를 완성해 보세요.
 * 
 * “a B z”,4를 입력받았다면 “e F d”를 리턴합니다.
 */
public class Progremers_Lv3_Caesar {

	// My Answer Success
	String caesar(String s, int n) {
		StringBuilder builder = new StringBuilder();
		int  a = 'a'
//			a = 97
				, z = 'z'
//			, z = 122
				, A = 'A'
//			, A = 65
				, Z = 'Z'
//			, Z = 90
				, p = 26;

		for (char c : s.toCharArray())
			if (c != ' ') {
				int	i = c
						, j = n % p	// 이동 값, cycle 을 돈 후 얼만큼 이동하는지에 대한 값
						, k = i + j	// 알파벳 ASCII i => c 로 대체
						, l = i <= Z ?	// Z 보다 작을 경우
						k <= Z ?	// j 만큼 이동한 후 Z 보다 작을 경우
								k	// true : (대문자라고 인식)
								:
								A + k - Z -1	// false : j 만큼 이동헀을 때 Z를 넘을 경우, A 부터 시작해서 이동
						:
						i <= z ?	// z 보다 작을 경우 (소문자일 경우)
								k <= z ?	// j 만큼 이동했을 때 z 보다 작을 경우
										k	// true : (소문자라고 인식)
										:
										a + k - z -1 : 0	// false : j 만큼 이동헀을 때 z를 넘을 경우, a 부터 시작해서 이동
						;
				builder.append((char) l);
			} else
				builder.append(" ");
		return builder.toString();
	}

	public static void main(String[] args) {
		Progremers_Lv3_Caesar_submit c = new Progremers_Lv3_Caesar_submit();
		System.out .println(c.caesar("c qNspuVBdK B ofgMAadCXJWbcGivOZXN gHO epj CGDtY O",35));
	}
}
