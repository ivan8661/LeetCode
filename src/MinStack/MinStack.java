package MinStack;

import java.util.*;

class Main {
    public static void main(String[] args) {

    }
}
public class MinStack {


        private int count = 0;
        private int[] arr;

        private int MINIMUM_ELEMENT = Integer.MAX_VALUE;

        public int getSize() {
            return arr.length;
        }
        public MinStack() {
            arr = new int[0];
        }

        public void push(int val) {
            addElement(val);
        }

        public void pop() {
            if(count <= 0)
                throw new ArrayIndexOutOfBoundsException(count + " < 0");
            removeElement(count-1);
        }

        public int top() {
            if(count <= 0)
                throw new ArrayIndexOutOfBoundsException(count + " < 0");
            return arr[arr.length-1];
        }

        public int getMin() {
            if(count <= 0)
                throw new ArrayIndexOutOfBoundsException(count + " < 0");
            findMin();
            return MINIMUM_ELEMENT;
        }

        protected void findMin() {
            for(int i = 0; i < arr.length; ++i){
                if(arr[i] < MINIMUM_ELEMENT)
                    MINIMUM_ELEMENT = arr[i];
            }
        }


        //additional methods
        private void addElement(int val) {
            if(count == arr.length)
                arr = expandSize();
            arr[count] = val;
            if(val < MINIMUM_ELEMENT)
                MINIMUM_ELEMENT = val;
            count++;
        }

        private void removeElement(int index) {
            if(index >= count)
                throw new ArrayIndexOutOfBoundsException(index + " >= size of stack:" + count);
            if(index < 0){
                throw new ArrayIndexOutOfBoundsException(index + "is smaller than 0");
            }
            if(arr.length-1 == 0 || MINIMUM_ELEMENT == arr[arr.length-1])
                MINIMUM_ELEMENT = Integer.MAX_VALUE;

            arr = Arrays.copyOf(arr, arr.length-1);
            count--;
        }

        private int [] expandSize() {
            return Arrays.copyOf(arr, arr.length+1);
        }
}
