package io.techiebear;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;

public class ListService {

    public int getLargestEl(List<Integer> someList) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < someList.size(); i++) {
            largest = someList.get(i) > largest ? someList.get(i) : largest;
        }
        return largest;

    }

    public List reverse(List list) {

        for (int i = 0; i < list.size() / 2; i++) {
            Object pos2 = list.get(list.size() - 1 - i);
            list.set(list.size() - i - 1, list.get(i));
            list.set(i, pos2);
        }

        return list;
    }

    public boolean hasElement(List list, Object val) {

        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(val)) {
                result = true;
            }
        }
        return result;
    }

    public List returnOddsAsList(List list) {

        List result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 != 0) {
                result.add(list.get(i));
            }
        }

        return result;
    }

    public List<Integer> calculateRunningTotals(List<Integer> list) {

        List<Integer> result = new ArrayList();
        result.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            result.add(result.get(i - 1) + list.get(i));
        }

        return result;
    }
    public boolean isPalindrome(String input) {

        String reversedInput = reverseString(input);

        return reversedInput.compareTo(input) == 0;
    }
    private String reverseString(String input) {

        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public int calculateSumWithFor(List<Integer> list) {

        int sum = 0;
        if (list != null) {
            for (int element : list) {
                sum += element;
            }
        }
        return sum;

    }

    public int calculateSumWithWhile(List<Integer> list) {

        int sum = 0;

        if (list != null) {
            ListIterator<Integer> li = list.listIterator();

            while (li.hasNext()) {
                sum += li.next();
            }
        }

        return sum;

    }
    public int calculateSumWithRecursion(List<Integer> list) {

        if ( list == null || list.isEmpty()) {
            return 0;
        }
        return list.get(0) + calculateSumWithRecursion(list.subList(1, list.size()));
    }
    public void fetch20perfectSquares() {

        Function<Integer,Boolean> test = s -> {
            double side = Math.sqrt(s);

            double fractional = side - Math.floor(side);
            if (fractional == 0){
                return true;
            }

            return false;
        };

        for (int i = 0, count = 0;count<20; i++) {
            if (test.apply(i)){
                System.out.println(i);
                count++;
            }
        }
    }
}
