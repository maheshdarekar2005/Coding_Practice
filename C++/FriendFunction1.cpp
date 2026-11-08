/*
1) class First
   {
      char str1[20];
   };
   class Second
   {
      char str2[20];
   };
write a friend function,which will create a  new string containing str1,str2 and also display it.
*/
#include <iostream>
#include <cstring>
using namespace std;
class Second;
class First{
   private:
      char str1[20];
   public:
      First(const char* str1){
         strcpy_s(this->str1,sizeof(this->str1)+1,str1);
      }
   friend void concat(const First , const Second );
};
class Second{
   private:
      char str2[20];
   public:
      Second(const char* str2){
         strcpy_s(this->str2,sizeof(this->str2)+1,str2);
      }
   friend void concat(const First , const Second );
};
void concat(const First f, const Second s){
   char str3[30];
   strcpy_s(str3,sizeof(str3),f.str1);
   strcat_s(str3,sizeof(str3),s.str2);
   cout<<str3<<endl;
}
int main(){
   First f("Mahesh");
   Second s(" Darekar");

   concat(f,s);
}