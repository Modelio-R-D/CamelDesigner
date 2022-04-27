/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("173fcaf8-6288-4090-9a5e-d4c655f73767")
    public static final String STEREOTYPE_NAME = "PaaSMeasurement";

    /**
     * Tells whether a {@link PaaSMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("70bac35c-159e-4132-9200-ca91c2ccd2f9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSMeasurement >> then instantiate a {@link PaaSMeasurement} proxy.
     * 
     * @return a {@link PaaSMeasurement} proxy on the created {@link Class}.
     */
    @objid ("8b48ee8e-ec99-46af-bc43-0d5d931c13d8")
    public static PaaSMeasurement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME);
        return PaaSMeasurement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PaaSMeasurement} proxy from a {@link Class} stereotyped << PaaSMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PaaSMeasurement} proxy or <i>null</i>.
     */
    @objid ("fce12f9b-0647-4280-8a5e-90781875b927")
    public static PaaSMeasurement instantiate(final Class obj) {
        return PaaSMeasurement.canInstantiate(obj) ? new PaaSMeasurement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaSMeasurement} proxy from a {@link Class} stereotyped << PaaSMeasurement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PaaSMeasurement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f7d068bb-a068-4ed3-a3f0-dfca99ad2b68")
    public static PaaSMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSMeasurement.canInstantiate(obj))
        	return new PaaSMeasurement(obj);
        else
        	throw new IllegalArgumentException("PaaSMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c7629ea-6e5d-4685-85fa-7363badf3442")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("aa23457e-e611-4009-b03a-8cff33116e6a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'paaS' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2885d4be-65ed-4209-ad31-bfda0aec5f09")
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
     * 
     */
    @objid ("691fea1f-ac22-4352-8c3c-b20add98730b")
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

    @objid ("7dd83061-474f-4e46-977f-9fab751a4051")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'paaS' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58455251-4168-4a6c-9453-96722340d943")
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
     * 
     */
    @objid ("8efd5383-7008-4d9d-9130-2a5acbcb856f")
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

    @objid ("8b569244-592d-43db-ad7d-77e8be626704")
    protected PaaSMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2d45a35d-f931-4999-aeb9-e4d0259e5f71")
    public static final class MdaTypes {
        @objid ("2cff79c0-a34b-4003-b57c-2e9a20d1adef")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42622049-547c-4bda-9dfb-19374d003275")
        private static Stereotype MDAASSOCDEP;

        @objid ("cf54b57e-bbc3-4b2f-80ef-590dbe5e8224")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4555e04f-5098-45ac-aa08-ac872cb15a03")
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
