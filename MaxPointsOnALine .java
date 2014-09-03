/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
 		if(points.length<2) return points.length;
		int max=1;
		for(int i=0;i<points.length;i++){
			HashMap<Double,Integer> map = new HashMap<Double,Integer>();
			int dup = 1;
			for(int j=0;j<points.length;j++){
				if(j==i) continue;
				if(points[i].x==points[j].x && points[i].y==points[j].y){
					dup++;
				}else{
				    Double slope = 0.0;
				    if(points[i].x==points[j].x) slope = Double.MAX_VALUE;
				    else{
					    slope = 1.0 * (points[j].y-points[i].y)/(points[i].x-points[j].x);
				    }
				    if(!map.containsKey(slope)){
					    map.put(slope,1);
				    }else{
					    map.put(slope,map.get(slope)+1);
				    }
				}
			}
			if(map.size()==0) max = Math.max(max,dup);
			else{
			    for(Map.Entry entry: map.entrySet()){
				    int t = (Integer) entry.getValue();
				    max = Math.max(max,t+dup);
			    }
			}
			
		}
		return max;       
    }
}

