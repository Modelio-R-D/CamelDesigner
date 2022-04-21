/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("fec8f191-302f-4f17-be99-a8389d39784c")
    public static final String STEREOTYPE_NAME = "RuleTrigger";

    @objid ("a24a5176-a636-4aaf-b093-2db3cea09a0e")
    public static final String TRIGGERINGTIME_TAGTYPE = "TriggeringTime";

    /**
     * Tells whether a {@link RuleTrigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RuleTrigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d7e1335-f963-48a7-9507-6ff3adaec28b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RuleTrigger.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RuleTrigger >> then instantiate a {@link RuleTrigger} proxy.
     * 
     * @return a {@link RuleTrigger} proxy on the created {@link Class}.
     */
    @objid ("f175b77a-f235-45d8-9c2e-5e4277e652d3")
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
    @objid ("e8ea770e-87a0-4e47-b32a-fa21dad5b1cc")
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
    @objid ("5e2b32fa-ee80-48aa-a971-6cf42a1d7f9f")
    public static RuleTrigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RuleTrigger.canInstantiate(obj))
            return new RuleTrigger(obj);
        else
            throw new IllegalArgumentException("RuleTrigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("789b8e94-05ae-40e3-8edf-8df81277942e")
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
    @objid ("47dfa02d-bf5d-4c0c-a05e-c9e34f087318")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     */
    @objid ("fe5798b8-80ac-4c09-941f-f5be9c402181")
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
    @objid ("5371d390-4fb3-4aa8-93fc-7ed36f755c2a")
    public String getTriggeringTime() {
        return this.elt.getTagValue(RuleTrigger.MdaTypes.TRIGGERINGTIME_TAGTYPE_ELT);
    }

    @objid ("3bda992b-fa98-4f07-9f09-d199c2650564")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'scalabilityRule' role.<p>
     * Role description:
     * null
     */
    @objid ("427aaee4-2899-46eb-b81a-83de105e0616")
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
    @objid ("5a0e4b06-47be-4e50-83e2-9a8c033729d6")
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

    @objid ("52064ba1-79ad-4b4e-9a6b-e77b330e9f8b")
    protected RuleTrigger(final Class elt) {
        super(elt);
    }

    @objid ("4d25ae3c-a321-44a2-bbb9-74f641ada07d")
    public static final class MdaTypes {
        @objid ("7ae8bdda-dc22-4402-b67f-c699961c378e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("77aaf93a-548e-4266-a604-b97794da6ab9")
        public static TagType TRIGGERINGTIME_TAGTYPE_ELT;

        @objid ("c47cafa5-3f0b-4b7a-a43b-abce0ca1dd85")
        private static Stereotype MDAASSOCDEP;

        @objid ("1adf3c68-cb68-43ad-9310-dbd8771dcc59")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ebb9f25-35a5-4d56-a26b-b60b379b2368")
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
