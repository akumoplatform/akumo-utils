package com.akumo.core.util.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface AKumoJS {
    String template() default "";
    String file() default "";
}
