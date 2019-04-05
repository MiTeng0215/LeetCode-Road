class Solution {
    public boolean isPalindrome(String s) {
        //最笨的方式,先遍历所有的字符,把字母都放在一个新的字符串中,然后再判断字符串是不是回文
        //创建一个新的字符串
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                builder.append(c);
            }else if(c>='A'&&c<='Z'){
                c += 32;
                builder.append(c);
            }else if(c>='0'&&c<='9'){
                builder.append(c);
            }
        }
        //判断是否是回文
        return isPa(builder);
    }
    public boolean isPa(StringBuilder builder){
        int i,j;
        for(i=0,j = builder.length()-1;i<builder.length()/2;i++,j--){
            if(builder.charAt(i)!=builder.charAt(j)){
                break;   
            }
        }
        if(i==builder.length()/2){
            return true;
        }
        return false;
    }
}
