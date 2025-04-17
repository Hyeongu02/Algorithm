import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int[] xCount= new int[10];
        int[] yCount= new int[10];
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<X.length();i++){
            xCount[X.charAt(i)-48]+=1;
        }
        for(int i=0; i<Y.length();i++){
            yCount[Y.charAt(i)-48]+=1;
        }
        for(int i=9;i>=0;i--){
            
            if(xCount[i]!=0&&yCount[i]!=0){
                if(sb.toString().equals("")&&i==0){
                    sb.append("0");
                    break;
                }
                while (xCount[i]!=0&&yCount[i]!=0) {
                    sb.append(i);
                    xCount[i]--;
                    yCount[i]--;
                }
            }
        }
        return (sb.toString().equals(""))?"-1":sb.toString();
    }
}