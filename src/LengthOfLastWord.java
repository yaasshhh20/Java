class LengthOfLastWord {
    public int StringClass(String s) {
        String str = s.trim();
        int count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}