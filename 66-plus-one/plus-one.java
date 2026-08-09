class Solution {
    public int[] plusOne(int[] digits) {
        for (int n = digits.length-1; n >=0; n--){
            if(digits[n] < 9) {
                digits[n]++;
                return digits;
            }
            digits[n]=0;
        }
        int[] result = new int[digits.length+1];
        result[0]=1;
        return result;  
    }
}