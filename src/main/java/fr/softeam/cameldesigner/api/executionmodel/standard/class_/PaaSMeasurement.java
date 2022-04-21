/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << PaaSMeasurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05eacc67-2cab-4ffa-8176-cecce0a96a57")
public class PaaSMeasurement extends Measurement {
    @objid ("0bb59a5f-057f-4399-9726-0ea153c2862e")
    public static final String STEREOTYPE_NAME = "PaaSMeasurement";

    /**
     * Tells whether a {@link PaaSMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ec9a06bf-c763-47e6-8248-15898bb972fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSMeasurement >> then instantiate a {@link PaaSMeasurement} proxy.
     * 
     * @return a {@link PaaSMeasurement} proxy on the created {@link Class}.
     */
    @objid ("dbdd4cb7-ee4a-4a94-942c-5099add9df44")
    public static PaaSMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME);
        return PaaSMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSMeasurement} proxy from a {@link Class} stereotyped << PaaSMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link PaaSMeasurement} proxy or <i>null</i>.
     */
    @objid ("bc4dd027-10f1-4634-afa2-db919957551f")
    public static PaaSMeasurement instantiate(final Class obj) {
        return PaaSMeasurement.canInstantiate(obj) ? new PaaSMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSMeasurement} proxy from a {@link Class} stereotyped << PaaSMeasurement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link PaaSMeasurement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fab61c90-f032-42c7-bc65-6dd92bd0b923")
    public static PaaSMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSMeasurement.canInstantiate(obj))
            return new PaaSMeasurement(obj);
        else
            throw new IllegalArgumentException("PaaSMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("63abe5e4-b072-47ea-b2a3-8fb089607808")
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
        PaaSMeasurement other = (PaaSMeasurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("65c1ed28-1223-4db8-9408-8f033f7d1e7a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'paaS' role.<p>
     * Role description:
     * null
     */
    @objid ("537c2917-f716-4533-bcc9-ab179c152d86")
    public PaaS getPaaS() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(PaaSMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "paaS")){
                  if (PaaS.canInstantiate(d.getDependsOn()))
                     return (PaaS)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaS.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'paaSInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("c1db7a4d-409a-492e-99c5-607e108f9462")
    public PaaSInstance getPaaSInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(PaaSMeasurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "paaSInstance")){
                  if (PaaSInstance.canInstantiate(d.getDependsOn()))
                     return (PaaSInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("0de6b00d-ffdc-4e18-afbf-7f1f44a624de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'paaS' role.<p>
     * Role description:
     * null
     */
    @objid ("bdd8ec61-ec88-4e1e-b25c-a8e323f06bea")
    public void setPaaS(final PaaS obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(PaaSMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "paaS")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), PaaSMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("paaS");      dep.putTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "paaS");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'paaSInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("5ee94551-6ae4-4d25-810f-a125cce655ec")
    public void setPaaSInstance(final PaaSInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(PaaSMeasurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE), "paaSInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), PaaSMeasurement.MdaTypes.MDAASSOCDEP);
              dep.setName("paaSInstance");      dep.putTagValue(PaaSMeasurement.MdaTypes.MDAASSOCDEP_ROLE, "paaSInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("38a81a63-360f-4995-9ca5-d2d9c8c121b5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("48c6e56c-39b5-4311-ae57-12b12076ef55")
    protected PaaSMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2d45a35d-f931-4999-aeb9-e4d0259e5f71")
    public static final class MdaTypes {
        @objid ("4bb4347f-76a2-40a3-a10b-df4cc4eaa678")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bafa80be-05df-4893-a276-5153ee5ff4c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a4e50fc-9f49-44ba-8c3c-30bf8a47fc87")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9aeac556-acaf-4ea4-bab6-21f4769144f7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "726f03cf-0c34-448c-a300-42d54277a37d");
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
