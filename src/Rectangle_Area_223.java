/**
 * Created by hp on 2016/11/6.
 */
public class Rectangle_Area_223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int total=(D-B)*(C-A)+(G-E)*(H-F);
        int llx=Math.max(E,A);
        int lly=Math.max(F,B);
        int rhx=Math.min(C,G);
        int rhy=Math.min(D,H);
        if (rhx<llx||rhy<lly) return total;
        return total-(rhy-lly)*(rhx-llx);
    }
}
