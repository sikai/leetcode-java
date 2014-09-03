/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		ArrayList<Interval> ret = new ArrayList<Interval>();
		for(Interval in: intervals){
			if(in.end<newInterval.start){
				ret.add(in);
			}else if(in.start>newInterval.end){
				ret.add(newInterval);
				newInterval = in;
			}else if(in.end>=newInterval.start || in.start<=newInterval.end){
				newInterval = new Interval(Math.min(in.start,newInterval.start), Math.max(in.end,newInterval.end));
			}
		}
		ret.add(newInterval);	
		return ret;	
	}
}
