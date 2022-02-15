/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
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
 * Proxy class to handle a {@link Class} with << BinaryEventPattern >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad7c68b1-eb50-4553-a484-26d3118af425")
public class BinaryEventPattern extends EventPattern {
    @objid ("f8e697ef-8c29-429a-a070-65f564742377")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("6a1149e8-9b2e-48aa-8360-66326137a9ab")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("31edd20f-7d8d-4394-84f1-5d0686113afb")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("b65e7f59-10f7-40ff-8ce9-7aa90f53c7f5")
    public static final String UPPEROCCURRENCEBOUND_TAGTYPE = "upperOccurrenceBound";

    /**
     * Tells whether a {@link BinaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BinaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee0cec98-4755-439a-a39f-41e48e4f5579")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BinaryEventPattern >> then instantiate a {@link BinaryEventPattern} proxy.
     * 
     * @return a {@link BinaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("e236cbeb-4f7e-4872-acb2-eb743aab3b0d")
    public static BinaryEventPattern create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME);
        return BinaryEventPattern.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link BinaryEventPattern} proxy from a {@link Class} stereotyped << BinaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link BinaryEventPattern} proxy or <i>null</i>.
     */
    @objid ("4fd26246-cbb6-4c00-8b62-eb898edd9cb0")
    public static BinaryEventPattern instantiate(final Class obj) {
        return BinaryEventPattern.canInstantiate(obj) ? new BinaryEventPattern(obj) : null;
    }

    /**
     * Tries to instantiate a {@link BinaryEventPattern} proxy from a {@link Class} stereotyped << BinaryEventPattern >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link BinaryEventPattern} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7dddd0e1-648e-448e-9633-3abbcc519f7a")
    public static BinaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BinaryEventPattern.canInstantiate(obj))
        	return new BinaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("BinaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("710efd09-ec38-4d1d-a93a-474829f0f729")
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
        BinaryEventPattern other = (BinaryEventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("75facfd6-e8d0-4d0a-8c90-d027cfdbce8a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'leftEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("15aa4086-2fbd-47f0-a0d8-8d58cdce10aa")
    public Event getLeftEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(BinaryEventPattern.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "leftEvent")){
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
     * Getter for string property 'lowerOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7f9c6c37-eb5e-4d90-9feb-0100cde700fa")
    public String getLowerOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dbf661ab-3bcb-4797-a45d-c7d9840910fe")
    public String getOperator() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9d043697-cb00-4446-9583-b5541d8674d6")
    public Event getRightEvent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(BinaryEventPattern.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "rightEvent")){
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
     * Getter for string property 'upperOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("37a507c9-ff68-4845-9dfc-cf3bd1156d2d")
    public String getUpperOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    @objid ("2740c49e-6e6c-463d-b9b8-0d43029fd8f3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'leftEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55262856-d666-4f27-8dd0-4244096776df")
    public void setLeftEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(BinaryEventPattern.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "leftEvent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), BinaryEventPattern.MdaTypes.MDAASSOCDEP);
              dep.setName("leftEvent");      dep.putTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE, "leftEvent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'lowerOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e364b54-f530-4e7b-aff0-98b70af90bf5")
    public void setLowerOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f54cb08-4387-4c3f-8bbf-fff67505f0b3")
    public void setOperator(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b6522ede-b228-40a0-8c4e-d056971c38c3")
    public void setRightEvent(final Event obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(BinaryEventPattern.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE), "rightEvent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), BinaryEventPattern.MdaTypes.MDAASSOCDEP);
              dep.setName("rightEvent");      dep.putTagValue(BinaryEventPattern.MdaTypes.MDAASSOCDEP_ROLE, "rightEvent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'upperOccurrenceBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9a96327f-8a9d-4c06-846e-f1d32da75a88")
    public void setUpperOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    @objid ("b89b2e4a-00ef-4a1d-9d68-780b4fd0255e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3c6a3b7b-787c-49d8-b1d1-7d6c1d20d349")
    protected BinaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("557dc2d3-3a32-40be-a1c9-31aad96680de")
    public static final class MdaTypes {
        @objid ("0c91790e-b45f-4b71-af1b-f7bc5205346f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("91a6eda9-77b6-4b75-ad6b-d14b654f3d64")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("ad9bfa0e-69f5-4698-acb3-02ad3030a3c6")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("4ac1b60f-54ab-4d62-85ab-bfd3799b31c1")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("d2c324f9-8f4a-4d76-ac9f-306ce0912d1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e0ccad8-f638-4dfc-a566-d2262be144cb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1558c1f6-4053-4544-b1ed-fb622a08a38e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "af833114-4bf1-4889-8ad0-621bb63e44c6");
            LOWEROCCURRENCEBOUND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "93e3f728-14c6-4561-9b94-3abf79c5863c");
            UPPEROCCURRENCEBOUND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "617103f2-a083-48d1-9655-6e2384b75bd6");
            OPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "759de975-2a14-4a02-af62-115d703de355");
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
