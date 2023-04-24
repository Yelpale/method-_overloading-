package methodovrloading;

public class MethodOverloading {
	//why/when?
	    public void sendMessage() {
	        System.out.println("sending the messages");
	    }
	    public void sendMessage(String text) {
	        System.out.println(text);
	    }
	    public void sendMessage(String text,int num) {
	        System.out.println(text+" "+num);
	    }
	    public void sendMessage(int num ,String text) {
	        System.out.println(text+" "+num);
	    }
	    public static void main(String[] args) {
	        //Developing the method with same name but different parameter
	        MethodOverloading m=new MethodOverloading();
	        m.sendMessage("hello",98784);
	        m.sendMessage();
	        m.sendMessage(0, "hi");
	        m.sendMessage("bye");
	    }

	 

	}
