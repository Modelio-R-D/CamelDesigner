/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("7c311aa4-3738-42a0-ace3-8792cb44f5d8")
    public static final String STEREOTYPE_NAME = "EventPattern";

    /**
     * Tells whether a {@link EventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << EventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8c3ca048-1024-4371-973f-38193734ebd3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventPattern.STEREOTYPE_NAME));
    }

    @objid ("d158812e-702b-4766-bad1-0749de2501ae")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1749fc14-3495-49ec-a0c1-1237ffd36281")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'timer' role.<p>
     * Role description:
     * null
     */
    @objid ("cf24d5f1-b11f-4956-8ad0-55be6027f5dd")
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

    @objid ("17f9dc7b-ca50-4da9-917b-247d59e78c26")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'timer' role.<p>
     * Role description:
     * null
     */
    @objid ("ca47b9bc-95b6-4dd2-965e-710f5bb352d9")
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

    @objid ("16ad660f-42c6-42d8-b9a3-240b338518d7")
    protected EventPattern(final Class elt) {
        super(elt);
    }

    @objid ("dd1011e3-255f-4c6a-a51e-162a33438d4c")
    public static final class MdaTypes {
        @objid ("711d8afb-0c93-43de-80f4-86db0d87ad59")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6149fdea-3ed5-467d-aba5-3785a0f39ad5")
        private static Stereotype MDAASSOCDEP;

        @objid ("1d5c9224-0344-4b87-b41d-93ab2b908060")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd39dec1-5d88-4195-b8af-29df244a4023")
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
