package assignments.assignment7.question_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0)
            return result;
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval in1, Interval in2) {
                return in1.start - in2.start;
            }
        });

        Interval temp = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if (temp.end >= intervals.get(i).start) {
                Interval node = new Interval(temp.start, Math.max(temp.end, intervals.get(i).end));
                temp = node;
            } else {
                result.add(temp);
                temp = intervals.get(i);
            }
        }
        result.add(temp);

        return result;
    }
}
