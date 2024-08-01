// Find the largest three distinct elements in an array

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


int main(int argc, char const *argv[])
{
    vector<int> input = {10, 4, 3, 50, 23, 90};
    sort(input.begin(),input.end());

    cout<< input[input.size()-1] << " "<< input[input.size()-2]<< " " <<input[input.size()-3];
}
