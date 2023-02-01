/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
import fr.softeam.cameldesigner.api.camelcore.standard.instance.AttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.MeasurableAttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.QualityAttributeInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << Feature_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c4ed9c5-ea74-49d5-9198-5847748ef92e")
public abstract class FeaturePackage extends Feature {
<<<<<<< HEAD
    @objid ("7dd10452-0d2a-411e-99e4-6d767b0dbf92")
=======
    @objid ("f7466a81-955d-4871-86b7-77678c90c726")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Package";

    /**
     * Tells whether a {@link FeaturePackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << Feature_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("61a39970-f43e-4cd9-b60d-3e5c8daa5675")
=======
    @objid ("9ee3ef81-0412-437f-a30d-e04df9282c5b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePackage.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b8c0dcf3-6062-4b0c-b0e1-b52b387ccb8b")
=======
    @objid ("a6b06cc8-a382-4ec7-aca4-77db33b91507")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addAttributes(final AttributeClass obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'instances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("654dd788-814e-4272-8b6e-b82a031ce44d")
=======
    @objid ("e584091d-34fc-4363-9295-7460da392415")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addInstances(final AttributeInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a979e2e2-abcf-430a-a72a-76735ebc33f8")
=======
    @objid ("49e1a71c-f60d-40a4-a357-d38b1eb85048")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSubFeatures(final FeaturePackage obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("fff5e64e-df71-4f7d-a766-d5dc893ab6dd")
=======
    @objid ("03fcba3d-98b5-447d-99b5-da8c0e06b0b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9bdf16bd-2188-4360-a0b9-f39797586e0b")
=======
    @objid ("03994fdc-dcd0-4fbd-ab8b-17662829f4ee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9b0eae50-29ec-449d-a09d-d10a1c5782f1")
=======
    @objid ("0171c99a-a28c-4b0c-80da-b95e4b5f20a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'instances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f80535ad-8617-4788-b4ef-3fb392feeeda")
=======
    @objid ("823a271e-9894-4947-be44-edde9179042e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<AttributeInstance> getInstances() {
        List<AttributeInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (MeasurableAttributeInstance.canInstantiate(mObj))
        			results.add((MeasurableAttributeInstance)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttributeInstance.STEREOTYPE_NAME));
        	if (QualityAttributeInstance.canInstantiate(mObj))
        			results.add((QualityAttributeInstance)CamelDesignerProxyFactory.instantiate(mObj, QualityAttributeInstance.STEREOTYPE_NAME));
        	if (AttributeInstance.canInstantiate(mObj))
        			results.add((AttributeInstance)CamelDesignerProxyFactory.instantiate(mObj, AttributeInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("796c0aad-91ba-4cd5-b301-d1e94bfe9ee7")
=======
    @objid ("979870ba-9fd8-44b5-9b0d-7563d1c0f51f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public FeaturePackage getParent() {
        return (FeaturePackage)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), FeaturePackage.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e6c34545-44fe-4d87-8a49-ea8ae837cf60")
=======
    @objid ("9271e10b-48e8-487c-a4cf-b2f9589aa4d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<FeaturePackage> getSubFeatures() {
        List<FeaturePackage> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CamelModel.canInstantiate(mObj))
        			results.add((CamelModel)CamelDesignerProxyFactory.instantiate(mObj, CamelModel.STEREOTYPE_NAME));
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

<<<<<<< HEAD
    @objid ("86de20f8-a413-4656-a5af-d174eac2b4ee")
=======
    @objid ("c5213bf3-8def-40db-bb13-3dcb4c550168")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4e8d7e69-0b34-4040-a56a-84c483702c20")
=======
    @objid ("dbfae58b-a1ef-4cc2-9b74-6fa3ed712d35")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeAttributes(final AttributeClass obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'instances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("045f5ab1-0521-46ea-bcb3-bd5c12e0b167")
=======
    @objid ("ef1c4ed5-4706-40a4-8dc4-56d1119a63bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeInstances(final AttributeInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7a001872-d268-40ac-82fd-bb3237ab1f83")
=======
    @objid ("90f7d04d-542d-43d5-84e8-abfd52eea090")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSubFeatures(final FeaturePackage obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fdcbaf17-3423-4ac9-9eb5-a4f6e561adb4")
=======
    @objid ("8fc38f81-275f-4cf7-a560-2d1dd877f68c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final FeaturePackage obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

<<<<<<< HEAD
    @objid ("2f89a7ff-e7cb-4d4b-9a00-9666e42442a9")
=======
    @objid ("580acbe3-649f-4dd2-990e-1425d0bdbdc6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeaturePackage(final Package elt) {
        super(elt);
    }

    @objid ("21c2bdec-ab84-4154-b5ff-90933f016c05")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("a1ca005c-5f77-4938-be08-0169c3327f0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08b1c046-f232-4ff3-a83a-5d5f4df0bf1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("40003d84-9c01-4a48-a807-07809e93fc7e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("932065f1-5002-4cd4-bb4b-72e6b1e15768")
=======
        @objid ("eb6dc814-6132-4782-8c0f-8c009e24a9e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("628bbae8-ebf2-47a0-972b-0f868aaafd07")
        private static Stereotype MDAASSOCDEP;

        @objid ("3911eab4-28ca-4258-8235-13c6826d155c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("940d9792-0d77-4e18-84c7-cfb7a37f1eb9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
