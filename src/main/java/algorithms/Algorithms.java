package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {

    public static boolean binarySearch(List<Integer> sortedArray, int num) {

        var low = 0;
        var high = sortedArray.size() - 1;

        while (low <= high) {
            var middle = (low + high) / 2;
            var guess = sortedArray.get(middle);

            if (num < guess) {
                high = middle - 1;
            } else if (num > guess) {
                low = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static List<Integer> quickSortArray(List<Integer> array) {

        if (array.size() < 2) {
            return array;
        }

        final var middle = array.size() / 2;
        final var pivot = array.get(middle);
        final var less = new ArrayList<Integer>();
        final var more = new ArrayList<Integer>();

        for (int i = 0; i <= (array.size() - 1); i++) {
            if (i != middle) {
                if (array.get(i) <= pivot) {
                    less.add(array.get(i));
                }
            }
        }

        for (int i = 0; i <= (array.size() - 1); i++) {
            if (i != middle) {
                if (array.get(i) > pivot) {
                    more.add(array.get(i));
                }
            }
        }

        final var list = new ArrayList<Integer>();
        list.addAll(quickSortArray(less));
        list.add(pivot);
        list.addAll(quickSortArray(more));
        return list;
    }

    public static List<Integer> ordionarySort(List<Integer> array) {

        final var sortArray = new ArrayList<Integer>();

        while (!array.isEmpty()) {
            var smallestElementIndex = 0;

            for (int i = 1; i <= array.size() - 1; i++) {
                if (array.get(i) < array.get(smallestElementIndex)) {
                    smallestElementIndex = i;
                }
            }
            sortArray.add(array.get(smallestElementIndex));
            array.remove(smallestElementIndex);
        }

        return sortArray;
    }

    public static String parseIntToString(int number) {
        var residue = 0;
        final var charsOfNumbers = new ArrayList<Character>();
        var stringNumber = "";

        if (number <= 9) {
            return String.valueOf(parseIntToChar(number));
        }

        do {
            residue = number % 10;
            number = number / 10;

            charsOfNumbers.add(parseIntToChar(residue));

            if (number <= 9) {
                charsOfNumbers.add(parseIntToChar(number));
            }

        } while (number > 9);

        for (var index = (charsOfNumbers.size() - 1); index >= 0; index--) {
            stringNumber+=charsOfNumbers.get(index);
        }

        return stringNumber;
    }

    private static char parseIntToChar(final int number) {
        if (number == 0) {
            return '0';
        } else if (number == 1) {
            return '1';
        } else if (number == 2) {
            return '2';
        } else if (number == 3) {
            return '3';
        } else if (number == 4) {
            return '4';
        } else if (number == 5) {
            return '5';
        } else if (number == 6) {
            return '6';
        } else if (number == 7) {
            return '7';
        } else if (number == 8) {
            return '8';
        } else if (number == 9) {
            return '9';
        }
        return '0';
    }

}
