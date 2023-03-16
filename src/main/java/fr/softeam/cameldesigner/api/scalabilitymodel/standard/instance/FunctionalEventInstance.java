/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("21a5effd-330a-432d-bb2c-b59b0f620fa2")
    public static final String STEREOTYPE_NAME = "FunctionalEventInstance";

    /**
     * Tells whether a {@link FunctionalEventInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << FunctionalEventInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3eacb107-d065-4e2c-8d5d-e81d2c3fcfdb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEventInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << FunctionalEventInstance >> then instantiate a {@link FunctionalEventInstance} proxy.
     * 
     * @return a {@link FunctionalEventInstance} proxy on the created {@link Instance}.
     */
    @objid ("f018b75d-054d-4200-af89-5a766b3b3d0b")
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
    @objid ("01c2e91c-101d-4057-b10e-5bee17595d6c")
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
    @objid ("105d0d7c-2fdf-495f-a4e2-c4b6dfb4b27e")
    public static FunctionalEventInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (FunctionalEventInstance.canInstantiate(obj))
        	return new FunctionalEventInstance(obj);
        else
        	throw new IllegalArgumentException("FunctionalEventInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c698fff6-9eb4-4053-8446-8a931d8338f5")
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
    @objid ("157427b4-b063-4f96-9c83-c840490f6857")
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
    @objid ("7db7ecd2-0916-4702-9800-9c475f9f68c0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("82e61ebd-9d5e-459b-a6cf-8ea5c311bc86")
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
    @objid ("bdea5048-3ee8-45b3-bc9e-a7e021f29f6c")
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

    @objid ("bd988ac0-e4a4-4553-b725-610e978be311")
    protected FunctionalEventInstance(final Instance elt) {
        super(elt);
    }

    @objid ("ed13a09f-140c-4c2f-ac85-a6622bc8ebf8")
    public static final class MdaTypes {
        @objid ("ae2b9339-383b-4b60-910c-4364286f5299")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9edf45b7-ca6f-4524-aebc-a523198d96d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("91bd5d07-2a83-454f-8e5e-ee15cb8ac3f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4971223-1386-466c-ad0b-7ad3637dd5f8")
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
