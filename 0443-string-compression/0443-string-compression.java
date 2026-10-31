class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int write = 0;
        int n = chars.length;   // Array Hai!
        while(i < n){
            int count  = 0;
            char curr = chars[i];
            while(i < n && chars[i] == curr){
                count++;
                i++;
            }
            chars[write] = curr;
            write++;
            if(count > 1){
                String s = String.valueOf(count);
                for(int j = 0; j < s.length(); j++){
                    chars[write] = s.charAt(j);
                    write++;
                }
            }
        }
        return write;
    }
}