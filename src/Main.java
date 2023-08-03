public class Main {
    class Solution{
        public static int doUnion(int a[], int n, int b[], int m)
        {
            int result = (n + m);
            int count = 0;
              for(int i = 0; i < n ; i++){
                for(int j = 0; j < m ; j++){
                    if(a[i] == b[j]){
                        count++;
                    }
                }
            }
            return result - count;
        }
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}