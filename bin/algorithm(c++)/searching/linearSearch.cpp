#include<iostream>
#include<vector>
using namespace std;


bool linearSearch(vector<int> data, int target){
    bool stats = false;
    for (int i: data)
    {
        if (i == target)
        {
            stats = true;
            break;
        }
    }
    return stats;
}

int main(int argc, char const *argv[])
{
    vector<int> x = {1,3,2,6,5,4,8,7,10};
    int target = 7;

    string result = (linearSearch(x,target))? "Found" : "NotFound";
    cout<< result;
    return 0;
}


