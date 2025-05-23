package tech.intellispaces.javareflection.reference;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import tech.intellispaces.commons.type.PrimitiveType;
import tech.intellispaces.javareflection.customtype.CustomType;

/**
 * Primitive type reference.
 */
public interface PrimitiveReference extends TypeReference {

  /**
   * The primitive type corresponding to this type reference.
   */
  PrimitiveType primitiveType();

  String typename();

  @Override
  default boolean isPrimitiveReference() {
    return true;
  }

  @Override
  default boolean isArrayReference() {
    return false;
  }

  @Override
  default boolean isCustomTypeReference() {
    return false;
  }

  @Override
  default boolean isNamedReference() {
    return false;
  }

  @Override
  default boolean isWildcard() {
    return false;
  }

  @Override
  default Optional<PrimitiveReference> asPrimitiveReference() {
    return Optional.of(this);
  }

  @Override
  default TypeReference effective(Map<String, NotPrimitiveReference> typeMapping) {
    return this;
  }

  @Override
  default Collection<CustomType> dependencies() {
    return List.of();
  }

  @Override
  default Collection<String> dependencyTypenames() {
    return List.of();
  }
}
