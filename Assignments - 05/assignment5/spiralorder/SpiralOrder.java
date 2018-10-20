package For_Java.assignments.assignment5.spiralorder;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix == null)
            return result;
        if (matrix.length == 0 || matrix[0].length == 0)
            return result;
        int i = 0;
        int j = -1;
        int upmax = 0;
        int bottommax = matrix.length - 1;
        int leftmax = 0;
        int rightmax = matrix[0].length - 1;
        int maxnum = matrix[0].length * matrix.length;
        while (result.size() < maxnum) {

            //left to right;
            while (j < rightmax) {
                result.add(matrix[i][++j]);
            }
            upmax++;
            if (result.size() >= maxnum)
                break;
            //up to down;
            while (i < bottommax) {
                result.add(matrix[++i][j]);
            }
            rightmax--;
            if (result.size() >= maxnum)
                break;
            //right to left;
            while (j > leftmax) {
                result.add(matrix[i][--j]);
            }
            bottommax--;
            if (result.size() >= maxnum)
                break;

            //down to up;
            while (i > upmax) {
                result.add(matrix[--i][j]);
            }
            leftmax++;
            if (result.size() >= maxnum)
                break;
        }

        return result;
    }
}
