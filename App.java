import java.util.Random; // this creates random for our program 
public class App {


    public static int minFinder(int[] arr){
        int index = 0;
        int temp = 1001; //creating temporary variable with a number bigger than the biggest one from the array, for further comparison
        int size = arr.length; //getting the size of the array into a variable

        for (int i = 0; i< size-1; i++) { //creating a loop that will check item by item in the array
            if (arr[i] > arr[i + 1] && arr[i + 1] < temp) { //if a number in the array is higher than the next one
                temp = arr[i + 1]; //replace temporary variable's value by the i+1's one
                index = i + 1; //replace indexes' value by i+1
            } //else, do nothing and go for the next FOR loop
        }

        return index;
    }
    public static void main(String[] args) throws Exception {
        int[] myArr = new int[100];
        Random myRand = new Random(); // creating Random object
        // Range for random to select from
        int min = 5;
        int max = 1000;

        int indexMin=0;

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(max-min+1) + min; // storing random integers in an array
        }
        // here we check the last item of array to see if it is full:
        System.out.println(myArr[ myArr.length-1]); // printing last element, not the biggest or smallest but just the last one
        //now we find the minimum calling the function you wrote:
        indexMin=minFinder(myArr);
        System.out.println("The minimum is at location: "+indexMin+" The value is: "+myArr[indexMin]);
    }
}