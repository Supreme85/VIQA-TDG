package ru.viqa.test_data_generator.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static ru.viqa.test_data_generator.generator.ValuesGroup.ALL_GROUPS;

/**
 * Created by 12345 on 29.12.2014.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface VIIntGroupData {
    public int[] value();
    public String group() default ALL_GROUPS;
}
