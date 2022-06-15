/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("ca6ababd-b763-45ad-9a6d-54715b5c5824")
    public static final String STEREOTYPE_NAME = "CompositeSecurityMetric";

    /**
     * Tells whether a {@link CompositeSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("32e75014-b11e-4407-8f6c-1684f818c197")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeSecurityMetric >> then instantiate a {@link CompositeSecurityMetric} proxy.
     * 
     * @return a {@link CompositeSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("aa88957a-e517-4707-9e6a-466de0b31d59")
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
    @objid ("2fa9689e-0660-4d42-b9a2-3633232c7686")
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
    @objid ("2398d6f4-b33c-48c7-a576-abda5d1e70a2")
    public static CompositeSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeSecurityMetric.canInstantiate(obj))
            return new CompositeSecurityMetric(obj);
        else
            throw new IllegalArgumentException("CompositeSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0cf5f6fa-ffa6-490b-aae9-29855a5c5736")
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
    @objid ("e3a9b619-df16-4cf1-a66e-86de666b49da")
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
    @objid ("757331d8-cf9c-4c31-8155-0910f84a163f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("fbbef080-6060-47d2-a3a4-98c0a76d0fa1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     */
    @objid ("cf33eccd-d7ca-463c-b8b3-82e969883bba")
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

    @objid ("4c993fad-1c5e-459d-8568-84082a8f745e")
    protected CompositeSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("fe4cd5da-e95c-488c-a4aa-bd4e00428eda")
    public static final class MdaTypes {
        @objid ("3dda5b22-ebf2-42ab-96ab-8d7fad1b4519")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6e6044e8-05cc-47e7-9db4-fb85478ce790")
        private static Stereotype MDAASSOCDEP;

        @objid ("2d7f9151-08eb-4814-903f-9e59cd5fe6bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5e08d60-89d9-47c9-8732-005034d57d03")
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
