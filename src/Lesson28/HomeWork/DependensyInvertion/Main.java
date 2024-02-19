package Lesson28.HomeWork.DependensyInvertion;

public class Main {
    public static void main(String[] args) {

        SendMassage sendText = new sendText();
        SendMassage sendVideo = new sendVideo();

        User user = new User(sendText);
        User user2 = new User(sendVideo);


        user.setSendMassage();
        user2.setSendMassage();

        User user1 = new User(null);
        user1.setSendMassage();
    }
}

// user
class User {
    private SendMassage sendMassage;

    public User(SendMassage sendMassage) {
        this.sendMassage = sendMassage;
    }

    void setSendMassage() {
        if (sendMassage != null) {
            sendMassage.sendMassage();
            System.out.println("massage send!\n");
        } else System.out.println("massage is not send!");

    }
}

// abstract
interface SendMassage {
    void sendMassage();
}


// child
class sendVideo implements SendMassage {
    @Override
    public void sendMassage() {
        System.out.println("this is video massage!");
    }
}


// child
class sendText implements SendMassage {

    @Override
    public void sendMassage() {
        System.out.println("this is text message!");
    }
}














