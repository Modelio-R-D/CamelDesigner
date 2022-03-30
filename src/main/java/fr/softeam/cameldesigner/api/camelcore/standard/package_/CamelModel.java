/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
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
 * Proxy class to handle a {@link Package} with << CamelModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("67058037-b681-4ff5-91f4-e5aa09469cd2")
public class CamelModel extends ExpendableElement {
    @objid ("14d7b18d-6f38-4166-aaeb-b10ab6466231")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("64362d47-2269-4bdd-9c90-476082561005")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("def5fe75-96e5-4cb0-8c3e-418364285a66")
    public static final String APPLICATIONVERSION_TAGTYPE = "applicationVersion";

    /**
     * Tells whether a {@link CamelModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << CamelModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c3768d52-9113-4132-bfbe-b6dcfb161f2e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << CamelModel >> then instantiate a {@link CamelModel} proxy.
     * 
     * @return a {@link CamelModel} proxy on the created {@link Package}.
     */
    @objid ("720ba4a2-e6c3-4ee2-90af-9c7018356737")
    public static CamelModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME);
        return CamelModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link CamelModel} proxy or <i>null</i>.
     */
    @objid ("7f7dd575-aa77-43c2-b204-97de1c3aeaa4")
    public static CamelModel instantiate(final Package obj) {
        return CamelModel.canInstantiate(obj) ? new CamelModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link CamelModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("390a8f4f-f6d6-4cba-83c2-ad622c60216e")
    public static CamelModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (CamelModel.canInstantiate(obj))
        	return new CamelModel(obj);
        else
        	throw new IllegalArgumentException("CamelModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'dataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("75680257-f49b-40e4-a3a5-d9dc5da169ba")
    public void addDataModels(final DataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25d202af-ceda-4fd6-8631-14e9cc245af0")
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'executionModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("03a59c8a-50ff-4070-bc9d-889a2a86002d")
    public void addExecutionModels(final ExecutionModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'locationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1348f864-909b-4831-80b8-5c67956d73fe")
    public void addLocationModels(final LocationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metaDataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8dd76c99-5b6d-40e3-a209-868dd1f7799b")
    public void addMetaDataModels(final MetaDataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26af70f0-c038-4e28-acb9-e6d3d5d07a21")
    public void addMetricModels(final MetricModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'organisationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3e0ffa41-c688-4bc4-84bf-9ae58d65a203")
    public void addOrganisationModels(final OrganisationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("21685d2b-99d1-431f-b955-50a3743e37c0")
    public void addRequirementModels(final RequirementModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'scalabilityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f785309f-faf1-48dd-a08d-a34f6eb7c1b9")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("48cd9eb9-8fce-44ce-b4fa-2868cba020a3")
    public void addSecurityModels(final SecurityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'typeModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8da5825b-f24a-42d2-94fb-e82f150d0fe6")
    public void addTypeModels(final TypeModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'unitModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("538f5025-83ac-4bc6-a00a-66458e884c2b")
    public void addUnitModels(final UnitModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("cee696f4-1d59-475e-8f4f-d0cd05ecca3d")
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
        CamelModel other = (CamelModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a66bc531-7ea9-4526-8ebd-dfe61a8f7e44")
    public String getApplicationName() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("433106b2-cfbc-4523-8716-e37680ad910a")
    public String getApplicationVersion() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'dataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("857bd649-ea3c-4cc2-9839-44061e1eae3a")
    public List<DataModel> getDataModels() {
        List<DataModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (DataTypeModel.canInstantiate(mObj))
        			results.add((DataTypeModel)CamelDesignerProxyFactory.instantiate(mObj, DataTypeModel.STEREOTYPE_NAME));
        	if (DataInstanceModel.canInstantiate(mObj))
        			results.add((DataInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, DataInstanceModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c06fc22e-e291-4690-95a1-d51b87db5f76")
    public List<DeploymentModel> getDeploymentModels() {
        List<DeploymentModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (DeploymentInstanceModel.canInstantiate(mObj))
        			results.add((DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, DeploymentInstanceModel.STEREOTYPE_NAME));
        	if (DeploymentTypeModel.canInstantiate(mObj))
        			results.add((DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(mObj, DeploymentTypeModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("34ce5182-aeaf-494a-9121-d82cdb014dbe")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'executionModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d097a2df-9b07-4fe4-a515-65033433dc5a")
    public List<ExecutionModel> getExecutionModels() {
        List<ExecutionModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (ExecutionModel.canInstantiate(mObj))
        			results.add((ExecutionModel)CamelDesignerProxyFactory.instantiate(mObj, ExecutionModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'locationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f05f668-aeac-45fd-8a5d-7d233933cb6e")
    public List<LocationModel> getLocationModels() {
        List<LocationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (LocationModel.canInstantiate(mObj))
        			results.add((LocationModel)CamelDesignerProxyFactory.instantiate(mObj, LocationModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metaDataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e7992f6b-6b6c-49db-9fab-540c9f93a080")
    public List<MetaDataModel> getMetaDataModels() {
        List<MetaDataModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MetaDataModel.canInstantiate(mObj))
        			results.add((MetaDataModel)CamelDesignerProxyFactory.instantiate(mObj, MetaDataModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61c07a98-f816-41af-a2e7-53429fa89a59")
    public List<MetricModel> getMetricModels() {
        List<MetricModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (MetricInstanceModel.canInstantiate(mObj))
        			results.add((MetricInstanceModel)CamelDesignerProxyFactory.instantiate(mObj, MetricInstanceModel.STEREOTYPE_NAME));
        	if (MetricTypeModel.canInstantiate(mObj))
        			results.add((MetricTypeModel)CamelDesignerProxyFactory.instantiate(mObj, MetricTypeModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'organisationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("01e604e2-9715-464c-a029-a1b7e6d39008")
    public List<OrganisationModel> getOrganisationModels() {
        List<OrganisationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (OrganisationModel.canInstantiate(mObj))
        			results.add((OrganisationModel)CamelDesignerProxyFactory.instantiate(mObj, OrganisationModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requirementModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("28b002a4-9bf5-489d-b467-096905f15bc4")
    public List<RequirementModel> getRequirementModels() {
        List<RequirementModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (RequirementModel.canInstantiate(mObj))
        			results.add((RequirementModel)CamelDesignerProxyFactory.instantiate(mObj, RequirementModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'scalabilityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c7aabbdc-fb0a-45c6-b233-26b6b25b5ac0")
    public List<ScalabilityModel> getScalabilityModels() {
        List<ScalabilityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (ScalabilityModel.canInstantiate(mObj))
        			results.add((ScalabilityModel)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aad68742-8e35-4ed4-9465-a827e049f339")
    public List<SecurityModel> getSecurityModels() {
        List<SecurityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityModel.canInstantiate(mObj))
        			results.add((SecurityModel)CamelDesignerProxyFactory.instantiate(mObj, SecurityModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'typeModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fcac2270-a4ef-4b72-a217-66042caf15dd")
    public List<TypeModel> getTypeModels() {
        List<TypeModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (TypeModel.canInstantiate(mObj))
        			results.add((TypeModel)CamelDesignerProxyFactory.instantiate(mObj, TypeModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'unitModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b995917-9d1d-408b-a31b-c715d4f58cae")
    public List<UnitModel> getUnitModels() {
        List<UnitModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (UnitModel.canInstantiate(mObj))
        			results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("d7084627-4145-4187-8c0d-54e7dda74578")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e32765a-a640-4a97-a998-46a0cfbdbd42")
    public boolean removeDataModels(final DataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("81644925-2d41-45cc-a88e-836690884c73")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'executionModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5d563717-8ff7-4eaf-a3a2-9ae34fce4150")
    public boolean removeExecutionModels(final ExecutionModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'locationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("968614df-8985-42f1-92ce-83e29e5055ca")
    public boolean removeLocationModels(final LocationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metaDataModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("71fe6b49-838c-4b2e-96bf-fd874e710da9")
    public boolean removeMetaDataModels(final MetaDataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e2729abc-e881-4fdb-af15-b3d92486b3d3")
    public boolean removeMetricModels(final MetricModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'organisationModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("227a299c-3c8e-4031-bd3c-4a23bfd75e82")
    public boolean removeOrganisationModels(final OrganisationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("678116f0-b97a-4d99-8e65-f5debf8d0e1f")
    public boolean removeRequirementModels(final RequirementModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("811dd16a-527e-4226-9ee8-bb04cde8c64d")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13ee4049-282f-4f50-8400-e929230f2aa0")
    public boolean removeSecurityModels(final SecurityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'typeModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("09a13414-4833-4d38-9b51-b5acbe8abdf3")
    public boolean removeTypeModels(final TypeModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'unitModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("812ddcc5-6d32-4500-8121-6c6e67c21039")
    public boolean removeUnitModels(final UnitModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54986c02-41ae-4c8b-b723-a2dfa20f9c51")
    public void setApplicationName(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5a053cfe-d391-4312-8d56-9f65cb7a63ac")
    public void setApplicationVersion(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT, value);
    }

    @objid ("6ff8424b-34b7-4d14-8354-e59960022133")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getDeploymentModels());
        result.addAll(getRequirementModels());
        result.addAll(getMetaDataModels());
        result.addAll(getScalabilityModels());
        result.addAll(getLocationModels());
        result.addAll(getSecurityModels());
        result.addAll(getTypeModels());
        result.addAll(getOrganisationModels());
        result.addAll(getUnitModels());
        result.addAll(getExecutionModels());
        result.addAll(getDataModels());
        result.addAll(getMetricModels());
        return result;
    }

    @objid ("d886779c-9832-439f-a103-e5952a1ff89a")
    protected CamelModel(final Package elt) {
        super(elt);
    }

    @objid ("18704a21-5db9-4f8d-9058-4c21969dcd9d")
    public static final class MdaTypes {
        @objid ("33c7cef3-6833-4e1c-8077-be82e71208be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fc99e244-192e-4a43-9f90-098ee36a1873")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("22f36092-6189-4810-b29e-b6fa10ae6db2")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("d4ab9bad-24db-4a47-ae1d-2889bbd7e834")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f065378-b271-47f8-8a70-0c36008fad3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb2fec34-a284-4d79-a9d3-fa9a7089623a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e33cb0ef-7003-4579-8739-638c171ab891");
            APPLICATIONNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1e31728e-d8b4-4498-9d67-219b020ee5ff");
            APPLICATIONVERSION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd5b684e-453d-4203-a1ac-e24d368f74ad");
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
