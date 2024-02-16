package Lesson27.Open_Close.Telegram;

public class Premium extends SendMessage{

    public Premium(String name, String id) {
        super(name, id);
    }

    @Override
    void sendMessage(String s) {
        System.out.println("premium: "+super.getName()+" sand massege....\n" +
                "id: "+super.getId()+"\n" +
                "message: "+s);
    }
}
