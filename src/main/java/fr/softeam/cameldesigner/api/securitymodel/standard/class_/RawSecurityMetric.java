/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("d105d981-25ae-4abb-8889-6516267adcde")
    public static final String STEREOTYPE_NAME = "RawSecurityMetric";

    /**
     * Tells whether a {@link RawSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b14e9913-5ec6-4c24-b3fc-abe3302dc0a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawSecurityMetric >> then instantiate a {@link RawSecurityMetric} proxy.
     * 
     * @return a {@link RawSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("5fed08db-d480-45de-9991-acf22b5e2076")
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
    @objid ("50235252-6349-41d2-b014-a0749c9d248d")
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
    @objid ("b4ff1812-f638-44c4-9a80-e0f1b8d846c3")
    public static RawSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawSecurityMetric.canInstantiate(obj))
        	return new RawSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("RawSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3c6878b-d5fa-44a7-8099-17adc55e0c6e")
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
    @objid ("4353ecd9-7c6c-4d78-ac01-952c12155a00")
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
    @objid ("9a5a77e8-4402-4af7-9ab8-dae8fa1d897e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("32ccc01b-434d-475e-a338-607b0a1520a1")
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
    @objid ("df562628-b879-4da5-a2a8-6045d4006f13")
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

    @objid ("f1547f33-8871-4ac0-ab93-25da21d5273d")
    protected RawSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("e07ed229-3645-4f01-84db-5816474f36ad")
    public static final class MdaTypes {
        @objid ("a84d324c-ed2d-49a1-8b96-37af9fab2709")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0671ed78-ec0f-4eb4-a834-192b2354fffb")
        private static Stereotype MDAASSOCDEP;

        @objid ("fc70e2fc-12ad-41a6-8d4c-92012862f98c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8da1dffc-bd82-4f56-958c-ab83d2d31b9b")
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
