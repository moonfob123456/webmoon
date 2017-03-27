package org.zerock.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD}) //메소드한테 걸어주려고
@Retention(RetentionPolicy.RUNTIME)	//일단 이게 필요함
public @interface GetMapping {

	String value();
	
}
