/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationships</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.Relationships#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.Relationships#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getRelationships()
 * @model
 * @generated
 */
public interface Relationships extends Elements
{
  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * The literals are from the enumeration {@link io.github.jhipster.jdl.dsl.jdl.Cardinality}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see io.github.jhipster.jdl.dsl.jdl.Cardinality
   * @see #setCardinality(Cardinality)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getRelationships_Cardinality()
   * @model
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.Relationships#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see io.github.jhipster.jdl.dsl.jdl.Cardinality
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
   * The list contents are of type {@link io.github.jhipster.jdl.dsl.jdl.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' containment reference list.
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getRelationships_Relationships()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelationships();

} // Relationships
