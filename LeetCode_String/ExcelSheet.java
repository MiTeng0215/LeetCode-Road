class Solution {
    public String convertToTitle(int n) {
        String newStr = "";
        while(n!=0){
            int first = n%26;
            if(first == 0){
                first+=26;
                n -= 26;
            }
            newStr = (char)(first+64) + newStr;
            n = n/26;
        }
        return newStr;
    }
}
