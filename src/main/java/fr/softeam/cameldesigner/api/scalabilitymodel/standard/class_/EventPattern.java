/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
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
 * Proxy class to handle a {@link Class} with << EventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1376376d-c30d-492b-b270-8ae507dd5d21")
public abstract class EventPattern extends Event {
    @objid ("f0678b10-8fc7-4496-9946-7e6c2dd10eee")
    public static final String STEREOTYPE_NAME = "EventPattern";

    /**
     * Tells whether a {@link EventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << EventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7ae936e-594e-4ed9-8cad-268d545c67ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventPattern.STEREOTYPE_NAME));
    }

    @objid ("69be1b5a-80a4-4e73-be74-482f9309145d")
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
        EventPattern other = (EventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("99552561-3727-4a3e-9b29-1b9afe32d843")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'timer' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("266704c3-ca4e-46f5-8495-c700d14495c8")
    public Timer getTimer() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(EventPattern.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE), "timer")){
                  if (Timer.canInstantiate(d.getDependsOn()))
                     return (Timer)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Timer.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("8d9c34f7-ac14-454f-88c3-4b0e0a904339")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'timer' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05ad66a9-6cbd-4dd4-9a91-639d3a6e38a6")
    public void setTimer(final Timer obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(EventPattern.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE), "timer")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), EventPattern.MdaTypes.MDAASSOCDEP);
              dep.setName("timer");      dep.putTagValue(EventPattern.MdaTypes.MDAASSOCDEP_ROLE, "timer");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("725068a1-ca4a-4cf3-b47b-bfecd407905a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c94ff62a-b45b-430b-8c70-e42c17a57fad")
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
        @objid ("96ef88ad-6e2e-4f12-adab-3ea7ad809ecf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5e24c50-2872-4128-a096-ead9efbbd80c")
        private static Stereotype MDAASSOCDEP;

        @objid ("75719fd6-345c-4c26-b102-854f26de41f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a7e52a1-e627-47b3-a2de-52ae9095c97c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "46e221ca-8a8f-458b-8018-009a273cc009");
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
