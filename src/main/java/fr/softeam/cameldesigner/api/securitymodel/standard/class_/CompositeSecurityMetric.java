/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
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
 * Proxy class to handle a {@link Class} with << CompositeSecurityMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1f0a6163-1b92-4d1e-9b82-465f58ed0d66")
public class CompositeSecurityMetric extends CompositeMetric {
    @objid ("47471dfc-959e-4ae3-8ebd-145738ddf59d")
    public static final String STEREOTYPE_NAME = "CompositeSecurityMetric";

    /**
     * Tells whether a {@link CompositeSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b56e601-b9ad-4aab-bef8-f0435283bccc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeSecurityMetric >> then instantiate a {@link CompositeSecurityMetric} proxy.
     * 
     * @return a {@link CompositeSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("9d3b91f8-0afa-4552-bff7-f720a63c925d")
    public static CompositeSecurityMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME);
        return CompositeSecurityMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CompositeSecurityMetric} proxy or <i>null</i>.
     */
    @objid ("de8ae05e-a2cf-4427-b93f-e342ebc85771")
    public static CompositeSecurityMetric instantiate(final Class obj) {
        return CompositeSecurityMetric.canInstantiate(obj) ? new CompositeSecurityMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CompositeSecurityMetric} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("08f4913c-5bff-4914-9a25-59d68931bbcf")
    public static CompositeSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeSecurityMetric.canInstantiate(obj))
            return new CompositeSecurityMetric(obj);
        else
            throw new IllegalArgumentException("CompositeSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6d8847f-22b5-4fa9-9b42-f8c8acba2bea")
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
        CompositeSecurityMetric other = (CompositeSecurityMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("7b4dc7f5-98d1-43c4-b6b6-6852d1080b90")
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("62bd6e15-b1b6-48b5-b839-c90e3319bf2e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("f6e29a3f-de8e-4af9-b1fd-1a755ab39cf3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("050ad37e-a69d-4322-ab10-89ad74ba8259")
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), CompositeSecurityMetric.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(CompositeSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("28a4a4be-416e-4e9e-bf1b-fe85bbdf6b0d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4c27c218-a6be-4d07-8181-345a3810326b")
    protected CompositeSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("fe4cd5da-e95c-488c-a4aa-bd4e00428eda")
    public static final class MdaTypes {
        @objid ("82037079-d667-40f1-8dac-ca111da0b169")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec178479-880f-465b-8336-b6da7c8e237d")
        private static Stereotype MDAASSOCDEP;

        @objid ("965fb1e8-ebb1-4aa8-9b2d-38882bdb4fe0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2360d7ee-dd33-4789-bcc2-db1fb1686304")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "49dfe43f-0fa8-476b-a6ba-03b62463e361");
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
