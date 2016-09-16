/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Validators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getRequired <em>Required</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getMaxlength <em>Maxlength</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getStringValidators()
 * @model
 * @generated
 */
public interface StringValidators extends EObject
{
  /**
   * Returns the value of the '<em><b>Required</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' containment reference.
   * @see #setRequired(RequiredValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getStringValidators_Required()
   * @model containment="true"
   * @generated
   */
  RequiredValidator getRequired();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getRequired <em>Required</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' containment reference.
   * @see #getRequired()
   * @generated
   */
  void setRequired(RequiredValidator value);

  /**
   * Returns the value of the '<em><b>Min Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Length</em>' containment reference.
   * @see #setMinLength(MinLengthValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getStringValidators_MinLength()
   * @model containment="true"
   * @generated
   */
  MinLengthValidator getMinLength();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getMinLength <em>Min Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Length</em>' containment reference.
   * @see #getMinLength()
   * @generated
   */
  void setMinLength(MinLengthValidator value);

  /**
   * Returns the value of the '<em><b>Maxlength</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlength</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlength</em>' containment reference.
   * @see #setMaxlength(MaxLengthValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getStringValidators_Maxlength()
   * @model containment="true"
   * @generated
   */
  MaxLengthValidator getMaxlength();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getMaxlength <em>Maxlength</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlength</em>' containment reference.
   * @see #getMaxlength()
   * @generated
   */
  void setMaxlength(MaxLengthValidator value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(PatternValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getStringValidators_Pattern()
   * @model containment="true"
   * @generated
   */
  PatternValidator getPattern();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.StringValidators#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(PatternValidator value);

} // StringValidators
