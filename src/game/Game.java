package game;

import java.util.Scanner;

public class Game {
	 
    public static Character manager;
    public static Story story;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы являетесь президентом очень большого государства. \n"
        				+ "Однако ваш срок правления подходит к концу. Помимо переизбрания,\n"
        				+ "необходимо определиться с формой дальнейшего правления: либеральная или республиканская партия. \n"
        				+ "При всем при этом было бы неплохо сохранить любовь народа, иначе могут произойти страшные вещи.\n"
                        + "Для оформления некоторых документов, подпишитесь пожалуйста (укажите ваше имя):");
        manager = new Character(in.next());
        story = new Story();
        while (true) {
            manager.L += story.current_situation.dL;
            manager.P += story.current_situation.dP;
            manager.R += story.current_situation.dR;
            System.out.println("=====\n Народ:" + manager.P + "\tЛибералы:"
                    + manager.L + "\tРеспубликанцы:" + manager.R + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
 
    }
 
}