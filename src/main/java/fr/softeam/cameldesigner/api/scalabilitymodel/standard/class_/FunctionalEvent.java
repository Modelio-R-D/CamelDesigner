/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("200dbc9d-ce07-42f2-9d1c-232b44b4bb3b")
    public static final String STEREOTYPE_NAME = "FunctionalEvent";

    /**
     * Tells whether a {@link FunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << FunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("52284dbb-6c91-4520-9160-0e5f9c522d8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << FunctionalEvent >> then instantiate a {@link FunctionalEvent} proxy.
     * 
     * @return a {@link FunctionalEvent} proxy on the created {@link Class}.
     */
    @objid ("4a7f4e25-b958-4f57-894f-c85e7c5d9232")
    public static FunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FunctionalEvent.STEREOTYPE_NAME);
        return FunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link FunctionalEvent} proxy or <i>null</i>.
     */
    @objid ("a65f6373-1d62-42fb-9129-94f6b580a049")
    public static FunctionalEvent instantiate(final Class obj) {
        return FunctionalEvent.canInstantiate(obj) ? new FunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FunctionalEvent} proxy from a {@link Class} stereotyped << FunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link FunctionalEvent} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f93f3c0a-199c-44d9-88ed-71052f9a072c")
    public static FunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FunctionalEvent.canInstantiate(obj))
            return new FunctionalEvent(obj);
        else
            throw new IllegalArgumentException("FunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("60348e17-0b23-40b1-98f2-bedb4142ee1a")
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
     */
    @objid ("2364d40a-b60a-4297-80bc-2d76a8dbfb02")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("670e720f-1011-4b22-ba44-5c696de92901")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'functionalType' role.<p>
     * Role description:
     * <Enter note text here>
     */
    @objid ("f9a54f30-9fe1-409d-a041-f3ab9e61c0d5")
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

    @objid ("c78ec31f-f991-4c15-8670-38b1a1a5b21b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * <Enter note text here>
     */
    @objid ("76ee9985-a69e-4e19-bacc-869bd9780437")
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
     */
    @objid ("77357a60-0dd6-4413-b7ab-1106474519d5")
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

    @objid ("be847b23-9e90-4b75-b1c4-a3e5e0ab9825")
    protected FunctionalEvent(final Class elt) {
        super(elt);
    }

    @objid ("1a266afd-186e-43cc-a4d6-d8eda707e81a")
    public static final class MdaTypes {
        @objid ("941fca51-1200-4b83-abb6-7ca5b65cd7cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a158ec49-aa50-4ac0-b212-652d14589352")
        private static Stereotype MDAASSOCDEP;

        @objid ("918751ea-67bb-4eca-92de-7c7f8619b7d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d148d96-4e25-4d53-893b-6bc92bacdcf1")
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
