class Solution {
    public int solution(String s) {
        String[] StringList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        char x = ' ';
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            x=s.charAt(i);
            if(x>='0'&&x<='9'){
                answer.append(x);
            }else{
                sb.append(s.charAt(i));
                for(int j=0; j<10;j++){
                    if(sb.toString().equals(StringList[j])){
                        answer.append(j);
                        sb.setLength(0);
                        break;
                    }
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}