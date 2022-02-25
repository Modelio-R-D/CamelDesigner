/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("0db5bd86-65a3-4e3e-860e-2b78cb396025")
    public static final String STEREOTYPE_NAME = "EventPattern";

    /**
     * Tells whether a {@link EventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << EventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8c3064e6-1a58-4bce-927c-0d6add1cb891")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventPattern.STEREOTYPE_NAME));
    }

    @objid ("03df87a3-8113-43a3-a7e1-dcc1fd0d04db")
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
    @objid ("c604c89f-9c9f-4023-b37e-3bec6c159492")
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
    @objid ("98ff9ef5-740f-450f-bf42-f0c1636d82fc")
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

    @objid ("4459caf7-80b8-4a60-82cd-43bb8890606f")
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
    @objid ("453f2011-2bbd-45cb-92b6-40b7295432e9")
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

    @objid ("a69dfecf-3f36-469e-8eaf-6d5c6a4ef80b")
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
        @objid ("a4a9dd45-62d7-4964-b4ea-fe71d984c538")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34b07e01-bcfe-439a-824e-5f86c260091e")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdf74436-6c57-47de-9438-3bf94dae9e98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1c76da66-3333-4d15-a9cb-ada7ab7b4fb9")
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
