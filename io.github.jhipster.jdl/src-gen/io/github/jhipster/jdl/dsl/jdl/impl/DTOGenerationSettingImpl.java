/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl.impl;

import io.github.jhipster.jdl.dsl.jdl.DTOGenerationSetting;
import io.github.jhipster.jdl.dsl.jdl.DTOType;
import io.github.jhipster.jdl.dsl.jdl.JdlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTO Generation Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.jhipster.jdl.dsl.jdl.impl.DTOGenerationSettingImpl#getDtoType <em>Dto Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTOGenerationSettingImpl extends GenerationSettingImpl implements DTOGenerationSetting
{
  /**
   * The default value of the '{@link #getDtoType() <em>Dto Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtoType()
   * @generated
   * @ordered
   */
  protected static final DTOType DTO_TYPE_EDEFAULT = DTOType.MAPSTRUCT;

  /**
   * The cached value of the '{@link #getDtoType() <em>Dto Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtoType()
   * @generated
   * @ordered
   */
  protected DTOType dtoType = DTO_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DTOGenerationSettingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JdlPackage.Literals.DTO_GENERATION_SETTING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOType getDtoType()
  {
    return dtoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDtoType(DTOType newDtoType)
  {
    DTOType oldDtoType = dtoType;
    dtoType = newDtoType == null ? DTO_TYPE_EDEFAULT : newDtoType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JdlPackage.DTO_GENERATION_SETTING__DTO_TYPE, oldDtoType, dtoType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JdlPackage.DTO_GENERATION_SETTING__DTO_TYPE:
        return getDtoType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JdlPackage.DTO_GENERATION_SETTING__DTO_TYPE:
        setDtoType((DTOType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.DTO_GENERATION_SETTING__DTO_TYPE:
        setDtoType(DTO_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JdlPackage.DTO_GENERATION_SETTING__DTO_TYPE:
        return dtoType != DTO_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (dtoType: ");
    result.append(dtoType);
    result.append(')');
    return result.toString();
  }

} //DTOGenerationSettingImpl
