package java_lang.leetcode_problems.neetcode.arrays;

import java.lang.reflect.Array;
import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        HashMap<Integer,HashSet<Character>> rows = new HashMap<>();
        HashMap<Integer,HashSet<Character>> columns = new HashMap<>();
        HashMap<HashSet<Integer>,HashSet<Character>> squares = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                HashSet<Integer> squarePosition = new HashSet<>(Arrays.asList(i/3,j/3));
                if (rows.get(i).contains(board[i][j]) ||
                        columns.get(i).contains(board[i][j]) ||
                        squares.get(squarePosition).contains(board[i][j])){
                    return false;
                }
                rows.get(i).add(board[i][j]);
                columns.get(i).add(board[i][j]);
                squares.get(squarePosition).add(board[i][j]);
            }
        }
        return true;
    }

    public static boolean isValidSudoku2(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char n = board[i][j];
                if (n != '.') {
                    if (set.contains(n + "r" + i) || set.contains(n + "c" + j) ||
                            set.contains(n + "b" + i / 3 + j / 3)) {
                        return false;
                    }
                    set.add(n + "r" + i);
                    set.add(n + "c" + j);
                    set.add(n + "b" + i / 3 + j / 3);
                }
            }
        }

        return true;
    }
}
