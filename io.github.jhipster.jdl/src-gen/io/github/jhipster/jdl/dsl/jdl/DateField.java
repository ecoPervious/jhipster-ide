/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.DateField#getName <em>Name</em>}</li>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.DateField#getValidators <em>Validators</em>}</li>
 * </ul>
 *
 * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getDateField()
 * @model
 * @generated
 */
public interface DateField extends Field
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getDateField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.DateField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Validators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validators</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validators</em>' containment reference.
   * @see #setValidators(RequiredValidator)
   * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage#getDateField_Validators()
   * @model containment="true"
   * @generated
   */
  RequiredValidator getValidators();

  /**
   * Sets the value of the '{@link io.github.jhipster.jdl.dsl.jdl.DateField#getValidators <em>Validators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validators</em>' containment reference.
   * @see #getValidators()
   * @generated
   */
  void setValidators(RequiredValidator value);

} // DateField
