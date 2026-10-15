class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        ArrayList<Integer> ans  = new ArrayList<>();

        int firstrow = 0, lastrow = m-1;
        int firstcol = 0, lastcol = n-1;

        while(firstrow <= lastrow && firstcol <= lastcol){

            // left to right
            for(int i = firstrow; i <= lastcol; i++){
               ans.add(arr[firstrow][i]);
            }
            firstrow++;

            // top to bottom
            for(int i = firstrow; i <= lastrow; i++){
               ans.add(arr[i][lastcol]);
            }
            lastcol--;

            // right to left
            if(firstrow <= lastrow){
                for(int i = lastcol; i >= firstcol; i--){
                    ans.add(arr[lastrow][i]);
                }
                lastrow--;
            }

            // bottom to top
            if(firstcol <= lastcol){
                for(int i = lastrow; i >= firstrow; i--){
                   ans.add(arr[i][firstcol]);
                }
                firstcol++;
            }
            
        }
        return ans;        
    }
}