// Move all zeroes to end of array

#include<iostream>
#include<vector>
using namespace std;


vector<int> moveZero(vector<int> data){

    for (int i = 0; i < data.size(); i++)
    {
        for (int j = 0; j < data.size(); j++)
        {
            if (data[j] == 0)
            {
                int zeroTemp = data[j];
                data[j] = data[j+1];
                data[j+1] = zeroTemp;
            }   
        }
    }
    return data;
}


int main(int argc, char const *argv[])
{
    vector<int> x = {1, 2, 0, 4, 3, 0, 5, 0};

    for(int i : moveZero(x)){
        cout<< i << endl;
    }
    return 0;
}
