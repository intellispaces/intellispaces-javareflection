package tech.intellispaces.javareflection.instance;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Optional;

import tech.intellispaces.javareflection.customtype.AnnotationType;

/**
 * The annotation instance.
 */
public interface AnnotationInstance extends Instance {

  @Override
  default Optional<AnnotationInstance> asAnnotation() {
    return Optional.of(this);
  }

  /**
   * Annotation type statement.
   */
  AnnotationType annotationStatement();

  /**
   * Annotation elements.
   */
  Collection<AnnotationElement> elements();

  Optional<Instance> value();

  Optional<Instance> valueOf(String elementName);

  <A extends Annotation> A asAnnotationOf(Class<A> aClass);
}
