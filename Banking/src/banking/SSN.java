package banking;

public class SSN {
    transient private String num;

    public SSN() {
        num = "0000000000";
    }

    public SSN(String input) {
        num = input;
    }

    public SSN(int input) {
        num = Integer.toString(input);
    }

    public void updateNum(int input) {
        num = Integer.toString(input);
    }

    public void updateNum(String input) {
        num = input;
    }

    public String getNum() {
        return num;
    }
    public String toString() {
        StringBuffer output = new StringBuffer();
        for(int i = 0; i < num.length(); i++) {
            if(i == 3 || i == 6) {
                output.append("-");
            }
            output.append(num.charAt(i));
        }

        return output.toString();
    }
    
}