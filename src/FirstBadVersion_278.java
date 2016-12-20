/**
 * Created by hp on 2016/12/20.
 */
public class FirstBadVersion_278 {
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            long start=1;
            long end=n;
            int version;
            while (true){
                version= (int) ((end+start+1)/2);
                if (isBadVersion(version)){
                    if (version==1 || !isBadVersion(version-1)) return version;
                    end=version-1;
                }else {
                    start=version+1;
                }
            }
        }

        private boolean isBadVersion(int version) {
            return true;
        }
    }
}
