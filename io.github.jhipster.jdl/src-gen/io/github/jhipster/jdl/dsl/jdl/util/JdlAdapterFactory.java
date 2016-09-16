/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl.util;

import io.github.jhipster.jdl.dsl.jdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.github.jhipster.jdl.dsl.jdl.JdlPackage
 * @generated
 */
public class JdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JdlSwitch<Adapter> modelSwitch =
    new JdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainModel(DomainModel object)
      {
        return createDomainModelAdapter();
      }
      @Override
      public Adapter caseElements(Elements object)
      {
        return createElementsAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseField(Field object)
      {
        return createFieldAdapter();
      }
      @Override
      public Adapter caseEnumField(EnumField object)
      {
        return createEnumFieldAdapter();
      }
      @Override
      public Adapter caseStringField(StringField object)
      {
        return createStringFieldAdapter();
      }
      @Override
      public Adapter caseNumericField(NumericField object)
      {
        return createNumericFieldAdapter();
      }
      @Override
      public Adapter caseIntegerField(IntegerField object)
      {
        return createIntegerFieldAdapter();
      }
      @Override
      public Adapter caseLongField(LongField object)
      {
        return createLongFieldAdapter();
      }
      @Override
      public Adapter caseBigDecimalField(BigDecimalField object)
      {
        return createBigDecimalFieldAdapter();
      }
      @Override
      public Adapter caseFloatField(FloatField object)
      {
        return createFloatFieldAdapter();
      }
      @Override
      public Adapter caseDoubleField(DoubleField object)
      {
        return createDoubleFieldAdapter();
      }
      @Override
      public Adapter caseBooleanField(BooleanField object)
      {
        return createBooleanFieldAdapter();
      }
      @Override
      public Adapter caseDateField(DateField object)
      {
        return createDateFieldAdapter();
      }
      @Override
      public Adapter caseLocalDateField(LocalDateField object)
      {
        return createLocalDateFieldAdapter();
      }
      @Override
      public Adapter caseZonedDateTimeField(ZonedDateTimeField object)
      {
        return createZonedDateTimeFieldAdapter();
      }
      @Override
      public Adapter caseBinaryLargeObjectField(BinaryLargeObjectField object)
      {
        return createBinaryLargeObjectFieldAdapter();
      }
      @Override
      public Adapter caseBlobField(BlobField object)
      {
        return createBlobFieldAdapter();
      }
      @Override
      public Adapter caseAnyBlobField(AnyBlobField object)
      {
        return createAnyBlobFieldAdapter();
      }
      @Override
      public Adapter caseImageBlobField(ImageBlobField object)
      {
        return createImageBlobFieldAdapter();
      }
      @Override
      public Adapter caseRequiredValidator(RequiredValidator object)
      {
        return createRequiredValidatorAdapter();
      }
      @Override
      public Adapter caseMinLengthValidator(MinLengthValidator object)
      {
        return createMinLengthValidatorAdapter();
      }
      @Override
      public Adapter caseMaxLengthValidator(MaxLengthValidator object)
      {
        return createMaxLengthValidatorAdapter();
      }
      @Override
      public Adapter casePatternValidator(PatternValidator object)
      {
        return createPatternValidatorAdapter();
      }
      @Override
      public Adapter caseMinValidator(MinValidator object)
      {
        return createMinValidatorAdapter();
      }
      @Override
      public Adapter caseMaxValidator(MaxValidator object)
      {
        return createMaxValidatorAdapter();
      }
      @Override
      public Adapter caseMinBytesValidator(MinBytesValidator object)
      {
        return createMinBytesValidatorAdapter();
      }
      @Override
      public Adapter caseMaxBytesValidator(MaxBytesValidator object)
      {
        return createMaxBytesValidatorAdapter();
      }
      @Override
      public Adapter caseStringValidators(StringValidators object)
      {
        return createStringValidatorsAdapter();
      }
      @Override
      public Adapter caseNumericValidators(NumericValidators object)
      {
        return createNumericValidatorsAdapter();
      }
      @Override
      public Adapter caseBlobValidators(BlobValidators object)
      {
        return createBlobValidatorsAdapter();
      }
      @Override
      public Adapter caseRelationships(Relationships object)
      {
        return createRelationshipsAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseRelationshipName(RelationshipName object)
      {
        return createRelationshipNameAdapter();
      }
      @Override
      public Adapter caseEnumType(EnumType object)
      {
        return createEnumTypeAdapter();
      }
      @Override
      public Adapter caseGenerationSetting(GenerationSetting object)
      {
        return createGenerationSettingAdapter();
      }
      @Override
      public Adapter caseServiceGenerationSetting(ServiceGenerationSetting object)
      {
        return createServiceGenerationSettingAdapter();
      }
      @Override
      public Adapter caseDTOGenerationSetting(DTOGenerationSetting object)
      {
        return createDTOGenerationSettingAdapter();
      }
      @Override
      public Adapter casePaginateGenerationSetting(PaginateGenerationSetting object)
      {
        return createPaginateGenerationSettingAdapter();
      }
      @Override
      public Adapter caseAngularSuffixGenerationSetting(AngularSuffixGenerationSetting object)
      {
        return createAngularSuffixGenerationSettingAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.DomainModel <em>Domain Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.DomainModel
   * @generated
   */
  public Adapter createDomainModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.Elements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.Elements
   * @generated
   */
  public Adapter createElementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.Field
   * @generated
   */
  public Adapter createFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.EnumField <em>Enum Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.EnumField
   * @generated
   */
  public Adapter createEnumFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.StringField <em>String Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.StringField
   * @generated
   */
  public Adapter createStringFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.NumericField <em>Numeric Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.NumericField
   * @generated
   */
  public Adapter createNumericFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.IntegerField <em>Integer Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.IntegerField
   * @generated
   */
  public Adapter createIntegerFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.LongField <em>Long Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.LongField
   * @generated
   */
  public Adapter createLongFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.BigDecimalField <em>Big Decimal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.BigDecimalField
   * @generated
   */
  public Adapter createBigDecimalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.FloatField <em>Float Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.FloatField
   * @generated
   */
  public Adapter createFloatFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.DoubleField <em>Double Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.DoubleField
   * @generated
   */
  public Adapter createDoubleFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.BooleanField <em>Boolean Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.BooleanField
   * @generated
   */
  public Adapter createBooleanFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.DateField <em>Date Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.DateField
   * @generated
   */
  public Adapter createDateFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.LocalDateField <em>Local Date Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.LocalDateField
   * @generated
   */
  public Adapter createLocalDateFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.ZonedDateTimeField <em>Zoned Date Time Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.ZonedDateTimeField
   * @generated
   */
  public Adapter createZonedDateTimeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.BinaryLargeObjectField <em>Binary Large Object Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.BinaryLargeObjectField
   * @generated
   */
  public Adapter createBinaryLargeObjectFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.BlobField <em>Blob Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.BlobField
   * @generated
   */
  public Adapter createBlobFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.AnyBlobField <em>Any Blob Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.AnyBlobField
   * @generated
   */
  public Adapter createAnyBlobFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.ImageBlobField <em>Image Blob Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.ImageBlobField
   * @generated
   */
  public Adapter createImageBlobFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.RequiredValidator <em>Required Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.RequiredValidator
   * @generated
   */
  public Adapter createRequiredValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MinLengthValidator <em>Min Length Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MinLengthValidator
   * @generated
   */
  public Adapter createMinLengthValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MaxLengthValidator <em>Max Length Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MaxLengthValidator
   * @generated
   */
  public Adapter createMaxLengthValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.PatternValidator <em>Pattern Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.PatternValidator
   * @generated
   */
  public Adapter createPatternValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MinValidator <em>Min Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MinValidator
   * @generated
   */
  public Adapter createMinValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MaxValidator <em>Max Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MaxValidator
   * @generated
   */
  public Adapter createMaxValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MinBytesValidator <em>Min Bytes Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MinBytesValidator
   * @generated
   */
  public Adapter createMinBytesValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.MaxBytesValidator <em>Max Bytes Validator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.MaxBytesValidator
   * @generated
   */
  public Adapter createMaxBytesValidatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.StringValidators <em>String Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.StringValidators
   * @generated
   */
  public Adapter createStringValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.NumericValidators <em>Numeric Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.NumericValidators
   * @generated
   */
  public Adapter createNumericValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.BlobValidators <em>Blob Validators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.BlobValidators
   * @generated
   */
  public Adapter createBlobValidatorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.Relationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.Relationships
   * @generated
   */
  public Adapter createRelationshipsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.RelationshipName <em>Relationship Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.RelationshipName
   * @generated
   */
  public Adapter createRelationshipNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.EnumType
   * @generated
   */
  public Adapter createEnumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.GenerationSetting <em>Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.GenerationSetting
   * @generated
   */
  public Adapter createGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.ServiceGenerationSetting <em>Service Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.ServiceGenerationSetting
   * @generated
   */
  public Adapter createServiceGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.DTOGenerationSetting <em>DTO Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.DTOGenerationSetting
   * @generated
   */
  public Adapter createDTOGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.PaginateGenerationSetting <em>Paginate Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.PaginateGenerationSetting
   * @generated
   */
  public Adapter createPaginateGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link io.github.jhipster.jdl.dsl.jdl.AngularSuffixGenerationSetting <em>Angular Suffix Generation Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see io.github.jhipster.jdl.dsl.jdl.AngularSuffixGenerationSetting
   * @generated
   */
  public Adapter createAngularSuffixGenerationSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JdlAdapterFactory
