class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int idx = -1;
        int[] num = new int[tokens.length];
        for(int i=0 ; i < tokens.length ; i++) {
            String tmp = tokens[i];
            switch(tmp) {
                case "+":
                    num[idx-1] = num[idx-1] + num[idx];
                    idx--;
                    break;
                case "-":
                    num[idx-1] = num[idx-1] - num[idx];
                    idx--;
                    break;
                case "*":
                    num[idx-1] = num[idx-1] * num[idx];
                    idx--;
                    break;
                case "/":
                    num[idx-1] = num[idx-1] / num[idx];
                    idx--;
                    break;
                default:
                    num[++idx] = Integer.parseInt(tmp);
                    break;
            }
        }
        return num[0];
    }
}