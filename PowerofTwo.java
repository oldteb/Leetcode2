public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0) return false;
        int mask = 1;
        int ctr = 0;

        for(int i = 0; i < 32; i++){
            if((n & mask) > 0){
                ctr++;
            }
            mask = mask << 1;
        }

        return (ctr == 1 ? true : false);
    }
}

// public class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n < 0) return false;
//
//         while(n != 1){
//             if(n % 2 != 0)
//                 return false;
//             else
//                 n = n / 2;
//         }
//
//         return true;
//
//     }
// }
