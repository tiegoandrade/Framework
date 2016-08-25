package tiegoandrade.github.framework.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* Anota��o s� � lida em tempo de execu��o e somente usada em m�todos */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

/**
 * Anota��o que indica se um m�todo pode ser invocado.
 * 
 * @version 1.0 23-08-2016
 * @author Tiego
 *
 */
public @interface Init {
	
	boolean runOnInstantiation() default true;
}
