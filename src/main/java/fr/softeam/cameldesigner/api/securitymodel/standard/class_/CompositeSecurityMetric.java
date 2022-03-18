/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
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
    @objid ("330d892d-cb7c-4044-b538-2d010a1c99bf")
    public static final String STEREOTYPE_NAME = "CompositeSecurityMetric";

    /**
     * Tells whether a {@link CompositeSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c8910e9f-ba57-4337-9ae1-2c84d6e3e9fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeSecurityMetric >> then instantiate a {@link CompositeSecurityMetric} proxy.
     * 
     * @return a {@link CompositeSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("28a69deb-d7b0-4ddf-b81a-c1646d2ef66a")
    public static CompositeSecurityMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME);
        return CompositeSecurityMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CompositeSecurityMetric} proxy or <i>null</i>.
     */
    @objid ("13b332fc-f842-4e2b-8e39-264520ed6fc4")
    public static CompositeSecurityMetric instantiate(final Class obj) {
        return CompositeSecurityMetric.canInstantiate(obj) ? new CompositeSecurityMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeSecurityMetric} proxy from a {@link Class} stereotyped << CompositeSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CompositeSecurityMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7d2bbdeb-b904-4620-a91b-df84690ae825")
    public static CompositeSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeSecurityMetric.canInstantiate(obj))
        	return new CompositeSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("CompositeSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47764aec-eb7d-47d1-a1c7-c0fd069906b5")
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
     * 
     */
    @objid ("3eb78383-3f64-4b5f-afc6-e919ccef52a5")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("437b1669-cc9e-422a-b1b7-ef47499a80fb")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("472bc89e-4e82-4275-a5bd-aac2d0f74955")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9bb9d7b4-dc9c-4499-9298-7981e6aad323")
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

    @objid ("004bcf3a-65ba-48a6-81cf-60b9d8b6cbbd")
    protected CompositeSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("fe4cd5da-e95c-488c-a4aa-bd4e00428eda")
    public static final class MdaTypes {
        @objid ("e9b77dcb-440b-422d-996c-aeb6d7478e59")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cdbe3f68-f277-4622-95b8-c9d583de58fc")
        private static Stereotype MDAASSOCDEP;

        @objid ("ff10bca2-c90f-4469-93de-a6fdb449a7bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fa7f4cda-9965-4102-afef-c3638ec64161")
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
