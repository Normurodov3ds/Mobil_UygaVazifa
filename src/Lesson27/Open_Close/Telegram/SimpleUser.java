package Lesson27.Open_Close.Telegram;

public class SimpleUser extends SendMessage{

    public SimpleUser(String name, String id) {
        super(name, id);
    }

    @Override
    void sendMessage(String s) {
        System.out.println("SimpleUser: "+super.getName()+" sand massege....\n" +
                "id: "+super.getId()+"\n" +
                "message: "+s+"\n" +
                "Premium +3$ for month");
    }
}
