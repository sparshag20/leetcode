class Solution
{
    public:
        vector<int> partitionLabels(string s)
        {
            unordered_map<char, int> umap;
            vector<int> vec(s.size(), 1);
            for (int i = 0; i < s.size(); i++)
            {
                if (umap.find(s[i]) != umap.end())
                {
                    int end = umap[s[i]];
                    for (int j = i; j > end; j--)
                    {
                        vec[j] = 0;
                    }
                    umap[s[i]] = i;
                }
                else
                {
                    umap[s[i]] = i;
                }
            }
            int cnt = 0;
            vector<int> ans;
            for (auto it: vec)
            {
                if (it == 1)
                {
                    if (cnt != 0) ans.push_back(cnt);
                    cnt = 1;
                }
                else
                {
                    cnt++;
                }
            }
            if (cnt) ans.push_back(cnt);
            return ans;
        }
};