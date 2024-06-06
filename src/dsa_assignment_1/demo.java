package dsa_assignment_1;


    class demo {
        static String average(int A[], int N) {
            if (N == 0) {
                return "Invalid input: Array size is 0";
            }
    
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum = sum + A[i];
            }
            float avg = (float) sum / N; // Casting sum to float for floating-point division
            String av = String.format("%.2f", avg);
            String res = sum + " " + av;
            return res;
        }   
        public static void main(String[] args) {
           int A[]={1,2,3,4,5};
           int N=A.length;
           System.out.println(average(A,N));
        }
    }

