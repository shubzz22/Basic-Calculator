import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            System.out.println(" enter opration : ");
            char ch =sc.next().trim().charAt(0);


            if(ch=='+' || ch=='*'||ch=='/'||ch=='%'||ch=='-')
            {
                System.out.println("enter num1");
                int num1=sc.nextInt();
                System.out.println("enter num2");
                int num2=sc.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                if(ch=='*'){
                    ans=num1*num2;
                }
                if(ch=='/'){
                    if(num1!=0){
                    ans=num1/num2;
                }}
                if(ch=='%'){
                    ans=num1%num2;

        }
        } else if (ch =='x'||ch=='X') {
                break;
            }

            else{
                System.out.println("invalid");
            }
            System.out.println(ans);

            }

        }
    }

