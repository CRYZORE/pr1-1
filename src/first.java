public class first {
    public static void main(String[] arg) {
        int arr[] = new int[3];
        arr[0]=10;
        arr[1]=2;
        arr[2]=3;
        int Sum = 0;
        for (int i=0; i<arr.length; i++){
            Sum = Sum + arr[i];
        }
        System.out.println(Sum);
        int w=0;
        Sum =0;
        while (w<arr.length){
            Sum=Sum+arr[w];
            w++;
        }
        System.out.println(Sum);
        Sum=0;
        w=0;
        do{
            Sum=Sum+arr[w];
            w++;
        }while(w<arr.length);
        System.out.println(Sum);
    }
}
