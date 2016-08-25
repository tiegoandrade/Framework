package tiegoandrade.github.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Anotação só é lida em tempo de execução e somente usada em métodos */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Anotação que indica se um método pode ser invocado.
 * 
 * @version 1.0 23-08-2016
 * @author Tiego
 *
 */
public @interface Init {
	
	boolean runOnInstantiation() default true;
}
