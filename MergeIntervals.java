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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		ArrayList<Interval> ret = new ArrayList<Interval>();
		for(Interval in : intervals){
			ret = helper(ret,in);
		}
		return ret;
	}
	public ArrayList<Interval> helper(ArrayList<Interval> inter, Interval val){
		ArrayList<Interval> ret = new ArrayList<Interval>();
		if(inter.size()==0) {
			ret.add(val); 
			return ret;
		}
		for(Interval in: inter){
			if(in.end<val.start){
				ret.add(in);
			}else if(in.start>val.end){
				ret.add(val);
				val = in;
			}else if(in.end>=val.start || in.start<=val.end){
				val = new Interval(Math.min(in.start,val.start), Math.max(in.end,val.end));
			}
		}
		ret.add(val);
		return ret;
	}
}

public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	ArrayList<Interval> ret = new ArrayList<Interval>();
	if(intervals==null || intervals.size()==0) return ret;
	for(Interval in: intervals){
		ret = insert(ret,in);
	}
	return ret;
}
public ArrayList<Interval> insert(ArrayList<Interval> ins, Interval newIn){
	ArrayList<Interval> ret = new ArrayList<Interval>();
	for(Interval in: ins){
		if(in.end<newIn.start){
			ret.add(in);
		}else if(in.start>newIn.end){
			ret.add(newIn);
			newIn = in;
		}else if(newIn.start<in.end || newIn.end>in.start){
			newIn = new Interval(Math.min(newIn.start,in.start), Math.max(newIn.end,in.end));
		}
	}
	return ret;
}


















