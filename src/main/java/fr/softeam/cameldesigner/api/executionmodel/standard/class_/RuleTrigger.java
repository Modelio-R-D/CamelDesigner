/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
    @objid ("6c0743b9-9b6b-456c-b3ce-42e5072f303c")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    @objid ("9a8dec61-f4e8-4323-bab3-3da07d7f6a97")
    public static final String TRIGGERINGTIME_TAGTYPE = "TriggeringTime";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f9163fd-0c4c-4b6e-9c6d-59c3b019b725")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("cf7bb9ec-615b-485e-aa5a-7835281db864")
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
    @objid ("ee713810-9026-497f-950c-08f7a0bed825")
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
    @objid ("ab95bf22-e4b4-4140-91d3-e2b3b09b7fe3")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
        	return new RuleTrigger(obj);
        else
        	throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0267fed3-2f30-44d1-bab3-8d0f05d0f28f")
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
    @objid ("e7b036bd-6931-456e-961d-7b1653d51ab3")
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
    @objid ("a0da358c-fe07-4651-8767-544bc6e0a793")
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
    @objid ("88d3d23f-8572-4caa-9a80-8e51e0b3d027")
    public String getTriggeringTime() {
        return this.elt.getTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT);
    }

    @objid ("14a2639a-b042-46f9-9593-94e19f23745d")
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
    @objid ("f53306f1-7cdd-4846-bdbb-c22de01104a1")
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
    @objid ("520f2834-ca3b-4476-945a-cc8c94f6b06f")
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

    @objid ("3ca0aa62-91c2-4d7c-a1d3-578c3a62fd96")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("d21e0454-7e5e-4ac0-bc79-ef90cfad949a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20e5bde0-290c-4a74-962b-c1dd1ced0e49")
        public static TagType TRIGGERINGTIME_TAGTYPE_ELT;

        @objid ("d658fd5e-cf33-4a8a-a281-6aeaf1a105ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("5f45d88a-58a5-4586-9fe3-015659a11701")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a29eaa2-2537-4783-ada0-ad2deb5f93d1")
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
