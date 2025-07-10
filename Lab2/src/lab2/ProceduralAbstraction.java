package lab2;

/**
 *
 * @Anith Rajakumar
 */
public class ProceduralAbstraction {
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.
    public static int reverseFactorial(int x) {
        
        int totalProduct = 0, n = 0;
        
        while(totalProduct < x){
            if(n == 0){
                totalProduct = 1;
            }else {
                totalProduct *= n;
            }
            n++;
        }
        return n-1;
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.
    public static boolean isMatrixNice(int[][] arr) {
        // Variable to hold the temp sum of row/column
        int tempSum = 0, compareSum = 0;
        
        // Ensuring that the matrix is a square matrix
        if(arr.length == arr[0].length){
            // Adding the first diaginal to compare with the rest
            for(int i = 0; i < arr.length; i++){
                compareSum += arr[i][i];
            }
            
            // Checking the other diaginal
            for(int i = 0; i < arr.length; i++){
                tempSum += arr[i][arr.length - 1 - i];
            }
            
            if(compareSum != tempSum){
                return false;
            } else{
                tempSum = 0;
            }

            // Running through the rows
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    tempSum += arr[i][j];
                } 
                if(compareSum != tempSum){
                    return false;
                } else{
                    tempSum = 0;
                }
            }
            
            // Running through the columns
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    tempSum += arr[j][i];
                } 
                if(compareSum != tempSum){
                    return false;
                } else{
                    tempSum = 0;
                }
            }
            
            return true;
            
        } else {
            return false;
        }
    }
}
