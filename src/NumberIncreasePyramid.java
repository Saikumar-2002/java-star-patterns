public class NumberIncreasePyramid {
    public static void main(String[] args) {
        int n=6;
        pattern2(n);
    }

    public static void pattern2(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

