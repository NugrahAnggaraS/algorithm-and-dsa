#include<iostream>
#include<vector>
using namespace std;

bool binarySearch(vector<int> data,int target){
    bool stats = false;
    int left = 0;
    int right = data.size() - 1;

    while (left <= right)
    {
        int mid = (left+right)/2;

        if (data[mid] == target)
        {
            stats = true;
            break;
        }else if (data[mid] < target)
        {
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
    return stats;
}

int main(int argc, char const *argv[])
{
    vector<int> x = {1,2,3,4,5,6,7,8,9,10};
    int target = 8;
    string res = (binarySearch(x,target))? "Found" : "Not Found";
    cout<< res;

    return 0;
}
