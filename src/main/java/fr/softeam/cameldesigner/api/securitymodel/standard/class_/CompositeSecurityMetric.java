/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("5fde1438-de29-4d22-87a0-2ac1bee7f969")
    public static final String STEREOTYPE_NAME = "CompositeSecurityMetric";

    /**
     * Tells whether a {@link CompositeSecurityMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeSecurityMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("50d6b44b-a3ac-48c4-9444-a8ca6911668d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeSecurityMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeSecurityMetric >> then instantiate a {@link CompositeSecurityMetric} proxy.
     * 
     * @return a {@link CompositeSecurityMetric} proxy on the created {@link Class}.
     */
    @objid ("ab60af4d-6444-4afb-b602-4e8ae3507b63")
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
    @objid ("dc529b90-1bcc-4a13-b12d-3ad25a80af96")
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
    @objid ("d8a10b56-0f55-43d5-b7fe-f0d6d813b7c4")
    public static CompositeSecurityMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeSecurityMetric.canInstantiate(obj))
        	return new CompositeSecurityMetric(obj);
        else
        	throw new IllegalArgumentException("CompositeSecurityMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cf42a8ce-5239-44bf-8696-0c453a2b457b")
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
    @objid ("b400262e-9541-4fc3-807a-683361e82314")
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
    @objid ("1fdae213-7898-43aa-ba9f-ffcfaf12f684")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("86692e3a-7cc4-4799-a203-a0e302e75e98")
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
    @objid ("238b9daf-3179-4269-9ae3-a94d5bd9365d")
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

    @objid ("6c0eceea-0f98-410b-a951-818b761e96da")
    protected CompositeSecurityMetric(final Class elt) {
        super(elt);
    }

    @objid ("fe4cd5da-e95c-488c-a4aa-bd4e00428eda")
    public static final class MdaTypes {
        @objid ("4333ba73-4178-484e-999f-5923e4afaa43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5e44559-b52b-4899-b986-9eea68756e72")
        private static Stereotype MDAASSOCDEP;

        @objid ("56144757-2eb7-40f8-8216-9bb4890537ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48c2e114-7e39-4382-8c09-abeea4f8933c")
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
