class Solution {
    public boolean isPowerOfFour(int num) {
        if( num<=0)
            return false;
        if(num==1)
            return true;
        while( num!=1){
            int rem=num%4;
            if (rem ==1 || rem==2 || rem==3)
                return false;
            num=num/4;
        }
        
        return true;
    }
}
