package java_lang.leetcode_problems.unsorted.medium;

import java.util.ArrayList;
import java.util.List;

class MyCalendar {
    List<int[]> booking = new ArrayList<int[]>();

    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        if(booking.isEmpty()){
            booking.add(new int[]{start,end});
        }
        for(int[] i : booking){
            if(start < i[0] && end > i[1]) return false;
            else if(i[0]< start && start < i[1] && end > i[1] ) return false;
            else {
                booking.add(new int[]{start,end});
                return true;
            }
        }
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
    }
}
