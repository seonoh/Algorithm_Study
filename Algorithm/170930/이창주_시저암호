class Caesar {
	String caesar(String s, int n) {
		String result = "";
		
		// 함수를 완성하세요.
		char[] arr=s.toCharArray();
		for(int i=0; i< arr.length; i++) {
			if(arr[i] != ' ') {
				if(Character.isUpperCase(arr[i])) {
					result += ((char)(((arr[i]+n-65)%26)+65));
				}else {
					result += ((char)(((arr[i]+n-97)%26)+97));
				}
				
			}else {
				result += (" ");
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		c.caesar("a B z", 4);
	}
}
