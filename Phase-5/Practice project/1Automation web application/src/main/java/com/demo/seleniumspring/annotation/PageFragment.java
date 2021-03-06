package com.demo.seleniumspring.annotation;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.lang.annotation.*;
@Lazy
@Component
@Scope("prototype") // to create new instances of bean instead ofsharing; helps during parallel runs
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PageFragment {
}
