/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << Feature_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c4ed9c5-ea74-49d5-9198-5847748ef92e")
public abstract class FeaturePackage extends Feature {
    @objid ("1e269e99-1153-4790-9cb6-925333d6a149")
    public static final String STEREOTYPE_NAME = "Feature_Package";

    /**
     * Tells whether a {@link FeaturePackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Feature_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca63f013-043d-4787-a823-d7e3a18dec94")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePackage.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     */
    @objid ("9179b585-ece5-448d-b02d-90638eb071ed")
    public void addAttributes(final AttributeClass obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     */
    @objid ("e494372d-3ea0-46cf-b031-c52864dc1627")
    public void addSubFeatures(final FeaturePackage obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("c5a1cc7a-8f85-4a42-bcc3-f9870897922e")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FeaturePackage other = (FeaturePackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributes' role.<p>
     * Role description:
     * null
     */
    @objid ("a26238eb-cda3-42c8-a55e-2da50cb8f62d")
    public List<AttributeClass> getAttributes() {
        List<AttributeClass> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (MeasurableAttributeClass.canInstantiate(mObj))
                    results.add((MeasurableAttributeClass)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttributeClass.STEREOTYPE_NAME));
            if (Certifiable.canInstantiate(mObj))
                    results.add((Certifiable)CamelDesignerProxyFactory.instantiate(mObj, Certifiable.STEREOTYPE_NAME));
            if (SecurityAttribute.canInstantiate(mObj))
                    results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(mObj, SecurityAttribute.STEREOTYPE_NAME));
            if (QualityAttributeClass.canInstantiate(mObj))
                    results.add((QualityAttributeClass)CamelDesignerProxyFactory.instantiate(mObj, QualityAttributeClass.STEREOTYPE_NAME));
            if (AttributeClass.canInstantiate(mObj))
                    results.add((AttributeClass)CamelDesignerProxyFactory.instantiate(mObj, AttributeClass.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("7ab59d08-1a68-48d0-9fe1-562cb5f08bbd")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("0047bc85-676d-458e-9ff6-5563d691d5ec")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     */
    @objid ("a9197534-8f0c-47be-b0d8-feac0b135f2b")
    public List<FeaturePackage> getSubFeatures() {
        List<FeaturePackage> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (ConstraintModel.canInstantiate(mObj))
                    results.add((ConstraintModel)CamelDesignerProxyFactory.instantiate(mObj, ConstraintModel.STEREOTYPE_NAME));
            if (DataTypeModel.canInstantiate(mObj))
                    results.add((DataTypeModel)CamelDesignerProxyFactory.instantiate(mObj, DataTypeModel.STEREOTYPE_NAME));
            if (DataInstanceModel.canInstantiate(mObj))
                    results.add((DataInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceModel.STEREOTYPE_NAME));
            if (DeploymentInstanceModel.canInstantiate(mObj))
                    results.add((DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, DeploymentInstanceModel.STEREOTYPE_NAME));
            if (DeploymentTypeModel.canInstantiate(mObj))
                    results.add((DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(mObj, DeploymentTypeModel.STEREOTYPE_NAME));
            if (ExecutionModel.canInstantiate(mObj))
                    results.add((ExecutionModel)CamelDesignerProxyFactory.instantiate(mObj, ExecutionModel.STEREOTYPE_NAME));
            if (LocationModel.canInstantiate(mObj))
                    results.add((LocationModel)CamelDesignerProxyFactory.instantiate(mObj, LocationModel.STEREOTYPE_NAME));
            if (MetaDataModel.canInstantiate(mObj))
                    results.add((MetaDataModel)CamelDesignerProxyFactory.instantiate(mObj, MetaDataModel.STEREOTYPE_NAME));
            if (MetricInstanceModel.canInstantiate(mObj))
                    results.add((MetricInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, MetricInstanceModel.STEREOTYPE_NAME));
            if (MetricTypeModel.canInstantiate(mObj))
                    results.add((MetricTypeModel)CamelDesignerProxyFactory.instantiate(mObj, MetricTypeModel.STEREOTYPE_NAME));
            if (OrganisationModel.canInstantiate(mObj))
                    results.add((OrganisationModel)CamelDesignerProxyFactory.instantiate(mObj, OrganisationModel.STEREOTYPE_NAME));
            if (RequirementModel.canInstantiate(mObj))
                    results.add((RequirementModel)CamelDesignerProxyFactory.instantiate(mObj, RequirementModel.STEREOTYPE_NAME));
            if (ScalabilityModel.canInstantiate(mObj))
                    results.add((ScalabilityModel)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityModel.STEREOTYPE_NAME));
            if (SecurityModel.canInstantiate(mObj))
                    results.add((SecurityModel)CamelDesignerProxyFactory.instantiate(mObj, SecurityModel.STEREOTYPE_NAME));
            if (TypeModel.canInstantiate(mObj))
                    results.add((TypeModel)CamelDesignerProxyFactory.instantiate(mObj, TypeModel.STEREOTYPE_NAME));
            if (UnitModel.canInstantiate(mObj))
                    results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("032316ff-60a6-4503-b2db-431f420860ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributes' role.<p>
     * Role description:
     * null
     */
    @objid ("854ff6ee-1091-4771-8275-6faf62d02523")
    public boolean removeAttributes(final AttributeClass obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     */
    @objid ("ee59f5f8-c615-4b12-b5cb-c7fc81f1d210")
    public boolean removeSubFeatures(final FeaturePackage obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("8a8c9649-328a-41d3-a751-e6adf61941a6")
    public void setParent(final FeaturePackage obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("f6f9f595-709f-47f7-8775-da8b7ab92912")
    protected FeaturePackage(final Package elt) {
        super(elt);
    }

    @objid ("21c2bdec-ab84-4154-b5ff-90933f016c05")
    public static final class MdaTypes {
        @objid ("be0d5115-bdc2-4a4a-a3b5-21b1012a80a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95c8b301-50f1-4925-ad34-bbafa0c1372f")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e7d9b52-005b-4515-9376-9c08b23e83f5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f3c5f621-9b0c-4686-9667-254bf942e641")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9a524454-5126-4778-9cec-5eae95e4f160");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
