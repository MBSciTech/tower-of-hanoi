/*
 * name : Maharshi Bhatt
 * date : 21/03/2024
 * aim  : to archieve the problem of tower of honoi.
 */
import java.util.*;
class TOH{
    static int stepCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        toh(n,'s','a','d');
        sc.close();
    }
    static void toh(int n,char s,char a,char d){
        if(n>0){
            toh(n-1,s,a,d);
            System.out.println((++stepCount) +". " + s+"-->"+d);
            toh(n-1,a,s,d);
        }
    }
}
