import java.util.Random; // this creates random for our program 
public class App {


    public static int minFinder(int[] arr){
        int index = 0;
        int temp= 1001;

        for (int i=0;i<100;i++){
            for (int j = i+1; j<100;j++){
                if (arr[i]>arr[j] && arr[j]<temp){
                    index = i;
                    temp = arr[j];
                }
            }
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