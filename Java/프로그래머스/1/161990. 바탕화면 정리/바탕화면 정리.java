class Solution {
    public int[] solution(String[] wallpaper) {
        int x_x=wallpaper.length+1, x_y=wallpaper[0].length()+1;
		int y_x=-1, y_y=-1;
		for(int i=0;i<wallpaper.length;i++) {
			for(int j=0;j<wallpaper[i].length();j++) {
				if(wallpaper[i].charAt(j)=='#'&&x_x>i) {
					x_x=i;
				}
				if(wallpaper[i].charAt(j)=='#'&&x_y>j) {
					x_y=j;
				}
				if(wallpaper[i].charAt(j)=='#'&&y_x<i) {
					y_x=i;
				}
				if(wallpaper[i].charAt(j)=='#'&&y_y<j) {
					y_y=j;
				}
			}
		}
		int[] answer = {x_x,x_y,y_x+1,y_y+1};
        return answer;
    }
}