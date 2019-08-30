class Solution {
    public String removeOuterParentheses(String S) {
         char[] charArr = S.toCharArray();
		StringBuilder sb = new StringBuilder();
		int p_l = 0;
		int p_r = 0;
		for (int i = 0; i < charArr.length; i++) {
			if ('(' == charArr[i]) {
				p_l++;
			}
			if (')' == charArr[i]) {
				p_r++;
			}
			//找到原语
			if (p_l == p_r) {
				sb.append(S.substring(i - p_l * 2 + 2, i));
				p_l = 0;
				p_r = 0;
			}
		}
		return sb.toString();


        
    }
}
