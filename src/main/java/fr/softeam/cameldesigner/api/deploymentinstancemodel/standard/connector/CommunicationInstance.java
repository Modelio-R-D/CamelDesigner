/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("972a111e-77e0-4614-85df-5499dc705706")
    public static final String STEREOTYPE_NAME = "CommunicationInstance";

    /**
     * Tells whether a {@link CommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << CommunicationInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e81aade8-7842-457b-9d7d-7f6d4d255bc3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << CommunicationInstance >> then instantiate a {@link CommunicationInstance} proxy.
     * 
     * @return a {@link CommunicationInstance} proxy on the created {@link Connector}.
     */
    @objid ("c401c1e4-589e-4ba6-aa35-78142a7d8e7c")
    public static CommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME);
        return CommunicationInstance.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link CommunicationInstance} proxy or <i>null</i>.
     */
    @objid ("96c9eee0-06e5-480f-8aae-d8c787d6642a")
    public static CommunicationInstance instantiate(final Connector obj) {
        return CommunicationInstance.canInstantiate(obj) ? new CommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationInstance} proxy from a {@link Connector} stereotyped << CommunicationInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link CommunicationInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("75d74cc4-4708-4c6c-b9c3-94d160e60c09")
    public static CommunicationInstance safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (CommunicationInstance.canInstantiate(obj))
        	return new CommunicationInstance(obj);
        else
        	throw new IllegalArgumentException("CommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5b524786-c917-4a49-b3f9-6aefd5f7c170")
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
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("4145a1b8-2525-48a1-a4b0-a59838152c40")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0f2676c1-b47d-4ee2-b1ab-e9871aa92802")
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
     * 
     */
    @objid ("befd3ce8-dbf6-461f-9bfd-db507ee0a6c3")
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

    @objid ("724ad9fa-4cfa-485c-a66e-7624a50b4674")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("71ea55da-b39d-41d3-950f-f327e6cffb0c")
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
     * 
     */
    @objid ("b56e8cf4-dfae-4923-ba8b-f543f0c013f0")
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

    @objid ("0580772c-019c-4427-b3d2-c16b15fc1e92")
    protected CommunicationInstance(final Connector elt) {
        super(elt);
    }

    @objid ("cf21fdd9-ead8-4cfe-914e-4a923f9c983f")
    public static final class MdaTypes {
        @objid ("6464ed92-f37b-4420-9690-d40104c46d00")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7644f082-d0c1-459d-9017-cf7304c74145")
        private static Stereotype MDAASSOCDEP;

        @objid ("69f6f484-884a-4f30-b889-028f6df7a1ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6117eb5-f411-4da8-95c0-f91b7a1fcc88")
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
