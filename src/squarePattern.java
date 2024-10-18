public  class squarePattern {
    public static void main(String[] args) {
        int n=4;
        pattren1(n);
    }

    public static void pattren1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}