/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
    @objid ("0ff485c3-4042-409c-bef9-956c5021d43b")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("5663ff3d-4983-4ab8-9f44-b14f3714db84")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("e50093cc-713c-4e10-a383-08000f1622ca")
    public static final String OPERATOR_TAGTYPE = "operator";

    /**
     * Tells whether a {@link UnaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UnaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("102b9880-3bc6-48f5-950e-5924702aaad2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UnaryEventPattern >> then instantiate a {@link UnaryEventPattern} proxy.
     * 
     * @return a {@link UnaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("896f3756-6128-403e-9596-e5dff4ffb768")
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
    @objid ("44e265bc-f17b-482a-ab98-29e3fa21d974")
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
    @objid ("23793108-dde6-4c88-8c98-20f0ee397e4d")
    public static UnaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UnaryEventPattern.canInstantiate(obj))
        	return new UnaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("UnaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c2d7589e-ba61-4de6-bdcc-2352da4f6275")
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
    @objid ("1e648891-066f-463b-b265-22d0a633e31b")
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
    @objid ("8b8f4495-1b8f-4683-9c35-41f611a4f7e3")
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
    @objid ("3d570d69-d111-49ed-a76d-77e5ff85cbce")
    public String getOccurrenceNum() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("af379e34-8900-45a8-8e4e-bfc6786b64b4")
    public String getOperator() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    @objid ("cd47af07-ae29-4925-8ac8-333baddff738")
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
    @objid ("a391c30b-86b1-403f-917a-7029cc2f2e89")
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
    @objid ("935d037f-962a-4406-8548-2ba4cbf582b5")
    public void setOccurrenceNum(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("46f70c71-40e4-4f41-85ab-5885a99d6ee0")
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

    @objid ("4e121679-c890-4a5b-a8ca-885e8b8c39a0")
    protected UnaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("a301d6fd-1e9f-4328-a7ee-80b97952f165")
    public static final class MdaTypes {
        @objid ("1b2fc29c-8329-41e4-8337-2ec1869f2f61")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("500039c1-f8ba-45f6-9a12-258673fc7b8b")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("495f5a54-0364-47fb-a5ed-bae28c6c9792")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("bede39cd-0c9c-451e-be64-0c5de32cae7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("251ed8c9-3689-4505-a2e5-ef10e2f942ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da0e0b9b-6a7d-4e36-bf7f-8d9e0ee2fe8e")
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
