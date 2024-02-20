#include <bits/stdc++.h>
using namespace std;
void dfsTraversal(int node, vector<int> &vis, vector<int> &ans, vector<int> adj[])
{
    vis[node] = 1;
    ans.push_back(node);
    for (auto it : adj[node])
    {
        if (!vis[it])
        {
            dfsTraversal(it, vis, ans, adj);
        }
    }
}
int main()
{
    int n, m;
    cin >> n >> m;
    vector<int> adj[n + 1];
    for (int i = 0; i < m; i++)
    {
        int u, v;
        cin >> u >> v;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    vector<int> vis(n + 1, 0);
    vector<int>ans;
    dfsTraversal(1,vis,ans,adj);
    for (auto it : ans)
    {
        cout << it << " ";
    }

    // vis[1] = 1;
    // queue<int> q;
    // q.push(1);
    // vector<int> bfs;
    // while (!q.empty())
    // {
    //     int node = q.front();
    //     q.pop();
    //     bfs.push_back(node);
    //     for (auto it : adj[node])
    //     {
    //         if (!vis[it])
    //         {
    //             vis[it] = 1;
    //             q.push(it);
    //         }
    //     }
    // }
}