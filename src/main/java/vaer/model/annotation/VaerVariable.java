package vaer.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.function.Supplier;

@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface VaerVariable {

	String name() default "";
	
	String[] group() default "";
	
	boolean generateGetterAndSetter() default true;
	
	long refreshRate() default 100;
	
}