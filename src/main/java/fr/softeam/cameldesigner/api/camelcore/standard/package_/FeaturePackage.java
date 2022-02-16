/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
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
    @objid ("fdba927c-a274-4176-a445-4cfa130524c3")
    public static final String STEREOTYPE_NAME = "Feature_Package";

    /**
     * Tells whether a {@link FeaturePackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Feature_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f296dbee-82ca-458b-b509-e5fb9d2bba1b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePackage.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("afb1e9ae-dfab-4499-b1c6-2607479e0ac1")
    public void addAttributes(final AttributeClass obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c112082e-cee7-4437-8324-a743741d0dd2")
    public void addSubFeatures(final FeaturePackage obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("44c77e1e-18b3-404a-b78a-2ada1be60915")
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
     * 
     */
    @objid ("d33b7b1e-0d97-4117-af8c-3c7e4e319d14")
    public List<AttributeClass> getAttributes() {
        List<AttributeClass> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MeasurableAttribute.canInstantiate(mObj))
        			results.add((MeasurableAttribute)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttribute.STEREOTYPE_NAME));
        	if (Certifiable.canInstantiate(mObj))
        			results.add((Certifiable)CamelDesignerProxyFactory.instantiate(mObj, Certifiable.STEREOTYPE_NAME));
        	if (SecurityAttribute.canInstantiate(mObj))
        			results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(mObj, SecurityAttribute.STEREOTYPE_NAME));
        	if (QualityAttribute.canInstantiate(mObj))
        			results.add((QualityAttribute)CamelDesignerProxyFactory.instantiate(mObj, QualityAttribute.STEREOTYPE_NAME));
        	if (AttributeClass.canInstantiate(mObj))
        			results.add((AttributeClass)CamelDesignerProxyFactory.instantiate(mObj, AttributeClass.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("c07ac263-23e5-474a-b597-c17fbe22effb")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4806e97a-4bd5-4649-b777-295c6ef51288")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e5bb84c-4f8b-421b-9f51-c684acf5a5e6")
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

    @objid ("89e03fcd-2f84-46bb-acdb-6375e04c7b88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f14f7409-2a3c-460a-8635-d0e7e9d2d845")
    public boolean removeAttributes(final AttributeClass obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a24e43fe-7d06-4579-a6c8-b04a75169923")
    public boolean removeSubFeatures(final FeaturePackage obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7072ee4b-d0f8-4f30-b778-e098976f6062")
    public void setParent(final FeaturePackage obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("19cc748c-2c86-4d7a-8ba8-d783332e550c")
    protected FeaturePackage(final Package elt) {
        super(elt);
    }

    @objid ("21c2bdec-ab84-4154-b5ff-90933f016c05")
    public static final class MdaTypes {
        @objid ("b346005a-24b3-4098-b0d4-553fbc62a3f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ac9499c-dbca-49e0-b39a-ec72d4023c56")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8c93d52-c19b-45dd-9cbe-4aaa341d878d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f6ba99f-549f-42c8-acff-f52436ad4c54")
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
