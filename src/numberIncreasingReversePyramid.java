public class numberIncreasingReversePyramid {
    public static void main(String[] args) {
        int n=6;
        revPyramid(n);
    }

    public static void revPyramid(int n)
    {
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(j+" ");
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }}
