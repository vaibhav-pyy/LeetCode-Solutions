class Solution {
    public long removeZeros(long n) {
        long num = 0l;
        
        while(n != 0){
            if(n % 10 != 0){
                num = (num *10) + n%10;
                n/=10;
            }
            else{
                n/=10;
            }
        }
        long num2 = 0;
        while(num != 0){
                num2 = (num2 *10) + num%10;
                num/=10;
            }
            
        return num2;
        }

    }