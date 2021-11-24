import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//meta annotations
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone{
	String os() default "Symbian";
	int version() default 1;
}

@SmartPhone(os="Android", version=10)
class NokiaASeries{
	String model;
	int screenSize;
	public NokiaASeries() {
	
	}
	public NokiaASeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}
	
}

public class Annotations2 {

	public static void main(String[] args) {
		NokiaASeries object = new NokiaASeries("Fire", 5);
		Annotation an = object.getClass().getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());

	}

}
