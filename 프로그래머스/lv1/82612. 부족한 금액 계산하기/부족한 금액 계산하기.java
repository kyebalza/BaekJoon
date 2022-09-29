class Solution {
//     public long solution(int price, int money, int count) {
//     //1. 몇번을 탔는지 탄 수만큼 for문을 돌린다.
//     //2. for문이 돌때 price를 더해준다.
//     //3. 최종 price에서 현재 가지고 있는 money를 빼준다.
//     //long answer = -1;
//     long finalPrice=0;
        
//     for(int i=1; i<=count; i++){ //count 횟수만큼 반복
//         long multiPrice = (long)price * i;//price 가격 더해줌
//         finalPrice += multiPrice;//누적합으로 최종가격 구해줌 
//     }
//     long less_money = finalPrice-money;// 부족한 금액 = (최종가격) - (현재 돈) 
        
//     return less_money;
//     }
    
    
    
        public long solution(int price, int money, int count) {
        long answer = money;

        for(int i=1; i<=count; i++){
            answer -= price * i;
        }

        if (answer < 0){
            answer = answer * -1;
        } else {
            answer = 0;
        }
        return answer;
        }
}