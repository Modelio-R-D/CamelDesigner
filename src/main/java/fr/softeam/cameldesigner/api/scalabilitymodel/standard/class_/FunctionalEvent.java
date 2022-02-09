/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
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
 * Proxy class to handle a {@link Class} with << FunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6506e3fc-10e0-4ba7-b4b6-3bccd0b9a073")
public class FunctionalEvent extends SingleEvent {
    @objid ("b4f82597-9d4c-4c30-8947-bd9554f7a6fd")
    public static final String STEREOTYPE_NAME = "FunctionalEvent";

    /**
     * Tells whether a {@link FunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("064e956a-a348-4a69-880f-cb7ae08798bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEvent >> then instantiate a {@link FunctionalEvent} proxy.
     * 
     * @return a {@link FunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("ee0bdf83-5d74-486f-a525-8a170536d897")
    public static FunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME);
        return FunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("85c0e0c3-d5bc-4ea4-8621-8e2cf77eb987")
    public static FunctionalEvent instantiate(final Class obj) {
        return FunctionalEvent.canInstantiate(obj) ? new FunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FunctionalEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a571faf2-d37b-4084-a8e9-a407648e9546")
    public static FunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEvent.canInstantiate(obj))
        	return new FunctionalEvent(obj);
        else
        	throw new IllegalArgumentException("FunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f97dc51d-9c07-4edb-9310-29052d58a748")
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
        FunctionalEvent other = (FunctionalEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("b36e7109-85dc-4855-9550-cfc86a8a5e1e")
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "component")
                  && CamelComponent.canInstantiate(d.getDependsOn())) {
                     return (CamelComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6beaca73-5afd-4790-8361-5c734ad1ac3b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'functionalType' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("f7343ba3-db0b-4e2a-97df-b803c7e03931")
    public CamelAttribute getFunctionalType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "functionalType")
                  && CamelAttribute.canInstantiate(d.getDependsOn())) {
                     return (CamelAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelAttribute.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("5641378e-9e29-4ae1-aee8-c92544f94f98")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("c19c46ed-1dda-4d7f-846e-bf0723521c35")
    public void setComponent(final CamelComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEvent.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'functionalType' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("f8d5d193-952d-471a-b009-a23e8c1ae869")
    public void setFunctionalType(final CamelAttribute obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(FunctionalEvent.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE), "functionalType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), FunctionalEvent.MdaTypes.MDAASSOCDEP);
              dep.setName("functionalType");      dep.putTagValue(FunctionalEvent.MdaTypes.MDAASSOCDEP_ROLE, "functionalType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ed6779a4-e956-4dde-8001-3321bd1f3cf3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("01142ba4-2f7e-4ef5-866a-2ea57a701100")
    protected FunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("1a266afd-186e-43cc-a4d6-d8eda707e81a")
    public static final class MdaTypes {
        @objid ("a446dd58-a7e5-4d9b-a5b8-3b8c7866a1ea")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0285112-2d70-4b06-9242-efc0f3289566")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f0110cb-38aa-43f5-8923-3269c70c9e88")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7261fa56-8a85-4214-8f48-23d58e2fc100")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d4865c6-d973-416b-ba6e-62311853e410");
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
