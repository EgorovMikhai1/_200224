package org.example._2024_08_12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@MyAnn
public class Ann {
    private void get(String s) {
    }
}

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
@Deprecated
@interface MyAnn {
    String description() default "";
}