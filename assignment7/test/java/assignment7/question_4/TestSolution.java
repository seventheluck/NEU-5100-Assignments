package assignment7.question_4;

import assignments.assignment7.question_4.Interval;
import assignments.assignment7.question_4.Solution;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class TestSolution {



/* Please import this dependency.

        <dependency>
            <groupId>org.hamcrest</groupId>
            <artifactId>hamcrest-library</artifactId>
            <version>1.3</version>
            <scope>test</scope>
        </dependency>*/

    @Test
    void mergeTest1() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        list.add(new Interval(1, 2));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(1, 2)));
    }

    @Test
    void mergeTest2() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 2));
        list.add(new Interval(2, 2));
        list.add(new Interval(2, 3));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(1, 3)));
    }

    @Test
    void mergeTest3() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 2));
        list.add(new Interval(4, 5));
        list.add(new Interval(9, 10));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(1, 2), new Interval(4, 5), new Interval(9, 10)));
    }

    @Test
    void mergeTest4() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 200));
        list.add(new Interval(4, 5));
        list.add(new Interval(9, 10));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(1, 200)));
    }

    @Test
    void mergeTest5() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1, 200));
        list.add(new Interval(4, 5));
        list.add(new Interval(300, 301));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(1, 200), new Interval(300, 301)));
    }

    @Test
    void mergeTest6() {
        Solution solution = new Solution();
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(999, 999999));
        list.add(new Interval(100000000, 100000005));
        List<Interval> output = solution.merge(list);
        assertThat(output, containsInAnyOrder(new Interval(999, 999999), new Interval(100000000, 100000005)));
    }
}
