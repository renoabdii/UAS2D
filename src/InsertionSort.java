public class InsertionSort {
    private int [] data;

    public void setData(int[] data) {
        this.data = data;
    }
    public void InsertionSort(){
        int size = this.data.length;
        for (int step = 1; step < size; step++){
            int key = this.data[step];
            int j = step - 1;

            //compare key with each element on the left of it until an element smaller than
            //it is found
            //for descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key <this.data[j]){
                this.data[j+1]=this.data[j];
                --j;
            }
            //place key at after the element just smaller than it
            this.data [j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] age = { 12 , 7 , 2 , 1 , 0 , 67 , 78 , 95 };
        InsertionSort sort = new InsertionSort();
        sort.setData(age);
        sort.InsertionSort();
        //print
        for (int i = 0; i < age.length;i++){
            System.out.print(age[i]+"");
        }
        //1. 7,12,2,1....
        //2. 7,2,12,1....
             //2,7,12,1....
    }
}
