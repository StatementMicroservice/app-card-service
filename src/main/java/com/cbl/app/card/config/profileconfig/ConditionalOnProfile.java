package com.cbl.app.card.config.profileconfig;


import com.cbl.app.card.enums.EnvironmentProfile;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnProfileCondition.class)
public @interface ConditionalOnProfile {
    EnvironmentProfile[] value();
}