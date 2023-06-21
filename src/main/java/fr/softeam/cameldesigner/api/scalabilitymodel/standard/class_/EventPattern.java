/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("a63acae0-089f-451d-8444-5c6f9a893736")
    public static final String STEREOTYPE_NAME = "EventPattern";

    /**
     * Tells whether a {@link EventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << EventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bcebac89-7551-4fd0-b77b-186a6e39c9e6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventPattern.STEREOTYPE_NAME));
    }

    @objid ("b1b0096e-870b-416f-9a42-8dbeba504f3b")
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
    @objid ("36ffd1ad-7ee9-4c5a-b127-67e094cac3d2")
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
    @objid ("745e1984-74a3-4d31-a876-5e313e968cfa")
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

    @objid ("82e6185f-4a39-4e09-9f79-380d1f9fb25e")
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
    @objid ("1a81d6f8-193e-44f1-8857-966f6554709b")
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

    @objid ("b7a4f511-b6ac-4f36-a08d-d7d928940e23")
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
        @objid ("19a77f43-b7fc-43d6-ab5b-96c1b17efb13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4276f1c5-d136-4e08-93c4-78e6f085a39f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e372dc1-1c1f-4309-a226-0e8d00fa4a43")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be6b61b8-268c-4012-9980-02f1563a6250")
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
