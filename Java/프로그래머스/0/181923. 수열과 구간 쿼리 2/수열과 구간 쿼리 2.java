import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            // 쿼리 범위와 k 값을 저장할 임시 배열 생성
            int[] tmp = new int[e - s + 2];
            for (int j = s; j <= e; j++) {
                tmp[j - s] = arr[j];
            }
            tmp[e - s + 1] = k; // k 값 저장
            
            Arrays.sort(tmp); // 배열 정렬
            
            // k 값보다 큰 첫 번째 원소를 찾아 결과로 사용
            int result = -1;
            for (int num : tmp) {
                if (num > k) {
                    result = num;
                    break;
                }
            }
            answer[i] = result;
        }
        return answer;
    }
}
