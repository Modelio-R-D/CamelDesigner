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
    @objid ("c522c894-ff85-4007-8777-9cb6181986d7")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("8fc4c678-20de-4108-9f0a-20c9ec726527")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("d88ee7cc-b87e-418d-a31d-2d6105eb2895")
    public static final String OPERATOR_TAGTYPE = "operator";

    /**
     * Tells whether a {@link UnaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UnaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0dfea81f-d9f3-49a1-bf0c-9c8f682d5dd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UnaryEventPattern >> then instantiate a {@link UnaryEventPattern} proxy.
     * 
     * @return a {@link UnaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("b53bc55f-53e0-4d96-be7c-b7bd11dffa93")
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
    @objid ("7a5800fc-86a1-4826-b4b5-add97c1c5c64")
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
    @objid ("f02f5ed6-0ec0-4c6f-a0fc-09e665b88bdd")
    public static UnaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UnaryEventPattern.canInstantiate(obj))
        	return new UnaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("UnaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d13ba7dd-2ca0-4b25-8c4b-4986313468d0")
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
    @objid ("b7f75616-4c41-4923-ae2c-b4d7f94ca8d9")
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
    @objid ("640719d8-fa0e-4dbf-ab32-62aaa8990343")
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
    @objid ("5cbb4b08-7f0e-4a39-ba5d-8d74c1d7dd0f")
    public String getOccurrenceNum() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5040603-d32e-4b0a-a2a8-b9d53b81a2c4")
    public String getOperator() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    @objid ("1d657259-f61e-4356-89b1-95b927a46e68")
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
    @objid ("1a129e8e-54ac-4f65-8b0d-1df2fc5492cf")
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
    @objid ("5c6782d1-1dcd-46ac-b02c-b88c69f4d179")
    public void setOccurrenceNum(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("31b0ded3-8f4f-401e-bb71-d3f379769ff0")
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

    @objid ("da84dcc0-b229-42cf-a83a-76d69a68bf1c")
    protected UnaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("a301d6fd-1e9f-4328-a7ee-80b97952f165")
    public static final class MdaTypes {
        @objid ("a89c4c06-5f24-42fa-bbbf-24ddfe03efac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1ea692ef-3c62-4be8-8f70-61342328b853")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("de83c70d-071b-4061-aad0-0a5aa8ca3e82")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("ea354267-f776-42d2-870c-6dcf51f1a094")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e2e2116-c11a-455f-9e44-77f58390d442")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7af110df-342d-4944-b016-0d31122ed199")
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
