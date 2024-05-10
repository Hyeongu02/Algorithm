class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[] move;
		int[][] move_map=new int[park.length][park[0].length()];
		int[] start=new int[2];
        
		for(int i=0;i<park.length;i++) { //S,X의 위치를 찾음
			if (park[i].indexOf("S") !=-1) {
				start[0]=i;
				start[1]=park[i].indexOf("S");
			}
	        int index = 0;
	        while ((index = park[i].indexOf('X', index)) != -1) { //X의 위치를 move_map 2차원 배열에 저장
				move_map[i][index]=-1;
				index++;
			}
		}
		
		for(int i=0;i<routes.length;i++) { //행의 길이만큼 반복
			move=routes[i].split(" ");
			int move_len=Integer.valueOf(move[1]);
			int x_result=start[0];
			int y_result=start[1];
			a:while(move_len>0) { // move_len의 길이 만큼 반복
				
				switch (move[0]) {
				case "N":
					if(x_result-Integer.valueOf(move[1])>=0 && move_map[start[0]-1][start[1]] != -1) { 
						--start[0];
					}
					else {//이동한 곳이 move_map==-1일 경우 이전으로 돌아감
						start[0]=x_result;
						break a;
					}
					break;
				case "S":
					if(x_result+Integer.valueOf(move[1])<park.length && move_map[start[0]+1][start[1]] != -1) {
						++start[0];
					}
					else {
						start[0]=x_result;
						break a;
					}
					break;
				case "W":
					if(y_result-Integer.valueOf(move[1])>=0 && move_map[start[0]][start[1]-1] != -1) {
						--start[1];
					}
					else {
						start[1]=y_result;
						break a;
					}
					break;
				case "E":
					if(y_result+Integer.valueOf(move[1])<park[0].length() && move_map[start[0]][start[1]+1] != -1) {
						++start[1];
					}
					else {
						start[1]=y_result;
						break a;
					}
					break;
				}
				move_len--;
			}
		}
        return start;
    }
}
