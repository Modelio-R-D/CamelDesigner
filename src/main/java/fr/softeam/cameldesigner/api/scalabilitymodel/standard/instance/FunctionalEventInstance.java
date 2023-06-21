/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << FunctionalEventInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a687c29e-c0ac-4bea-a2ad-2522f0f19aa9")
public class FunctionalEventInstance extends EventInstance {
    @objid ("7c19228a-b781-46c8-b20c-aa4697769760")
    public static final String STEREOTYPE_NAME = "FunctionalEventInstance";

    /**
     * Tells whether a {@link FunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << FunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8e2a01de-c869-4085-8fc2-50b9acc5d7ed")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << FunctionalEventInstance >> then instantiate a {@link FunctionalEventInstance} proxy.
     * 
     * @return a {@link FunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("64f85f6f-7688-40a1-9a33-b00f69f1aad1")
    public static FunctionalEventInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME);
        return FunctionalEventInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Instance} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link FunctionalEventInstance} proxy or <i>null</i>.
     */
    @objid ("7b8b6ea1-7452-4c18-b51e-3e877fd0d6b7")
    public static FunctionalEventInstance instantiate(final Instance obj) {
        return FunctionalEventInstance.canInstantiate(obj) ? new FunctionalEventInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEventInstance} proxy from a {@link Instance} stereotyped << FunctionalEventInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link FunctionalEventInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("917ccb3c-880f-4d44-abb7-65180e13c5d9")
    public static FunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FunctionalEventInstance.canInstantiate(obj))
        	return new FunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("FunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ec0b3c1d-7b4b-453f-ae12-eec37924e308")
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
        FunctionalEventInstance other = (FunctionalEventInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8c4bd53f-9823-41ac-8652-5b0511786541")
    public ComponentInstance getComponentInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEventInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")){
                  if (ContainerInstance.canInstantiate(d.getDependsOn()))
                     return (ContainerInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSInstance.canInstantiate(d.getDependsOn()))
                     return (PaaSInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e4d3c7db-109e-473d-9601-1963ad74b1fd")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("3378afec-eb11-4ab7-b99b-2af63dea8342")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'componentInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c7cc036a-8852-424a-9a88-c64999afabae")
    public void setComponentInstance(final ComponentInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEventInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE), "componentInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEventInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("componentInstance");      dep.putTagValue(FunctionalEventInstance.MdaTypes.MDAASSOCDEP_ROLE, "componentInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("d51dfa01-12f7-455e-969b-cedc7840d0cb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("093d0a79-7d7c-44bf-b360-c3d0ff85fd64")
    protected FunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ed13a09f-140c-4c2f-ac85-a6622bc8ebf8")
    public static final class MdaTypes {
        @objid ("0d1b71c5-2cee-4416-8f47-d304eceff68f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("834e2aeb-7c3b-445f-a582-2e6dce78401e")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1fa71ca-172d-4408-a63c-8e2538661f1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78679a35-336a-44c6-ba1a-b8081546e455")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b88afca5-ed15-48f1-a81b-29da4a453701");
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
