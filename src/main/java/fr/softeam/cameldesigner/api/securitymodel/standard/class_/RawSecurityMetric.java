/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("a44546e7-862b-4ac8-aa4b-121e92a77d5e")
    public static final String STEREOTYPE_NAME = "RawSecurityMetric";

    /**
     * Tells whether a {@link RawSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ed6fae3a-4ea6-44aa-a2dd-48c9f526523d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawSecurityMetric >> then instantiate a {@link RawSecurityMetric} proxy.
     * 
     * @return a {@link RawSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("2fc44c4d-2c13-4f94-b4b0-278e1679e9e8")
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
    @objid ("ad919f5e-3ae5-4af4-9124-1c5fc1a7fa64")
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
    @objid ("0b8d1e3c-e40f-4946-a5f9-06641f3d0a8d")
    public static RawSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawSecurityMetric.canInstantiate(obj))
        	return new RawSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("RawSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dedc6b4b-b93c-482c-b479-7f036f035230")
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
    @objid ("110fef91-8efe-4e4a-bff7-21978fced9c5")
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
    @objid ("35047061-59be-469e-9f61-e62d00b2c4f0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("e2b8df6d-2ad1-46d3-a5c3-a8e91d364391")
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
    @objid ("05810d12-a52c-4320-9703-4e739c2fbf15")
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

    @objid ("2d2f6f6c-f62d-41f2-b0ff-5f72bbdea03f")
    protected RawSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("e07ed229-3645-4f01-84db-5816474f36ad")
    public static final class MdaTypes {
        @objid ("92f2b365-ce24-4785-a1fc-aa54b6ccdba4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e10d8118-aa0d-41c4-9c1a-491938b76c9e")
        private static Stereotype MDAASSOCDEP;

        @objid ("a71f9405-158b-4d7f-9cfb-b8cb136330fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c61ff841-fd75-4d8e-af2f-eb385b2698df")
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
