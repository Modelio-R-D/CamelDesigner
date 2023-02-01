/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << HistoryRecord >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b33e67d3-9fd0-4004-abdd-b08e7227aa1d")
public class HistoryRecord extends FeatureClass {
<<<<<<< HEAD
    @objid ("aed7ad94-a393-494c-820d-822533f31d77")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("49b95621-ccd9-48cb-ad4e-2b7cdfed8c17")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("26fb254d-94ce-48fc-bf31-5344bb665105")
=======
    @objid ("7459ce81-0acd-40c7-a962-4ba33cb8c52c")
    public static final String STEREOTYPE_NAME = "HistoryRecord";

    @objid ("ab2e6f67-c2d2-451f-9202-f5b3935fd647")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("3433a30a-5272-46fb-8c7f-2d5aad714792")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryRecord proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryRecord >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("bf9cd618-1ba4-4910-8632-213d4f87ef5f")
=======
    @objid ("55d67ebc-bdaa-4d14-a7c5-7c3c92fda553")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryRecord >> then instantiate a {@link HistoryRecord} proxy.
     * 
     * @return a {@link HistoryRecord} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("cb7d15cf-3d7f-4815-bdf1-e59ceef851a0")
=======
    @objid ("1bdb4423-1e90-4f97-886f-2948f81a5194")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HistoryRecord create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryRecord.STEREOTYPE_NAME);
        return HistoryRecord.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HistoryRecord} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("4312dd6f-cf41-4d62-a7ad-b871198658e5")
=======
    @objid ("2e99c6b4-1915-442b-9b89-e566e758fe53")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HistoryRecord instantiate(final Class obj) {
        return HistoryRecord.canInstantiate(obj) ? new HistoryRecord(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryRecord} proxy from a {@link Class} stereotyped << HistoryRecord >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HistoryRecord} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("61c63670-4cde-4005-97be-232f552054c9")
