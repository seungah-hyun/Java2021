package Circle;
abstract class HttpServlet{
	public abstract void service(); 
		
	
}
class LoginServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("�α����մϴ�.");
	}
}
class FileDownloadServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("�ٿ�ε��մϴ�.");
	}
}

public class  HttpServletExample{

	public static void main(String[] args) {
		
		
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}

	

	public static void method(HttpServlet servlet) {
		
		servlet.service();
	}
}
