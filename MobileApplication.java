package Mobile;

public class MobileApplication {
	public void sendMessage() {
		System.out.println("sending the Message");
	}
	public void shareDocument() {
		System.out.println("sharing the document");
	}
	public void makeCall() {
		System.out.println("making the call");
	}
	public static void main(String[] args) {
		MobileApplication mymobile=new MobileApplication();
		mymobile.sendMessage();
		mymobile.shareDocument();
		mymobile.makeCall();
	}

}
