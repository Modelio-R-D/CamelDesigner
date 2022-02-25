/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
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
 * Proxy class to handle a {@link Class} with << RawSecurityMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9c9c3717-d929-40e5-883e-acf25d0cc102")
public class RawSecurityMetric extends RawMetric {
    @objid ("b1119a01-f5b8-4ab0-ba70-3c0074d1bdfe")
    public static final String STEREOTYPE_NAME = "RawSecurityMetric";

    /**
     * Tells whether a {@link RawSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aaa620f9-0c73-4ba8-88d0-4b0a315a03aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawSecurityMetric >> then instantiate a {@link RawSecurityMetric} proxy.
     * 
     * @return a {@link RawSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("5c86367f-a014-4525-b548-9834e094c72d")
    public static RawSecurityMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME);
        return RawSecurityMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawSecurityMetric} proxy from a {@link Class} stereotyped << RawSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RawSecurityMetric} proxy or <i>null</i>.
     */
    @objid ("2c1d2b46-8e1f-4bfd-9f72-5b565789a83c")
    public static RawSecurityMetric instantiate(final Class obj) {
        return RawSecurityMetric.canInstantiate(obj) ? new RawSecurityMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawSecurityMetric} proxy from a {@link Class} stereotyped << RawSecurityMetric >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RawSecurityMetric} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("990d88bf-6eec-414a-a3e9-cef85529e458")
    public static RawSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawSecurityMetric.canInstantiate(obj))
        	return new RawSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("RawSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("87a64834-3cf1-4ac0-8963-bcf392118a36")
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
        RawSecurityMetric other = (RawSecurityMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df3115cd-cdae-4ffb-90b4-350fb1b22b87")
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RawSecurityMetric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
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
    @objid ("0fcc465b-a338-44ea-baba-cb1fe9d60044")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("41e97fe3-a61a-4653-86cf-9c2dd398223c")
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
    @objid ("49afff0c-3ff9-4f14-862b-10871d1fbc34")
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RawSecurityMetric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RawSecurityMetric.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(RawSecurityMetric.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ecb47660-a285-41e8-8d25-20503f2f13f6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("442d26d8-b0a3-464d-897d-479a07c488c2")
    protected RawSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("e07ed229-3645-4f01-84db-5816474f36ad")
    public static final class MdaTypes {
        @objid ("a94fa32b-513f-4fd2-989c-6ec92e48f879")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("182258bd-672e-46ba-8ddc-8ff4ceb763bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("2218db4e-72cb-4d28-be1d-fd686e72f21c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("80f99791-315f-4990-92b0-94f9cb580165")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01bb4068-95c3-463c-bfc3-5e98fbd8bf98");
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
