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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
public class CamelModel extends FeaturePackage {
<<<<<<< HEAD
    @objid ("9ba37eab-b493-438b-ba45-f308d0651bfe")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("fa697446-817e-41d8-a66a-18f2e09f2479")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("78a08146-d677-4a0e-ac4c-2ed244f31aa4")
=======
    @objid ("ea4c1e4d-8c31-490b-b530-7cd32cefc516")
    public static final String STEREOTYPE_NAME = "CamelModel";

    @objid ("83c10344-7ec4-4a49-b39c-7f4751aa7684")
    public static final String APPLICATIONNAME_TAGTYPE = "applicationName";

    @objid ("1db6a4c2-e6dc-499b-9965-bc212a1d62fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String APPLICATIONVERSION_TAGTYPE = "applicationVersion";

    /**
     * Tells whether a {@link CamelModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << CamelModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("6f16d378-eac6-469c-930e-3ac588d89dc9")
=======
    @objid ("d50566df-1ed6-45c3-99c0-ac50a07167a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << CamelModel >> then instantiate a {@link CamelModel} proxy.
     * 
     * @return a {@link CamelModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("8dfadc52-1680-4102-b1ff-b569aac039b3")
=======
    @objid ("30269788-2343-472c-b4b6-79a9410a1fb3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4e037600-19fe-435f-8b80-c23177bbd692")
=======
    @objid ("9f1e9d8d-2dd4-49ec-8d16-362f2056d9b4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e3c7c7ca-297f-49e3-8821-e493a8f811b4")
=======
    @objid ("1788a5ca-a0bf-4a1c-876d-16b808af4ed4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a731b884-4204-42d2-beaa-246318e1f0a6")
=======
    @objid ("0b21ea9a-56ef-4a7e-b2c0-72c04a30dcdf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("21a6de53-56b4-4f32-b095-d92aeda43580")
=======
    @objid ("750c7a23-13ce-4b4a-9eba-ee09d287f3a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2b2064ae-cf43-4e3c-8e4a-56cc44e082f7")
=======
    @objid ("279ad1f5-157e-4a3e-af45-1596f0295a87")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final CamelModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'executionModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ef160f2e-da70-4485-94a2-5270a8c6fd9b")
=======
    @objid ("4ce06691-c156-48d7-aac3-aa1c69b63c3d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c9a8a36f-a5bb-4d49-a27c-66135af24320")
=======
    @objid ("58de7539-e006-4d73-bf4d-1fb00899c9ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c7c0aeab-f10c-4689-8cd7-cddcef0c2e81")
=======
    @objid ("eb3a9c9b-fb07-41db-ab50-fb4602a6a6e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("482fabc9-1dc9-4671-84f7-42b4284020bc")
=======
    @objid ("c9efd72b-938e-4629-97e6-9f9bef93efc5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e30ab056-0945-48e7-bad5-9a592bf1d1a7")
=======
    @objid ("30890006-696f-4a3b-9de2-8fa5ed5b12ca")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7751f490-0f41-4406-baf2-4adb83fa2f4b")
=======
    @objid ("076a8b5d-c0eb-4aac-a1e3-863d7153eb0e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0daf5faf-cb13-4b79-8d9f-ebd63aa48e81")
=======
    @objid ("53a8ec76-a2ea-4e34-8d9b-d69775fbb576")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c302b309-3471-47a3-b520-e0073dbab7bb")
=======
    @objid ("d8e289c1-2dc0-4c0f-b84d-fae9372ee701")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("04aa5db5-e2d6-4429-9408-55e424a34144")
=======
    @objid ("929c87d0-aa0c-48de-96ab-c0f59e9ee1ed")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("cbfcad29-a4bf-4df4-8a0e-fb60a6b2caa0")
=======
    @objid ("71ba9c12-0062-40ac-b566-db2c751a2b3e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addUnitModels(final UnitModel obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("21e21334-0a9f-4c46-89c2-c84720dc22eb")
=======
    @objid ("fe481c66-2d52-414d-bf8f-16e25a723652")
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
        CamelModel other = (CamelModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("71f50db4-b300-4914-815c-6974f88c5a6e")
=======
    @objid ("55ae143d-aadb-4eb8-9f7a-3773419f2772")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getApplicationName() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("754885b8-b741-4c41-8cbf-02f1fbf14e77")
=======
    @objid ("70b442c3-b51f-4f61-9da0-88213048c7e1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getApplicationVersion() {
        return this.elt.getTagValue(CamelModel.MdaTypes.APPLICATIONVERSION_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'dataModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("187a56b3-d0bb-434d-8c9e-be3173306cf9")
=======
    @objid ("65d305d1-a4cb-46db-a55b-b3564dbf811d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("871e856d-a276-4156-809e-120b645ebc64")
=======
    @objid ("6122d389-8d40-4368-9a05-b0ee4b6679d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("caa225e0-5f9e-427d-820d-c56fb3dd6a82")
=======
    @objid ("aea79e45-a598-4fe7-8781-8334a3160609")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CamelModelDiagram> getDiagrams() {
        List<CamelModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (CamelModelDiagram.canInstantiate(mObj))
        			results.add((CamelModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, CamelModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c311ef52-d20c-448b-ae5f-9fd39c72769f")
=======
    @objid ("f20a2977-8392-44c6-b4ee-f5e90ef6ce9d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("beb5a0a7-e11b-4b31-a2d9-f38e1df95e8d")
=======
    @objid ("8b1cf323-2e07-42a1-893c-8c754d9e1798")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d8e0bd31-2c15-4b7d-ba81-dddf881bfe43")
=======
    @objid ("8232293e-e7bb-41b0-af8b-5c557f5dfaa1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f07460d1-8d3e-4634-a1c8-c437c97e6f47")
=======
    @objid ("170e0af0-680a-4abb-b657-6bd5b6921e5d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5aeb065c-85af-44ba-976e-824891dc33b3")
=======
    @objid ("4384528b-00b7-4f46-80ff-da533a78498d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("948b7de0-491e-4c93-815d-c436d25093cb")
=======
    @objid ("34ed6c0f-c8b8-4963-9b40-f47a86ed9832")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ce899bc0-187e-4c6c-9b7a-6fa5e458c322")
=======
    @objid ("a4b1e8bf-cbfe-4077-92e9-9f70f3bd5488")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2a66671d-7ac5-4e2c-8849-aa69f3af7e3a")
=======
    @objid ("d5c3f1c1-7f4e-4cba-8285-f86421e300ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d232b2e6-0073-42c0-97dc-c6309a022fe6")
=======
    @objid ("24f35613-dc86-4090-9bf3-a861ff98e585")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e98730fc-c1ad-4647-9cbb-2384be9f9c58")
=======
    @objid ("50817bd1-643f-4280-8c42-ee23c006eb81")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c36b8d9a-0834-49d9-aca1-3ee2cc581c59")
=======
    @objid ("ea868977-b680-43e9-83df-b75d679cfeba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<UnitModel> getUnitModels() {
        List<UnitModel> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (UnitModel.canInstantiate(mObj))
        			results.add((UnitModel)CamelDesignerProxyFactory.instantiate(mObj, UnitModel.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("e7893181-5fd9-4be6-9877-a6f3a4c1681d")
=======
    @objid ("69b850c8-91a4-477c-bcde-e8a1d90537ad")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("68842b52-10c5-4fce-af6d-3ee681a4fbfa")
=======
    @objid ("4b35d4aa-459a-41ce-8832-45bad030d238")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDataModels(final DataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3df3b53b-9b75-4ee7-a62f-64c331ba3ebf")
=======
    @objid ("abc314ad-2144-45dd-abce-a0cc751fab4d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c8b1f2fd-ccfb-4cba-8c43-902cfa6d0b3e")
=======
    @objid ("57bdf608-27a3-4ce1-8fc8-3eedda081770")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final CamelModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'executionModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b2f7f0fe-9ebd-4ef8-bfa2-5f34b3f36b88")
=======
    @objid ("ce29dd99-c5b4-4864-add8-d24c5621f39b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeExecutionModels(final ExecutionModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'locationModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a624bbdd-818c-4cea-9290-0c49666bdbf4")
=======
    @objid ("16632956-860a-4494-b65b-29b773d015d0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeLocationModels(final LocationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metaDataModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b676626e-d9f3-4373-8aa8-1408d2509d15")
=======
    @objid ("24cd2749-169d-4d48-89cf-0447e5b05ff4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMetaDataModels(final MetaDataModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("62b1ea1b-dc99-4ccf-afb8-b90e47c4ceba")
=======
    @objid ("fdc6e3f7-788a-4fbb-9d82-81787b75f6f9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMetricModels(final MetricModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'organisationModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("30022161-ce22-4c49-9c74-ce746dfa7bd3")
=======
    @objid ("479e91a0-fc12-4ad7-81d5-733d33d58212")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeOrganisationModels(final OrganisationModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c6f5b0e2-eb20-4f74-accf-2701862e7a2a")
=======
    @objid ("a7377e75-71ce-4a80-a5d0-d08ca3ce1d90")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRequirementModels(final RequirementModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("39544001-72b4-4817-a63b-59f03bed7c87")
=======
    @objid ("ccdfb3ed-e1eb-4cac-a464-a329134c6205")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a9c61e29-f4a7-4b3d-8344-027e1da2db01")
=======
    @objid ("af588843-3e3b-449b-8e12-3919d39a66da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityModels(final SecurityModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'typeModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1cf25716-72b1-4576-bf54-44004e313642")
=======
    @objid ("8ebf6a64-7f94-423a-b3f6-3fc8d0401994")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeTypeModels(final TypeModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'unitModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("57bbb9cd-259a-4523-8e22-17af95b523c9")
=======
    @objid ("f45f2e8d-0783-4a2c-ac2a-f5a8c25c0eb4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeUnitModels(final UnitModel obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'applicationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a00adbca-677c-41e9-8f94-0cfd61d5f7d4")
=======
    @objid ("51319b1c-18b4-4307-b430-eee12983f632")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setApplicationName(final String value) {
        this.elt.putTagValue(CamelModel.MdaTypes.APPLICATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'applicationVersion'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("55c3e74d-9cc6-40c9-9149-94272b6a0ebf")
=======
    @objid ("1ab8a187-705c-4fcd-b680-6a6038a09154")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("9402af1b-26dd-4572-870b-f0d514b2f4af")
=======
    @objid ("72b7506a-c96d-4cc0-944f-171dbcee2604")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CamelModel(final Package elt) {
        super(elt);
    }

    @objid ("18704a21-5db9-4f8d-9058-4c21969dcd9d")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("6a3145ad-e8b7-47f6-a01a-368e9ae72d1e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3121ca03-b02e-4fa8-88e8-2d7b10c6053e")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("36e058e0-e5dd-4290-b211-68f6a2f54971")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("0fb3d808-03e1-4dce-81e9-a65e3f6e3720")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b0e7b1e-f0f9-4b82-b92a-6dc269ebf290")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80c3293b-c273-4d29-91fc-51cdb0ed3e52")
=======
        @objid ("436478c0-4a5a-4707-b34a-7b529f5585ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("73538b66-61bb-41a9-8389-98ddaae57733")
        public static TagType APPLICATIONNAME_TAGTYPE_ELT;

        @objid ("59e08c6d-914f-404d-8b11-47deca4dcf87")
        public static TagType APPLICATIONVERSION_TAGTYPE_ELT;

        @objid ("a142939b-8ebe-482d-9f60-3f8ea8e36f75")
        private static Stereotype MDAASSOCDEP;

        @objid ("43e487bb-4644-4a0f-9141-ffe7021fd4b5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5144e3f-f7d3-4f4d-af8e-fa918ccdeddb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
