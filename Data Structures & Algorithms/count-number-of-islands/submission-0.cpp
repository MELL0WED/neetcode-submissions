class Solution {
public:

    void dfs(vector<vector<char>> &grid, int i, int j, int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';

        dfs(grid, i-1,j, n, m);
        dfs(grid, i+1,j, n, m);
        dfs(grid, i,j-1, n, m);
        dfs(grid, i,j+1, n, m);

    }

    int numIslands(vector<vector<char>>& grid) {
        int count1=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,grid.size(),grid[0].size());
                    count1++;
                }
            }
        }
        return count1;
    }
};
