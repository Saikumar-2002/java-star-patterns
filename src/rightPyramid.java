public class rightPyramid {
    public static void main(String[] args) {
        int n=6;
        pattern2(n);
    }

    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
