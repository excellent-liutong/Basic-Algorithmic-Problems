/*
 * @lc app=leetcode.cn id=8 lang=c
 *
 * [8] 字符串转换整数 (atoi)
 */


int myAtoi(char * str){
        
        int compare = INT_MAX/10;
        if (result < compare) {
            return false;
        } else if (result > compare) {
            return true;
        } else {
            int remainder = INT_MAX % 10;
            if (digit <= remainder) {
                return false;
            } else {
                return true;
            }
        }
    

}



