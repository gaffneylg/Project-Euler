// You are given the following information, but you may prefer to do some research for yourself.
//
// 1 Jan 1900 was a Monday.
// Thirty days has September,
// April, June and November.
// All the rest have thirty-one,
// Saving February alone,
// Which has twenty-eight, rain or shine.
// And on leap years, twenty-nine.
// A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
// How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem19 {
  public static void main(String args[]) {

    int sunday = 7;
    int begin = 1900;
    int start = 1901;
    int end = 1999;
    int finish = 2000;
    int satisfy = 0;
    int day = 1;
    Problem19 pro = new Problem19();
    String[] thirty = {"September","April","June","November"};
    String[] thirtyOne = {"January","March","May","July","August","October","December"};
    Pair<Integer, String[]> thirtyPair = new Pair<Integer, String[]>(30, thirty);
    Pair<Integer, String[]> thirtyOnePair = new Pair<Integer, String[]>(31, thirtyOne);
    ArrayList<Pair<String, Integer>> months = pro.months();
    for(int i=0; i<months.size();i++){
      Pair<String, Integer> month = months.get(i);
      int days = month.getValue();
      for(int j=1; j<days; j++) {
        if (j==sunday) {
          satisfy++;
        }
        day = pro.day(day);
      }
    }




  }

  private ArrayList<Pair<String, Integer>> months() {
    ArrayList<Pair<String, Integer>> months = new ArrayList<>();
    Pair<String, Integer> jan = new Pair<>("Jan", 31);
    Pair<String, Integer> feb = new Pair<>("Feb", 28);
    Pair<String, Integer> mar = new Pair<>("Mar", 31);
    Pair<String, Integer> apr = new Pair<>("Apr", 30);
    Pair<String, Integer> may = new Pair<>("May", 31);
    Pair<String, Integer> jun = new Pair<>("Jun", 30);
    Pair<String, Integer> jul = new Pair<>("Jul", 31);
    Pair<String, Integer> aug = new Pair<>("Aug", 31);
    Pair<String, Integer> sep = new Pair<>("Sep", 30);
    Pair<String, Integer> oct = new Pair<>("Oct", 31);
    Pair<String, Integer> nov = new Pair<>("Nov", 30);
    Pair<String, Integer> dec = new Pair<>("Dec", 31);

    months.add(jan);
    months.add(feb);
    months.add(mar);
    months.add(apr);
    months.add(may);
    months.add(jun);
    months.add(jul);
    months.add(aug);
    months.add(sep);
    months.add(oct);
    months.add(nov);
    months.add(dec);

    return months;
  }

  private int day(int current) {
    if (current < 7) {
      return current ++;
    } else {
      return 1;
    }
  }
}
