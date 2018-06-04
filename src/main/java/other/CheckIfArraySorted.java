package other;

public class CheckIfArraySorted {
    public static void main(String[] args){
        int[] A={1,2,3,4,5};
        int[] B={2,5,1,8};
        System.out.println((isArraySorted(A,A.length)==0)?System.out.printf("Not Sorted"):System.out.printf("Sortd"));
    }
    static int isArraySorted(int[] A,int n){
        if(n==1)
            return 1;
        return (A[n-1]<A[n-2]?0:isArraySorted(A,n-1));
    }

}
