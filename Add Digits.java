class Solution {
    int addDigits(int num) {
        if(num < 0 || num > Integer.MAX_VALUE)  return 0;
		int temp = 0;
		String s = new Integer(num).toString();

		while(s.length() > 1){
			temp = 0;
			for(int i = 0; i < s.length(); i++){
				temp += (s.charAt(i) - 48);
			}

			s = new Integer(temp).toString();
		}


		return (int)Integer.parseInt(s);

    }
};