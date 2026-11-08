/*
1) class Number
   {
       int num;
   }
In the main function,
Number n1(8),n2(4),n3(20),n4(6),n5;
n5=n1-n2
n5=n3/n4;
n5=n1*n3
*/
#include <iostream>
using namespace std;
class Number{
    private:
        int num;
    public:
        Number(){}
        Number(int num){
            this->num=num;
        }
        int getNum(){
            return num;
        }
        Number operator-(Number &ref){
            return Number(this->num - ref.num);
        }
        Number operator/(Number &ref){
            return Number(this->num / ref.num);
        }
        Number operator*(Number &ref){
            return Number(this->num * ref.num);
        }
        friend ostream& operator<<(ostream&,Number&);
};
ostream & operator<<(ostream &o,Number &ref){
    o<<ref.num;
    return o;
}
int main(){
    Number n1(8);
    Number n2(4);
    Number n3(20);
    Number n4(6);
    Number n5;

    cout<<(n5 = n1-n2).getNum()<<endl;  // internally n1.operator-(n2);
    cout<<(n5= n3/n4).getNum()<<endl;   // internally n3.operator/(n4);
    cout<<(n5 = n1*n3).getNum()<<endl;  // internally n1.operator*(n3);
    cout<<n5<<endl;  // internally operator<<(ostream &,n5);
}