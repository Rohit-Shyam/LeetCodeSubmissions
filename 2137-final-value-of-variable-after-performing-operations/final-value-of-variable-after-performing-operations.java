class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int temp = 0;
        for(int i=0;i<operations.length; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                temp = temp +1;
            }
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                temp = temp - 1;
            }
        }

        return temp;
    }
}