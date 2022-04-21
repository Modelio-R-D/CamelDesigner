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
    @objid ("e7f32e69-80fa-4bb1-b2f0-5070ac6a1047")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("ba2f1784-c1b3-4eae-87cd-7b3d0f7a8480")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("b4382caf-ab98-4210-8494-887e911c29cd")
    public static final String APPLICATIONVERSION_TAGTYPE = "applicationVersion";

    /**
     * Tells whether a {@link CamelModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << CamelModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cedada48-f24e-4ff1-b569-03efa8a2e337")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << CamelModel >> then instantiate a {@link CamelModel} proxy.
     * 
     * @return a {@link CamelModel} proxy on the created {@link Package}.
     */
    @objid ("f9741b69-60ad-4e2a-b455-79c6a0946248")
    public static CamelModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME);
        return CamelModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link CamelModel} proxy or <i>null</i>.
     */
    @objid ("cce569aa-bc45-4f47-94fb-ba74749bead9")
    public static CamelModel instantiate(final Package obj) {
        return CamelModel.canInstantiate(obj) ? new CamelModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModel} proxy from a {@link Package} stereotyped << CamelModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link CamelModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e6a53a18-89d8-4922-9870-3fca10bd274f")
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
     */
    @objid ("5c32958d-777e-499e-86ac-d1a898b6bfd2")
    public void addDataModels(final DataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("47a3a746-9edd-4d61-b669-8035b5eecadd")
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("8e901e54-ee3f-41db-b9f1-f363ca7c6bea")
    public void addExecutionModels(final ExecutionModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("868abbde-75f3-4e5d-b36f-b647f85b09c6")
    public void addLocationModels(final LocationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("56c38fa7-85ed-440c-9109-0e90cbb0fe4b")
    public void addMetaDataModels(final MetaDataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("fb508562-8409-41b0-9ad8-e571ae7aee22")
    public void addMetricModels(final MetricModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("c5523b84-3c2b-4efd-8762-f9f7e1788881")
    public void addOrganisationModels(final OrganisationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("fb286dd5-515f-4aca-9291-2706a5c4153c")
    public void addRequirementModels(final RequirementModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("90635690-3448-4424-9e5a-57637e1aff3e")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("b9cacf3a-0d1e-4336-bc54-769bad7767f4")
    public void addSecurityModels(final SecurityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("4b77e942-3f61-465f-b485-88d2dfa4a6e5")
    public void addTypeModels(final TypeModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0a5e3fe3-648a-41b3-b45a-e63265d61b55")
    public void addUnitModels(final UnitModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("43226470-8371-4daf-8826-44128e5daa2f")
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
    @objid ("578c7f9f-7d7e-45f2-a9d8-0f55dc81318c")
    public String getApplicationName() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c635cb7f-92dd-4958-97c9-e0683d1e4af7")
    public String getApplicationVersion() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'dataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("ab6eef72-7c75-441a-96d2-e138b7efedd2")
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
     */
    @objid ("019e05d9-1a45-458f-9d9a-65a336d8a21b")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("edc8f8d1-6a7a-4b99-8a4c-8ae606d9a91c")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("c72e4e71-5e5f-4788-92a3-a02616bd70df")
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
     */
    @objid ("f2ee4f76-08b6-4dba-86da-62c03234dd6a")
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
     */
    @objid ("d64b8eeb-29b5-4505-82f6-5487db20cca1")
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
     */
    @objid ("28086c75-a5c2-440d-b71b-6ee9170ac7f0")
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
     */
    @objid ("042c16d1-0e79-4c1f-a165-35caf8e9bc18")
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
     */
    @objid ("823268aa-9d63-44a8-be12-7a735379fdf7")
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
     */
    @objid ("8bea238c-9f13-42c4-a60c-352e8fe2e6f8")
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
     */
    @objid ("0c1bf383-c4e4-4497-a9cb-a9658d84f980")
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
     */
    @objid ("fd6fb6d4-330f-4355-800f-6c392a8b9cc5")
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
     */
    @objid ("8d1b6d6d-b38f-4322-8066-01b963ed3f9d")
    public List<UnitModel> getUnitModels() {
        List<UnitModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (UnitModel.canInstantiate(mObj))
                    results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("e42cb3ea-b26f-4266-9707-4972f4a7778f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("2032b026-db48-4e23-814c-ddce253d5a47")
    public boolean removeDataModels(final DataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("6dad6ffb-4a7a-4842-9ec2-8515523837c4")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("ded9eaf5-292c-4326-b483-e8184222918d")
    public boolean removeExecutionModels(final ExecutionModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("2faa03d3-1167-4481-84b7-50334c7fafeb")
    public boolean removeLocationModels(final LocationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("7104e3f1-2395-4216-bd41-335cb9372f96")
    public boolean removeMetaDataModels(final MetaDataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5b803069-1657-4076-afe9-032011f59ac2")
    public boolean removeMetricModels(final MetricModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("49d5f31a-b096-4d48-ad7f-b5942b19a580")
    public boolean removeOrganisationModels(final OrganisationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("8432f39f-b493-410e-a647-dd25ac981bc6")
    public boolean removeRequirementModels(final RequirementModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0a5fddad-22e1-4a17-ba94-2ea05eee6a88")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("6e93c669-fcae-4abf-a847-a180ddfd325c")
    public boolean removeSecurityModels(final SecurityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("a22804b4-65f4-41a6-8732-5f367a93f9de")
    public boolean removeTypeModels(final TypeModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("1f65f4d8-e85b-4b9c-9f7f-db133db72cc3")
    public boolean removeUnitModels(final UnitModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("763e68c7-d10a-4af3-bccf-3d0523286c52")
    public void setApplicationName(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de775256-1f31-463c-9215-3124fae854fe")
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

    @objid ("16c6c4f2-12ab-4259-a85b-1ffdb738af41")
    protected CamelModel(final Package elt) {
        super(elt);
    }

    @objid ("18704a21-5db9-4f8d-9058-4c21969dcd9d")
    public static final class MdaTypes {
        @objid ("cb3c647d-f2ed-4682-91a8-5e78a0586e38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("018b6d23-4ef9-4b72-9e55-f606485b0ed6")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("6c518aab-16ed-45e3-a8c7-7d2b0fcab435")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("27f10910-b99c-4e03-aaa1-d554254f3441")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd98f5d6-1afe-4a37-b3ae-207a660ac733")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("459a42bc-5dbe-47ad-8c27-293b97196685")
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
