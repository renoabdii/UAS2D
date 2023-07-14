public class genap {

    private int[] s = new int[]{1, 5, 6, 7, 12, 3, 4, 24, 9, 18};

        public void genap (int index){
            if (s[index] % 2 == 0 ){
                System.out.println(s[index]);
            }
            index++;
            genap(index);
        }
    }

