package org.gradle.api.experimental.android.library;

import org.gradle.api.provider.Property;
import org.gradle.declarative.dsl.model.annotations.Restricted;

@Restricted
public interface Minify {
    @Restricted
    Property<Boolean> getEnabled();
}
