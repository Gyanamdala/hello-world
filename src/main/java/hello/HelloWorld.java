package hello;
import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args){
		LocalTime currentTime=new LocalTime();
		System.out.println("The current system time: "+ currentTime);
		System.outprintln("Anusha is a very very Good Girl");
		Greeter greeter=new Greeter();
		System.out.println(greeter.sayHello());
	}
}

