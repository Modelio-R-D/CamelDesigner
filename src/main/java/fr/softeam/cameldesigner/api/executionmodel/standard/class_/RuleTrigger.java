/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
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
 * Proxy class to handle a {@link Class} with << RuleTrigger >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("92bee481-90ec-4831-ae16-86a6451589ef")
public class RuleTrigger extends Cause {
    @objid ("aa2d3670-7439-4741-a866-dc51e2a0c5ef")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    @objid ("9d4ff89e-277a-44fe-aa34-35f66f8f72e0")
    public static final String TRIGGERINGTIME_TAGTYPE = "TriggeringTime";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ad815d4-b345-4b41-b336-5337a539467b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("f52b61d8-bf1b-431b-9234-d529904d5c4c")
    public static RuleTrigger create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME);
        return RuleTrigger.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RuleTrigger} proxy or <i>null</i>.
     */
    @objid ("9e8f029d-a442-468c-a512-af9b30f0ad95")
    public static RuleTrigger instantiate(final Class obj) {
        return RuleTrigger.canInstantiate(obj) ? new RuleTrigger(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RuleTrigger} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e066d7c-a8af-4fee-8af6-114b408dd1b5")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
        	return new RuleTrigger(obj);
        else
        	throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("375f12b0-8f17-4aa4-8114-605abbd4e962")
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
        RuleTrigger other = (RuleTrigger) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("36d3a3c0-1e7d-4d8e-ba89-cecda89293ef")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e4ed5e08-4db8-4f22-b0bf-9273ea0480fa")
    public ScalabilityRule getScalabilityRule() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RuleTrigger.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RuleTrigger.MdaTypes.MDAASSOCDEP_ROLE), "scalabilityRule")){
                  if (ScalabilityRule.canInstantiate(d.getDependsOn()))
                     return (ScalabilityRule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScalabilityRule.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'TriggeringTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e87648b-6b00-4902-b0dd-475ef7d451c6")
    public String getTriggeringTime() {
        return this.elt.getTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT);
    }

    @objid ("1d938960-a0f2-4bc7-8b6a-80ec9a13e53a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("079b2d81-bf8e-43a3-8051-bf99ef8d2a02")
    public void setScalabilityRule(final ScalabilityRule obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RuleTrigger.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RuleTrigger.MdaTypes.MDAASSOCDEP_ROLE), "scalabilityRule")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RuleTrigger.MdaTypes.MDAASSOCDEP);
              dep.setName("scalabilityRule");      dep.putTagValue(RuleTrigger.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityRule");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'TriggeringTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6514d2ec-1912-4af1-ba2a-c4c2e9da5fd4")
    public void setTriggeringTime(final String value) {
        this.elt.putTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("bd7c1ceb-a432-4318-ba7a-1c9431a56acc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("7ac44583-e646-44d8-892a-99acf1d48ce8")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("3812bc10-da6d-4348-810d-7bb920cfa101")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0df5fa4-8da0-4e39-a59c-f395c756999c")
        public static TagType TRIGGERINGTIME_TAGTYPE_ELT;

        @objid ("f0823b89-4f12-4d7b-9c00-d0183e9f858b")
        private static Stereotype MDAASSOCDEP;

        @objid ("be8ff30a-0814-44cb-a9ed-d213fe1748de")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b8177d7-bd90-4bde-aed6-4656f84f69ae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6feb668e-fc53-4354-93a8-d98b00fdb186");
            TRIGGERINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "222df9b1-1654-420c-9e13-31a2c7f0da8d");
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
