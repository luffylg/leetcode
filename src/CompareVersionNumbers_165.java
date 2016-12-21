/**
 * Created by hp on 2016/12/21.
 */
public class CompareVersionNumbers_165 {
    public int compareVersion(String version1, String version2) {
        int[] v1=version2int(version1);
        int[] v2=version2int(version2);
        int cmp1,cmp2;
        for (int i = 0; i <Math.max(v1.length,v2.length) ; i++) {
            if (i>v1.length-1) cmp1=0;
            else cmp1=v1[i];
            if (i>v2.length-1) cmp2=0;
            else cmp2=v2[i];
            if (cmp1>cmp2) return 1;
            if (cmp1<cmp2) return -1;
        }
        return 0;
    }

    private int[] version2int(String version) {
        String[] split = version.split("\\.");
        int[] ints = new int[split.length];
        for (int i = 0; i <split.length ; i++) {
            ints[i]=Integer.parseInt(split[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(new CompareVersionNumbers_165().compareVersion("0.1","0.0.1"));
    }
}
