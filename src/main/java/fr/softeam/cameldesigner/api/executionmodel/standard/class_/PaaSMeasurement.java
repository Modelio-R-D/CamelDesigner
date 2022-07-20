/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("f91503b5-f365-443e-9cf1-3c558e19269e")
    public static final String STEREOTYPE_NAME = "PaaSMeasurement";

    /**
     * Tells whether a {@link PaaSMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f01c09c7-61b4-47c4-8a1b-7dfbc8a41374")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSMeasurement >> then instantiate a {@link PaaSMeasurement} proxy.
     * 
     * @return a {@link PaaSMeasurement} proxy on the created {@link Class}.
     */
    @objid ("73dd5a22-d419-471b-ae69-404a46ca40e6")
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
    @objid ("3f6db88c-81ce-456e-8f91-2c96ec37f335")
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
    @objid ("4fed08de-5177-4edb-a99a-5b59f6a9dc53")
    public static PaaSMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSMeasurement.canInstantiate(obj))
        	return new PaaSMeasurement(obj);
        else
        	throw new IllegalArgumentException("PaaSMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ab284ac-22b4-4472-b7c7-3623575d889e")
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
    @objid ("a3ec5601-723a-4155-a435-244f8853aa76")
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
    @objid ("de16d805-83a5-4b15-98fb-abc95d86fb34")
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
    @objid ("4cd9234a-ede6-489e-8e33-c44182f75e08")
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

    @objid ("1dbd1b4d-fa6c-4cda-bfb9-364b7bd9e24d")
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
    @objid ("0ff4bc1f-3734-4928-aa62-d62c095516a6")
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
    @objid ("4e8948da-4ea1-4c90-876d-e89f39f24db6")
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

    @objid ("36d73e6f-c02c-433b-b436-452db15f2a90")
    protected PaaSMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2d45a35d-f931-4999-aeb9-e4d0259e5f71")
    public static final class MdaTypes {
        @objid ("277fdd4b-aab4-46b1-acdf-0664a14b977b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("957d13bf-8880-4e97-a7d8-f70840247304")
        private static Stereotype MDAASSOCDEP;

        @objid ("932f9d03-72ae-45f2-a48a-eb5869d101e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94c2eb03-b48d-4cc2-955c-0cfbcae54624")
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
