package test.ch11.Annotation;

import java.lang.annotation.*;

//어노테이션 정의


//@Target : 어노테이션을 사용할 수 있는 곳을 지정

//ElementType.TYPE class에 적용시 사용
//@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Target({ElementType.METHOD})
//@Retention : 유지정책, 어노테이션을 언제시작해서 언제까지 유지를 할 건지 지정.
@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)
public @interface PrintAnnotation {
	String value() default "-"; // default : 기본값 설정
	int number() default 15;
}
