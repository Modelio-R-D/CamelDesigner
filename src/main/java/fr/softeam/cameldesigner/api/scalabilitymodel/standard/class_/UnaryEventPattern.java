/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("c9e1c7e4-9c4d-45aa-995b-76f398ac6d6b")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("90e2f550-fd82-4d50-ae38-5644fec2cf25")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("eb1a8ff8-1ea8-40ea-b4ac-8f992a3b20be")
    public static final String OPERATOR_TAGTYPE = "operator";

    /**
     * Tells whether a {@link UnaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UnaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cfcf4fa2-940f-4e7b-8bdb-169f732a5fbb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UnaryEventPattern >> then instantiate a {@link UnaryEventPattern} proxy.
     * 
     * @return a {@link UnaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("ebd058ba-269c-43f2-b9ec-a20b69e52dff")
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
    @objid ("85be0480-dd06-4e60-ae44-4ac30cb4f715")
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
    @objid ("73795eb2-b0e2-40d7-a3bb-217ba3bb0c54")
    public static UnaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UnaryEventPattern.canInstantiate(obj))
        	return new UnaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("UnaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93c850be-8b55-4e48-abc1-082a3d0ce63c")
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
    @objid ("48f8c5cf-cf8b-49b4-9e4a-bac98e0a18ad")
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
    @objid ("60492961-df8e-4ffe-9143-aa115469517b")
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
    @objid ("b19f8d7f-1983-4118-b4f6-069bc0efca8a")
    public String getOccurrenceNum() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac7a14bf-32f8-4498-8965-ba2602aacc95")
    public String getOperator() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    @objid ("1f82a76c-9e8b-4e65-a2cb-7f0161a4a64d")
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
    @objid ("2a2ff8f4-20a7-48ab-969f-f163fab5d6ed")
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
    @objid ("f23f2514-076b-42ac-a48d-6474eef75dfb")
    public void setOccurrenceNum(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53be0842-00d5-4429-81ab-846d27662822")
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

    @objid ("ee310633-c95c-4254-8413-a75edd2d0172")
    protected UnaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("a301d6fd-1e9f-4328-a7ee-80b97952f165")
    public static final class MdaTypes {
        @objid ("dcbf5921-d382-405d-8d38-ccee1c79002f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e197f66b-f7e7-4f7b-bc37-1f79696edbdb")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("a108cbea-2e4d-4bff-b944-3306e294162d")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("522f1a17-aaf5-4a6f-839a-dadec73b3fb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("78ea60bb-4d6f-4e4b-b5d4-c5a49ad369db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f8b6f40-9857-4ee9-a996-c2709b0f7215")
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
