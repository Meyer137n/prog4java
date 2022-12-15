import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        matplate mt = new matplate();
        ram rm = new ram();
        processor prc = new processor();
        videocard vdc = new videocard();
        dop dp = new dop();
        computer []pc = new computer[20];
        int kolvo;
        System.out.print("\n\n Введите количество компьютеров: ");
        Scanner scan = new Scanner(System.in);
        kolvo=scan.nextInt();
        for(int i=0; i<kolvo; i++)
        {

            pc[i]=new computer(mt,rm,prc,vdc,dp,0);
            pc[i].set_computer();
        }
        for(int i=0; i<kolvo; i++)
        {
            pc[i].get_computer();
        }
        Scanner way = new Scanner(System.in);
        System.out.print("\n\n Демонстрация работы с классом String ");
        System.out.print("\n\n Введите слова, разделённые пробелами: ");
        String text;
        text = way.nextLine();
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(" " + word);
        }
    }
}

