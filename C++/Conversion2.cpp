/*
2)write a number class with
int num;
void disp(){}
u should be able to do following
number n1(20);
int k=-n1;
n1+=5;
n1.disp()
number n2(35);
if(n1!=n2)
{
	some message
}
number n3(12);
if(n3 < n1)
{
	some message
}
number n4;
n4=n2*n3;
*/
#include <iostream>
using namespace std;
class Number{
    private:
        int num;
    public:
        Number(){
            num =0;
        }
        Number(int num){
            this->num = num;
        }
        int getNum(){
            return num;
        }
        void display(){
            cout<<num<<endl;
        }
        int operator-(){
            return -this->num;
        }
        Number& operator+=(int k){
            this->num+=k;
            return *this;
        }
        bool operator!=(Number &ref){
            return this->num!=ref.num;
        }
        bool operator<(Number &ref){
            return this->num < ref.num;
        }
        Number operator*(Number &ref){
            return Number(this->num*ref.num);
            // return *this;
        }
};
int main(){
    Number n1(10);
    int k = -n1;   // internally n1.operator-();
    cout<<k<<endl;
    n1.display();
    n1 += 5;       // internally n1.operator+=(5);
    n1.display();
    Number n2(35);

    if(n1 != n2){    // internally n1.operator!=(n2);
        cout<<"Both objects are not same"<<endl;
    }
    else{
        cout<<"Both objects are same"<<endl;
    }
    Number n3(23);
    if(n1<n3){      // internally n1.operator<(n3);
        cout<<"n1 is less than n3"<<endl;
    }
    else{
        cout<<"n1 is greater than n3"<<endl;
    }
    Number n4;
    n4 = n2*n3;    // internally n2.operator*(n3);
    n4.display();
}