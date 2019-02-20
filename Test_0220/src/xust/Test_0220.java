package xust;

/*
812. ������������
�������������ļ��ϣ�������ȡ��������������Σ���������ɵ���������ε������
ʾ��:
����: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
���: 2
����: 
�����������ͼ��ʾ����ɵĳ�ɫ�����������ģ����Ϊ2��
 */
/*
 *������
 *֪����������꣬������������Ĺ�ʽ��  0.5*(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0)
 *�������е㣬������������������ε���������
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