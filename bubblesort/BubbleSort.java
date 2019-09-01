public class BubbleSort {
    public  static void bubbleSort(int [] a){
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int count=0;
            for (int j =0; j<n-1-i;j++)
            {
                if (a[j]>=a[j+1]){
                    int temp=0;
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }
                

            }
            if(count==0){
            break;}

        }
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int list[]={1,8,9,5,4,6,3,2,7};
        bubbleSort(list);
    }
    
}