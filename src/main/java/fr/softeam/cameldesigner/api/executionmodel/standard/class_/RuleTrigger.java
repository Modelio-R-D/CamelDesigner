/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("297aa5a0-83c1-4429-a3b8-6eb07f740fdd")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    @objid ("794749b5-8a3f-4ab7-8ca6-f190998fff83")
    public static final String TRIGGERINGTIME_TAGTYPE = "TriggeringTime";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("013988f7-995a-4544-8422-94a443ca7634")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("453fb12e-477d-49b7-a70a-dcff6881dc94")
    public static RuleTrigger create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME);
        return RuleTrigger.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RuleTrigger} proxy or <i>null</i>.
     */
    @objid ("40288779-70c8-432e-b34f-7873f75a2d97")
    public static RuleTrigger instantiate(final Class obj) {
        return RuleTrigger.canInstantiate(obj) ? new RuleTrigger(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RuleTrigger} proxy from a {@link Class} stereotyped << RuleTrigger >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RuleTrigger} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e7abf4f2-3b60-4fc1-969f-0135a28cbe12")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
            return new RuleTrigger(obj);
        else
            throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("13e864dc-f570-4a44-8ce5-b6ad838c8f5c")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e36b1376-491d-46c2-893d-7db8011750d0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     */
    @objid ("4a3b1ec3-e2de-403e-a329-5d53435b5797")
    public ScalabilityRule getScalabilityRule() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RuleTrigger.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RuleTrigger.MdaTypes.MDAASSOCDEP_ROLE), "scalabilityRule")
                  && ScalabilityRule.canInstantiate(d.getDependsOn())) {
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
    @objid ("cd259bd1-2b69-4192-88ee-199d5058abcf")
    public String getTriggeringTime() {
        return this.elt.getTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT);
    }

    @objid ("218353e8-efb2-48db-b0b3-13514579675a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     */
    @objid ("ecf757ee-4742-48b2-8bb5-b32f94c41886")
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
    @objid ("6452cd03-8135-446d-90f9-35eac60ead19")
    public void setTriggeringTime(final String value) {
        this.elt.putTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("8d776400-e771-4f15-bcb5-4897ff72045e")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("bd7c1ceb-a432-4318-ba7a-1c9431a56acc")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("eb2a703a-a2c4-471d-9af4-4ab9c0c7c315")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("49eb77ca-3290-4521-981a-e20e31cd3809")
        public static TagType TRIGGERINGTIME_TAGTYPE_ELT;

        @objid ("5eb8022f-ac12-4a30-a322-1b84938ec62f")
        private static Stereotype MDAASSOCDEP;

        @objid ("96a3ecd7-23d6-4bb6-a36b-3e26612d22a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d10ee75-61a9-4fa9-9f51-8f8d1683df84")
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
