/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("ddbf2a5c-85c1-4ae6-bf94-a76421bbb35e")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    @objid ("9bd07300-b3fb-4ef2-8a11-0699c20d5f12")
    public static final String TRIGGERINGTIME_TAGTYPE = "TriggeringTime";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8ac278c4-1e9c-4466-8356-1e4d93c7f292")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("91abdfcd-4f51-492d-8c0b-465f8d086910")
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
    @objid ("f5dd0966-3d6f-40c4-99e1-3878e292085b")
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
    @objid ("926e0f1b-698a-4b59-97ff-edc72c96f6d8")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
        	return new RuleTrigger(obj);
        else
        	throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("49635386-ea58-4772-a11f-c015fcee28a5")
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
    @objid ("a0fc8733-9b05-45ee-8dd2-af5d9022cece")
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
    @objid ("44aa6c8e-2413-4ca4-ae3a-905210552ea8")
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
    @objid ("ed8571de-094f-46b6-be70-bd35a56e9d05")
    public String getTriggeringTime() {
        return this.elt.getTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT);
    }

    @objid ("ceb15914-9cdc-4a6c-a5ce-fe4d70fb65eb")
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
    @objid ("ba85fcd4-e7e2-4f92-9dc7-db10854bcc7e")
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
    @objid ("cc5c79d7-17f1-41ad-afe7-3b2d54b6c67e")
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

    @objid ("31312cc7-4493-48e5-a792-514152cd0850")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("51bbc890-fc13-4e50-a7e9-39f033d08b01")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9cb202a9-f577-494d-b666-23a04c4aa94d")
        public static TagType TRIGGERINGTIME_TAGTYPE_ELT;

        @objid ("fb3d027f-c790-4732-a919-2de00a77a661")
        private static Stereotype MDAASSOCDEP;

        @objid ("18210948-5116-4a08-b14c-fdf0c4ae95f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1290928b-f1f0-485a-9ce2-3877ff7f4b44")
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
