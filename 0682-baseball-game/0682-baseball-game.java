class Solution {
    public int calPoints(String[] operations) {
        int len = operations.length;
        int sum = 0;
        int lengthh = len;
        int[] op = new int[lengthh];
        int j = -1;
        for (int i = 0; i < len; i++) {
            String operation = operations[i];
            char firstChar = operation.charAt(0);
            if (Character.isDigit(firstChar) || (firstChar == '-' && operation.length() > 1)) {
                int val = Integer.parseInt(operation);
                j++;
                op[j] = val;
            } else if (operation.equals("C")) {
                op[j]=0;
                j--;
                lengthh--;
            } else if (operation.equals("D")) {
                int doubleint = 2 * op[j];
                j++;
                op[j] = doubleint;
            } else if (operation.equals("+")) {
                int lastone = op[j] + op[j - 1];
                j++;
                op[j] = lastone;
            } else {

                j++;
                op[j] = 0;
            }
        }
        
        for (int i = 0; i < lengthh; i++) {
            sum += op[i];
        }
        
        return sum;
    }
}
