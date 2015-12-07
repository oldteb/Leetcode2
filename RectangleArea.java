public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int width = 0;
        int height = 0;
        if(G <= A){
            width = 0;
        }
        else if(G > A && G <= C){
            width = Math.min(G-A, G-E);
        }
        else{
            if(E >= C){
                width = 0;
            }
            else{
                width = Math.min(C-E, C-A);
            }
        }

        if(H <= B){
            height = 0;
        }
        else if(H > B && H <= D){
            height = Math.min(H-B, H-F);
        }
        else{
            if(F >= D){
                height = 0;
            }
            else{
                height = Math.min(D-F, D-B);
            }
        }

        return (C-A)*(D-B) + (G-E)*(H-F) - width * height;

    }
}
