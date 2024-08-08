class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dxdy = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<int[]> res = new ArrayList<>();
        int len = 0, d = 0;
        res.add(new int[]{rStart, cStart});
        while(res.size()<rows * cols){
            if(d==0||d==2)
                len++;
            for(int i=0;i<len;i++){
                rStart+=dxdy[d][0];
                cStart+=dxdy[d][1];
                if(rStart<rows && cStart<cols && rStart>=0 && cStart>=0){
                    res.add(new int[]{rStart, cStart});
                }
            }
            d=(d+1)%4;
        }
        return res.toArray(new int[rows * cols][2]);
    }
}