=======
    @objid ("d39f7ed1-b8d1-4541-b3cd-f1e8f779da8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static HistoryRecord safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryRecord.canInstantiate(obj))
        	return new HistoryRecord(obj);
        else
        	throw new IllegalArgumentException("HistoryRecord: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("dbcfc6cd-5071-4680-983d-3c4c675fff46")
=======
    @objid ("540ff69d-2013-4886-bc87-5db9f4f5b064")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addInfos(final HistoryInfo obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("c890c54f-95f3-42eb-91ba-fa3ff80b8f6c")
=======
    @objid ("bad726dd-8736-4aff-bc0e-52b7cf9bd796")
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
        HistoryRecord other = (HistoryRecord) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'cause' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c39a0ef8-42f7-412a-94c6-4d36eb6fcaf0")
=======
    @objid ("bdd2c42d-deea-45bd-abd1-4ebaab7b1e95")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Cause getCause() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "cause")){
                  if (RuleTrigger.canInstantiate(d.getDependsOn()))
                     return (RuleTrigger)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RuleTrigger.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SLOViolation.canInstantiate(d.getDependsOn()))
                     return (SLOViolation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SLOViolation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Cause.canInstantiate(d.getDependsOn()))
                     return (Cause)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Cause.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("7e17dd03-a29b-478b-b2e6-5e220a1150f5")
=======
    @objid ("49b6da59-e4d3-457b-b445-8ecb69edc4aa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6de445d4-c194-4cf0-be42-c767d20c71b1")
=======
    @objid ("2920d7a1-9ec0-40bd-b09a-3ee291465817")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEndTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9e2013d2-9391-4d59-a07c-f80e1bb5e958")
=======
    @objid ("dbae032d-7800-42aa-b2b1-71ed51f0896b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataInstanceModel getFromDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDataInstanceModel")){
                  if (DataInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'fromDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b5e67962-bf7a-4f3a-b3ea-618f6091b29f")
=======
    @objid ("bc89c8f8-1500-4470-bb2e-7cf7bedd6db5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentInstanceModel getFromDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDeploymentInstanceModel")){
                  if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d077b576-a54e-49dd-97d3-99357850fc2f")
=======
    @objid ("49a5f690-842e-49a2-9c5a-50cad901c367")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<HistoryInfo> getInfos() {
        List<HistoryInfo> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (HistoryInfo.canInstantiate(mObj))
        			results.add((HistoryInfo)CamelDesignerProxyFactory.instantiate(mObj, HistoryInfo.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("37d8efc4-ef3f-4445-bdb6-1771d380659b")
=======
    @objid ("a1306e51-ae3a-4965-993a-dac12f5b8a97")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getStartTime() {
        return this.elt.getTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ad782814-c133-42e4-88d4-c2ccafcbf947")
=======
    @objid ("53c8d451-7936-409d-b65b-ba08bfda5d77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DataInstanceModel getToDataInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDataInstanceModel")){
                  if (DataInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'toDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fa4aef31-4eb2-413f-8906-3ad890f0e879")
=======
    @objid ("eb1a8794-683e-430c-ad8e-9ea19700f724")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public DeploymentInstanceModel getToDeploymentInstanceModel() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDeploymentInstanceModel")){
                  if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b1451668-5f44-4c51-a4c7-1ec3686ad3ca")
=======
    @objid ("b25a38c0-2d05-4f79-bb98-929394ffebf7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MmsObject getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                     return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsProperty.canInstantiate(d.getDependsOn()))
                     return (MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                     return (MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("89f71b82-dc07-4af4-809e-514f6b8fb698")
=======
    @objid ("776a9ee8-3c32-4291-ab10-812a1b708412")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'infos' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f469cac5-da1d-4c8c-8525-f0c3c8dc569e")
=======
    @objid ("9d14883d-61e2-4144-b964-bf83f0b75f67")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeInfos(final HistoryInfo obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'cause' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8c7529d6-9ea2-4545-b659-452701c01a6a")
=======
    @objid ("a9420b1a-29e0-415d-aa10-5d2ceef2517a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCause(final Cause obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "cause")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("cause");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "cause");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b3d18c87-d63c-45eb-a7a4-98e9a2e0ae56")
=======
    @objid ("33d9f7e2-1334-4110-b453-a71e8ece0089")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'fromDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5afdcbbe-1e13-4998-8e8b-edfbbda18aa8")
=======
    @objid ("736470ae-9bdb-46df-a602-acee07fe1c9b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setFromDataInstanceModel(final DataInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDataInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("fromDataInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "fromDataInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'fromDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("146ba2ba-8fcf-4e8b-98f4-491f6646b3b6")
=======
    @objid ("d6d0d6b9-9f66-450e-bb21-ae883b371d13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setFromDeploymentInstanceModel(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "fromDeploymentInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("fromDeploymentInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "fromDeploymentInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c8ca24f9-98f3-425e-b0e6-9fa9b579c8d2")
=======
    @objid ("6208d009-22d8-46ca-b77f-00a49ed385c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryRecord.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'toDataInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("cce24026-1f3c-4ba8-be61-b91389b29122")
=======
    @objid ("7d6bb334-fa5c-4b16-a5ff-b4c4ddd0372a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setToDataInstanceModel(final DataInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDataInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("toDataInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "toDataInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'toDeploymentInstanceModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b8a54fe6-b60c-461e-9769-131da7d82d4a")
=======
    @objid ("85a5d434-0e57-4ef2-98e7-3ca3e3103f14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setToDeploymentInstanceModel(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "toDeploymentInstanceModel")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("toDeploymentInstanceModel");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "toDeploymentInstanceModel");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8cbf080e-abfb-4b90-9514-9a72a0702b12")
=======
    @objid ("1e21120d-1ef9-4c09-b582-fe698bda0a60")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryRecord.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryRecord.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(HistoryRecord.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("e24b3488-ded8-4979-93ff-a32b3197e75e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("d4e4d041-b0b7-4220-8e7b-352e18241bb1")
=======
    @objid ("c0f6de52-bc1e-4b41-8197-5acaac0e678c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected HistoryRecord(final Class elt) {
        super(elt);
    }

    @objid ("462585e9-30df-4f59-b5c8-ec375790a32b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("aa9a8205-2fdc-4fe9-a34f-622f178bf212")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b1edd67-4ea1-48ef-95c2-8e46fbf6d2eb")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("b579da28-8058-457e-bbb2-01b94560ee53")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("b3271700-0b70-4fc1-8e80-37d1074e7d91")
        private static Stereotype MDAASSOCDEP;

        @objid ("7458f383-c3cc-46ec-a23d-068a5417f90e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("484dc56e-f06c-46ba-b854-2f37a36365a8")
=======
        @objid ("e018c0f6-0704-42da-a044-2ba2c3a4bebc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45d58f32-778a-4754-b432-19701a45c7a1")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("ed8833a0-3f4b-43d6-b6b3-5813764a454b")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("d71d8bc8-3d84-4100-bcf3-d00509dbb13f")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa65aa35-2af9-4f16-80ea-6405c6abae82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a3ff6e4-dece-4e39-a68b-fbed55578a5b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe3e6072-933d-456c-bd5a-77cd25aeb183");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d4316e17-4ce7-49fa-8ef0-c2743e111a0b");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bb514f2c-6871-49ad-a376-0f3411c9acca");
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
