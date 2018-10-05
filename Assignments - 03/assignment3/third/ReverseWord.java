package For_Java.assignments.assignment3.third;

public class ReverseWord {

    public static void main(String[] args) {

        String s = "  The      sky is          blue  ";
        String s1 = "           ";
        String s2 = "The";
        String result = reverseWord(s);
        System.out.println(result);
    }

    public static String reverseWord(String s) {
        if (s == null || s.length() == 0)
            return s;
        char[] list = s.toCharArray();
        int flag = 0;
        int preindex = 0;
        int endindex = 0;
        String result = "";
        int resultnum = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != ' ') {
                if (flag == 0) {
                    preindex = i;
                    flag = 1;
                }
            } else if (flag == 1) {
                endindex = i - 1;
                flag = -1;
            }

            if (flag == 1 && i == list.length - 1) {
                endindex = i;
                flag = -1;
            }

            if (flag == -1) {
                if (resultnum != 0)
                    result = String.valueOf(list, preindex, endindex - preindex + 1) + " " + result;
                else
                    result = String.valueOf(list, preindex, endindex - preindex + 1) + result;
                resultnum++;
                flag = 0;
            }
        }

        return result;
    }
}
