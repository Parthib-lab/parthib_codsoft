#include<stdio.h>
void my(int *ptra,int *ptrb){
    int *temp;
    temp=ptrb;
    ptrb=ptra;
    ptra=temp;
     printf("%d  %d\n",*ptra,*ptrb);
 
}
int main(){
    int a=2016,b=0,c=4,d=42,cnt=0;
    int *ptr=&a;
   my(&a,&b);
    printf("%d  %d\n",*ptr,cnt);
    if(a<c){
    my(&c,&a);
    cnt++;}
    my(&a,&d);
    printf("%d  %d",*ptr,cnt);

    

}