/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << CommunicationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("355d42b2-d4dd-49ae-bfd1-58fbf281ecd1")
public class CommunicationInstance extends ComponentRelationInstance {
    @objid ("e0c44473-e750-4ca2-a9f1-bd42a6561b94")
    public static final String STEREOTYPE_NAME = "CommunicationInstance";

    /**
     * Tells whether a {@link CommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << CommunicationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74b1c645-aded-4838-ac89-30b236ecc97a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << CommunicationInstance >> then instantiate a {@link CommunicationInstance} proxy.
     * 
     * @return a {@link CommunicationInstance} proxy on the created {@link Connector}.
     */
    @objid ("d30b6dca-0aae-4cdb-ac61-bc222e404e10")
    public static CommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME);
        return CommunicationInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Connector
     * @return a {@link CommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("06822dc7-4966-4065-810c-fbd75a84f81d")
    public static CommunicationInstance instantiate(final Connector obj) {
        return CommunicationInstance.canInstantiate(obj) ? new CommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Connector}
     * @return a {@link CommunicationInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("670af9e5-9354-471a-97ff-4f91c2a9817c")
    public static CommunicationInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (CommunicationInstance.canInstantiate(obj))
            return new CommunicationInstance(obj);
        else
            throw new IllegalArgumentException("CommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3424a97d-246c-403e-9a18-e1fbd0167f34")
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
        CommunicationInstance other = (CommunicationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}.
     * 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("74d3c1c4-3571-4b04-85ff-f7afe123857e")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("cf487452-ae04-4f95-9aeb-c56a66be56c7")
    public DeploymentInstanceModel getParent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "parent")){
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
     */
    @objid ("aaeeecb9-d204-4028-a1be-d5bb76ba5feb")
    public Communication getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")){
                  if (Communication.canInstantiate(d.getDependsOn()))
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("4d0b5345-79b5-4db8-be84-fb348fb15fcf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("08e04a5f-fae1-4d3a-a5bb-f1dd65607d81")
    public void setParent(final DeploymentInstanceModel obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "parent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("parent");      dep.putTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE, "parent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("85aa02e7-d71c-424b-942f-477b971674d0")
    public void setType(final Communication obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CommunicationInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CommunicationInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(CommunicationInstance.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("a4d7cd20-9db0-420f-a3ff-34af08fba01b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("a8bd66f1-9200-43e7-8f57-5afef03987d6")
    protected CommunicationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("cf21fdd9-ead8-4cfe-914e-4a923f9c983f")
    public static final class MdaTypes {
        @objid ("0d721d77-ca44-4754-bc00-e97e76bc6419")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a859ce6d-0474-492f-8c0f-82d5d68b2d37")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8dfa863-0d5c-4935-b842-c43533fa28b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4d2a19e-b143-4eb9-a698-93b199829906")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "479fff80-8075-4f90-b7f8-e148699ee433");
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
