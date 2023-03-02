/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
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
    @objid ("c7d8ef74-b9ad-4fea-8f29-0763cfe876d3")
    public static final String STEREOTYPE_NAME = "PaaSMeasurement";

    /**
     * Tells whether a {@link PaaSMeasurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PaaSMeasurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("37ae0cf5-40c9-4766-82f6-e9ef7d019f66")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaSMeasurement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << PaaSMeasurement >> then instantiate a {@link PaaSMeasurement} proxy.
     * 
     * @return a {@link PaaSMeasurement} proxy on the created {@link Class}.
     */
    @objid ("b0d17a4b-05c1-4f7c-b5fc-8a4964fd0cba")
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
    @objid ("432a79e8-718c-4c05-91bc-a8665aeff9e5")
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
    @objid ("9917168a-a144-4031-96cb-e0c960ccb8cc")
    public static PaaSMeasurement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PaaSMeasurement.canInstantiate(obj))
        	return new PaaSMeasurement(obj);
        else
        	throw new IllegalArgumentException("PaaSMeasurement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("29fa6f03-eb62-4f3c-bfd7-df3d9d82ec27")
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
    @objid ("145a3116-5624-4eea-8ecc-36b0837fccd9")
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
    @objid ("f5b02891-38c7-4763-bfd0-6a70e2a72e73")
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
    @objid ("f6248876-a4d2-466a-a567-d5a87537d0cb")
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

    @objid ("59cd7f11-81ac-4833-844f-4016ab844bc1")
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
    @objid ("f7650a97-fad6-46b6-9941-37a8c137558f")
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
    @objid ("e38a77fe-099a-4990-98eb-79dcc6da3274")
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

    @objid ("20e8917f-7f8e-4d44-bc97-c8ad6a660657")
    protected PaaSMeasurement(final Class elt) {
        super(elt);
    }

    @objid ("2d45a35d-f931-4999-aeb9-e4d0259e5f71")
    public static final class MdaTypes {
        @objid ("d375e8a9-13a6-4e08-b09d-d9ee4686e3e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c4d14e3-8677-47f6-abfb-f91d760c3da1")
        private static Stereotype MDAASSOCDEP;

        @objid ("1e090bd1-1ea2-4ccf-bd44-bea60b65170e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("227ceccb-3dbd-4518-ac57-2d75f2342810")
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
