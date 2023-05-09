/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
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
 * Proxy class to handle a {@link Class} with << UnaryEventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3d40f3a0-05f1-449c-8c3b-670598c18421")
public class UnaryEventPattern extends EventPattern {
    @objid ("10d5a373-8d0d-4a66-8fdd-f058f2dbae60")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("0ed0faad-02f1-40a6-b5ce-affdd6e527ba")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("d1ad8387-a8b0-4ea0-9290-e9fac1a4518f")
    public static final String OPERATOR_TAGTYPE = "operator";

    /**
     * Tells whether a {@link UnaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UnaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f078733d-b3c3-46a0-a460-437d96f993bf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UnaryEventPattern >> then instantiate a {@link UnaryEventPattern} proxy.
     * 
     * @return a {@link UnaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("48e6755d-11ba-440f-81e8-10f447567fe8")
    public static UnaryEventPattern create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME);
        return UnaryEventPattern.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link UnaryEventPattern} proxy from a {@link Class} stereotyped << UnaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link UnaryEventPattern} proxy or <i>null</i>.
     */
    @objid ("f765eed5-a8b2-47bb-be45-f712c48c3102")
    public static UnaryEventPattern instantiate(final Class obj) {
        return UnaryEventPattern.canInstantiate(obj) ? new UnaryEventPattern(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnaryEventPattern} proxy from a {@link Class} stereotyped << UnaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link UnaryEventPattern} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fd6ff52a-91d3-4003-aca5-f1ef4f2c774f")
    public static UnaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UnaryEventPattern.canInstantiate(obj))
        	return new UnaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("UnaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8c04e24-dc1c-450c-ae19-7481ffb13095")
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
        UnaryEventPattern other = (UnaryEventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("44b7849b-fbbd-4eb4-9303-c9051ec5df0d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'event' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e068621b-8f10-4e8a-94ad-beac162bdd2d")
    public Event getEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(UnaryEventPattern.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(UnaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "event")){
                  if (BinaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (BinaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BinaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (UnaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (FunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'occurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("decaeda5-3bc8-4b24-97ee-91e8f5108d8d")
    public String getOccurrenceNum() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("df7d54a3-113f-4bb0-95da-84c6f1b120c9")
    public String getOperator() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    @objid ("651fed2a-8f17-4419-892a-85b215dc9077")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'event' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c4f26d8d-ea45-479e-8602-467db40fe36d")
    public void setEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(UnaryEventPattern.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(UnaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "event")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), UnaryEventPattern.MdaTypes.MDAASSOCDEP);
              dep.setName("event");      dep.putTagValue(UnaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE, "event");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'occurrenceNum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c33a1429-65e9-46c9-a902-1b0ef4c867e6")
    public void setOccurrenceNum(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("328b60be-fc8c-4bc5-9c15-9b6a20c32b6b")
    public void setOperator(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("2bc543a1-7337-4e8f-b910-0e41bb0498e3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("451cd30c-f4d8-469b-82f8-92544ef01d15")
    protected UnaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("a301d6fd-1e9f-4328-a7ee-80b97952f165")
    public static final class MdaTypes {
        @objid ("69f8cb2d-409a-422d-b229-9ce7143a0d26")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1456990e-3688-4794-8e94-7fc8d720b4ea")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("5bcec6e2-eb0a-402a-b893-e38f7bc558ce")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("698e86f6-7dcd-4657-a7b8-89cb565f21e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("83d10994-33cc-4756-a017-c65a3d0817e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8e8b3a6-0026-4bd7-8fc5-c53462627c2b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3956e53e-cf9e-4b4c-9b9c-16e18a3c53d6");
            OCCURRENCENUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bd5fbe3f-41f7-445c-99e7-d6dc54c00545");
            OPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d81a946e-890b-49ba-87e2-6b173e3400d3");
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
