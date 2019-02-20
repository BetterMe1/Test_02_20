package xust;

/*
812. 最大三角形面积
给定包含多个点的集合，从其中取三个点组成三角形，返回能组成的最大三角形的面积。
示例:
输入: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
输出: 2
解释: 
这五个点如下图所示。组成的橙色三角形是最大的，面积为2。
 */
/*
 *分析：
 *知道三点的坐标，求三角形面积的公式：  0.5*(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)
 *遍历所有点，计算符合条件的三角形的最大面积。
 */
public class Test_0220 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
		System.out.println(So.largestTriangleArea(points));
	}
}
class Solution {
    public double largestTriangleArea(int[][] points) {
    	double area = 0.0;
        for(int i=0; i<points.length; i++){
        	for(int j=0; j!=i && j<points.length; j++){
        		for(int k=0; k!=i && k!=j &&k<points.length; k++){
        			area = Math.max(area, 0.5*Math.abs((points[j][0]-points[i][0])*(points[k][1]-points[i][1])-
                			(points[k][0]-points[i][0])*(points[j][1]-points[i][1])));
        		}
        	}
        }
        return area;
    }
}