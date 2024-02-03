public class Main {

    private static int[] array = {1,4,5,5,7,20,2,8,3};

    public static void main(String[] args) {
        selectionSort(array);
//        for(i : array){
//            System.out.print(i);
//        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-2; i++) {
            int min = i;
            for(int j = i+1; j < array.length-1; i++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

}
