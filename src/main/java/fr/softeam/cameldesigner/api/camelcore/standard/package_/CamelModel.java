/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << CamelModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("67058037-b681-4ff5-91f4-e5aa09469cd2")
public class CamelModel extends NamedElement {
    @objid ("985b912c-cc76-46cb-b0ad-419a87f32513")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("71c90084-f015-4a31-8c36-a60af20ad24e")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("53c65ecf-ffed-437f-b805-f4c89dbf387b")
    public static final String APPLICATIONVERSION_TAGTYPE = "applicationVersion";

    /**
     * Tells whether a {@link CamelModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << CamelModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("83f06b21-2d7c-4ce7-925d-7cf4b3d006ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << CamelModel >> then instantiate a {@link CamelModel} proxy.
     * 
     * @return a {@link CamelModel} proxy on the created {@link Package}.
     */
    @objid ("e55bc927-5711-4f89-88f2-5cb41377133a")
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
    @objid ("474c29dc-2fce-4f08-92f0-0340c3a6f2ed")
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
    @objid ("0144c034-653e-47e3-ac26-4afbf27e7a37")
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
    @objid ("f1e23a95-4e0e-4ed6-90f3-d2fe4f74754e")
    public void addDataModels(final DataModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelModel.MdaTypes.MDAASSOCDEP);
            d.setName("dataModels");
            d.putTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE, "dataModels");
        }
    }

    /**
     * Add a value to the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e5a77c0d-2bc7-4e5a-a64d-ee6999d8e572")
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("c2475ae9-50a8-4d8d-bb98-f53cd915f929")
    public void addExecutionModels(final ExecutionModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("970d96bd-fa5b-4bf3-a07a-40080c8c00cc")
    public void addLocationModels(final LocationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0bff6bfa-ee4b-4b16-b2db-8a0331043438")
    public void addMetaDataModels(final MetaDataModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("47b65075-713f-4e71-8a91-f85afe2cb22d")
    public void addMetricModels(final MetricModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CamelModel.MdaTypes.MDAASSOCDEP);
            d.setName("metricModels");
            d.putTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE, "metricModels");
        }
    }

    /**
     * Add a value to the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("395168bb-30b5-436d-b2c6-2206451ae11e")
    public void addOrganisationModels(final OrganisationModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("7a1d4459-f1e3-40ae-ad61-a1733028e215")
    public void addRequirementModels(final RequirementModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0760aadf-f840-4519-b97d-b16d8e2fdb25")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("caf7453e-790b-48a0-b953-77320ac21fcd")
    public void addSecurityModels(final SecurityModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("f309b096-725c-4273-974b-697b4347fa89")
    public void addTypeModels(final TypeModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e70aed3c-2ddc-4905-bffd-f0cb267a7e01")
    public void addUnitModels(final UnitModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("f2874fbb-c8c4-4ba2-b9cf-880ac50fb25e")
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
    @objid ("1f83f718-b341-448d-990f-32e14ef8e296")
    public String getApplicationName() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4e0d4645-1386-452e-9dcd-f2738c78beb7")
    public String getApplicationVersion() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'dataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("bf67f8c2-a1f9-4265-af24-921cfac5c926")
    public List<DataModel> getDataModels() {
        List<DataModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE), "dataModels")
              && DataModel.canInstantiate(d.getDependsOn()))
                results.add((DataModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataModel.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("655a504a-b992-42ea-bdae-039c2f92ce45")
    public List<DeploymentModel> getDeploymentModels() {
        List<DeploymentModel> results = new ArrayList<>();
        for (ModelTree mObj : getElement().getOwnedElement()) {
            if (DeploymentTypeModel.canInstantiate(mObj)) {
                    results.add(DeploymentTypeModel.instantiate((Package)mObj));
            }else if (DeploymentInstanceModel.canInstantiate(mObj)) {
                results.add(DeploymentInstanceModel.instantiate((Package)mObj));
            }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("ba263a1b-3121-4515-8b80-0002f612dee2")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("ce8a382e-7c65-4a57-b26a-d65c2385d596")
    public List<ExecutionModel> getExecutionModels() {
        List<ExecutionModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ExecutionModel.canInstantiate(mObj))
                    results.add((ExecutionModel)CamelDesignerProxyFactory.instantiate(mObj, ExecutionModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("21ceec18-d97b-41ff-a1d3-a6f45568c0d4")
    public List<LocationModel> getLocationModels() {
        List<LocationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (LocationModel.canInstantiate(mObj))
                    results.add((LocationModel)CamelDesignerProxyFactory.instantiate(mObj, LocationModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("feb8ee5b-f011-4246-8d8f-fb79a38c66b1")
    public List<MetaDataModel> getMetaDataModels() {
        List<MetaDataModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (MetaDataModel.canInstantiate(mObj))
                    results.add((MetaDataModel)CamelDesignerProxyFactory.instantiate(mObj, MetaDataModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("d5125736-5f7e-4bad-acb8-1194cbb0bd90")
    public List<MetricModel> getMetricModels() {
        List<MetricModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CamelModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE), "metricModels")
              && MetricModel.canInstantiate(d.getDependsOn()))
                results.add((MetricModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricModel.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("c091bc02-ab62-446a-b251-accafbafb522")
    public List<OrganisationModel> getOrganisationModels() {
        List<OrganisationModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (OrganisationModel.canInstantiate(mObj))
                    results.add((OrganisationModel)CamelDesignerProxyFactory.instantiate(mObj, OrganisationModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("9b4b2037-fbb8-4273-9320-e8dff11094fc")
    public List<RequirementModel> getRequirementModels() {
        List<RequirementModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (RequirementModel.canInstantiate(mObj))
                    results.add((RequirementModel)CamelDesignerProxyFactory.instantiate(mObj, RequirementModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("84a0fd95-73b2-45e9-b518-c034d306f32e")
    public List<ScalabilityModel> getScalabilityModels() {
        List<ScalabilityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (ScalabilityModel.canInstantiate(mObj))
                    results.add((ScalabilityModel)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0367be32-c3ef-4cf4-931d-2f2c8355a94f")
    public List<SecurityModel> getSecurityModels() {
        List<SecurityModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (SecurityModel.canInstantiate(mObj))
                    results.add((SecurityModel)CamelDesignerProxyFactory.instantiate(mObj, SecurityModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("17ba6d67-f464-4f2f-9a4b-26a364fa9b55")
    public List<TypeModel> getTypeModels() {
        List<TypeModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (TypeModel.canInstantiate(mObj))
                    results.add((TypeModel)CamelDesignerProxyFactory.instantiate(mObj, TypeModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("990fa4b7-6fbd-4109-84a2-b22039e8d7f5")
    public List<UnitModel> getUnitModels() {
        List<UnitModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement())
            if (UnitModel.canInstantiate(mObj))
                    results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    @objid ("2b2bb849-d6a5-4375-a42c-a934d2419c12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("0b644cc2-8e62-409b-a106-f5a80fc2d7c3")
    public boolean removeDataModels(final DataModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CamelModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e1c4f477-ba76-4f29-8518-2385601274ae")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'executionModels' role.<p>
     * Role description:
     * null
     */
    @objid ("83b85db8-b394-404e-ac6e-d4b2b0fe29d5")
    public boolean removeExecutionModels(final ExecutionModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'locationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("93a9afcb-13fb-4d79-872d-cd82f022e0ba")
    public boolean removeLocationModels(final LocationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metaDataModels' role.<p>
     * Role description:
     * null
     */
    @objid ("eb6f89a4-5edd-4f64-ab84-079452f50cbf")
    public boolean removeMetaDataModels(final MetaDataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e5ac38ca-26c9-4131-8c0c-fd39360cfbe7")
    public boolean removeMetricModels(final MetricModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CamelModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CamelModel.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'organisationModels' role.<p>
     * Role description:
     * null
     */
    @objid ("6a5f4ee5-621f-45ee-b71a-bd471b6a7c87")
    public boolean removeOrganisationModels(final OrganisationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("dbd1763c-f61f-429a-83c5-6c7aed560a5f")
    public boolean removeRequirementModels(final RequirementModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("a5920462-ba44-4e4c-98ee-c11b82ec81d1")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("f99e7d5e-f922-444f-9efd-421d98c18a50")
    public boolean removeSecurityModels(final SecurityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'typeModels' role.<p>
     * Role description:
     * null
     */
    @objid ("47a6f0df-0027-46da-9f74-95129e75dbcd")
    public boolean removeTypeModels(final TypeModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'unitModels' role.<p>
     * Role description:
     * null
     */
    @objid ("399cae42-3919-489e-939b-1d7548c91e72")
    public boolean removeUnitModels(final UnitModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f6209e7-8c4a-45ed-a2fe-2a8e779d420b")
    public void setApplicationName(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6d24476a-b147-4306-84a9-52e47696a65b")
    public void setApplicationVersion(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT, value);
    }

    @objid ("6ff8424b-34b7-4d14-8354-e59960022133")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getDeploymentModels());
        result.addAll(getDataModels());
        result.addAll(getMetricModels());
        result.addAll(getRequirementModels());
        return result;
    }

    @objid ("648b063b-a491-49be-b60f-4056d6ff3998")
    protected CamelModel(final Package elt) {
        super(elt);
    }

    @objid ("18704a21-5db9-4f8d-9058-4c21969dcd9d")
    public static final class MdaTypes {
        @objid ("b87902a8-560e-41d8-8fc6-6b2780ba5cb9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5c8fc2b-a6fd-46a3-87c5-f61a5bd1e8da")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("586660dd-10b6-4393-8ce2-5151e851727d")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("827ae085-1639-4a8d-abc1-135e968e1e2d")
        private static Stereotype MDAASSOCDEP;

        @objid ("fcfb2e45-b322-4e17-a8c7-3e8c16edfaca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63a9d09f-5475-45eb-aba6-58fca47643a4")
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
