/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("0227ffac-52ab-4a29-984a-f72261ef7d32")
    public static final String STEREOTYPE_NAME = "Feature_Package";

    /**
     * Tells whether a {@link FeaturePackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Feature_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("54640553-8f0b-4408-bc2f-0b003acce741")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePackage.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("251c68c2-16da-40fd-87f2-f6c4b8e72f8b")
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
    @objid ("b4403ba0-913f-449c-9d2a-3431db46e16d")
    public void addSubFeatures(final FeaturePackage obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("67e1da0c-ca05-4ce1-9ebd-30059311677d")
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
    @objid ("0bbe0ee9-19bd-4df9-bef9-37e9141e8312")
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
    @objid ("3f551edc-fad9-46a1-a9d1-995513a8843a")
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
    @objid ("949ebb1b-dcf7-4e53-a37e-9890f1000930")
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7002d891-9dfa-4e0a-890d-a2dda8e6158c")
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

    @objid ("3a041b22-2df7-400f-9dca-bd54dea060d4")
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
    @objid ("e9e61521-9c94-432e-9c45-a9f13b7ba173")
    public boolean removeAttributes(final AttributeClass obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5194f1e6-5fc6-45c5-82c2-4ecb89e847a6")
    public boolean removeSubFeatures(final FeaturePackage obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cc25e2d5-d2cf-41be-89a2-3c7a49493dac")
    public void setParent(final FeaturePackage obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("3f7abca7-7b44-447c-957e-7b40266904a0")
    protected FeaturePackage(final Package elt) {
        super(elt);
    }

    @objid ("21c2bdec-ab84-4154-b5ff-90933f016c05")
    public static final class MdaTypes {
        @objid ("655e949e-7a8e-4460-ae16-ba11b08687d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ae91d604-e4a5-42f3-b0cd-53f53518e0f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("0cf6ef04-1540-4c0a-b88a-9b826b01df0f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fbe13b59-481f-4481-b27f-5e3d24cc542f")
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
