package Lesson27.Open_Close.Telegram;

public abstract class SendMessage {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public SendMessage(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract void sendMessage(String s);

    public static void main(String[] args) {
        Premium premium = new Premium("Jamol","524551777");
        premium.sendMessage("Assalomu alaykum barchaga!");

        System.out.println();

        SimpleUser simpleUser = new SimpleUser("Komil","56647811");
        simpleUser.sendMessage("Va alaykum assalom!");
    }
}
