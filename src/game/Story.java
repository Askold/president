package game;

public class Story {
	 
    private Situation start_story;
    public Situation current_situation;
 
    Story() {
        start_story = new Situation(
                "еще один кандидат",
                "Для приличия, на выборах должны присутствовать еще кандидаты, кого мы выберем? \n"
                        + "(1)выбрать либерала\n"
                        + "(2)выбрать республиканца\n"
                        + "(3)выбрать независимого кандидата от народа",
                4, 0, 0, 0);
        start_story.direction[0] = new Situation(
                "либералы довольны +rep",
                "Интересное начало, посмотрим, что будет дальше ",
                0, 0, 10, -10);
        start_story.direction[1] = new Situation(
                "консерваторы довольны +rep",
                "Интересное начало, посмотрим, что будет дальше ",
                0, 0, -10, 10);
        start_story.direction[2] = new Situation(
                "народ доволен +rep",
                "Интересное начало, посмотрим, что будет дальше ", 
                0, 10, -10, -10);
        current_situation = start_story;
        start_story = new Situation(
                "наказание",
                "Ярый оппозиционер-либерал любовь народа не в первый разнарушил условный срок, \n"
                		+ "как мы с ним поступим?"
                        + "(1)в тюрьму его\n"
                        + "(2)раз народ так его любит, простим\n"
                        + "(3)подстроить его смерть",
                4, 0, 0, 0);
    }
 
    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }
 
    public boolean isEnd() {
    	boolean switcher = false;
    	
        return switcher;
    }
}