package interfaces;

public class SmsLogger implements Logger{                              // gerekli kodları yaz ancak interfacde yazmak zoeundadeğil üzerine yazae (ovveride)
                          // implemente etmek loggerı sms lpoggera uyarlar


	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi : " + message);
		
	}                
}