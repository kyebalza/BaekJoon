class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //0. answer의 크기를 구해줍니다.
        //1. for문으로 각 행을 구해줍니다.
        //2. 2중 for문으로 각 열의 값을 구해줍니다.
        //4. 구한 각각의 값을 더해줍니다.
        //3. answer 변수에 더해준 각각의 값을 넣어줍니다. 
        
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
         
        
        return answer;
    }
}