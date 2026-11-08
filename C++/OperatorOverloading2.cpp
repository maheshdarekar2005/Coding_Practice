/*
2) class sample
   {
	private:
		char ch;
	public:
		sample(char ch)
		{
			this->ch=ch;
		}
  };
given above class.
write a global function "display" which will access "ch" directly and display it.
call this function from main function.
*/
#include <iostream>
using namespace std;
class Sample{
    private:
        char ch;
    public:
        Sample(char ch){
            this->ch=ch;
        }
        friend void display(Sample &);
};
void display(Sample &ref){
    cout<<ref.ch;
}
int main(){
    Sample c('A');
    display(c);
}