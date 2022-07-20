/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("8fb46623-ec8d-40fe-8d46-10f1844983f3")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("56105fa2-22d7-49e0-ac0f-22b6f38874f2")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("6a219d85-efa3-4da8-9a09-5faa6ebc050a")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("dc6f67eb-6a6b-4e0c-9908-63dc356188e9")
    public static final String UPPEROCCURRENCEBOUND_TAGTYPE = "upperOccurrenceBound";

    /**
     * Tells whether a {@link BinaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BinaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5850288b-cef8-4132-8afa-90cde0c159c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BinaryEventPattern >> then instantiate a {@link BinaryEventPattern} proxy.
     * 
     * @return a {@link BinaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("eaf15bc3-2429-489d-8e7e-450553172b0a")
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
    @objid ("58fc759f-3bbc-4c0f-bc81-ecd40874da3f")
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
    @objid ("68669c22-494c-487a-8f9b-7e223da3b376")
    public static BinaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BinaryEventPattern.canInstantiate(obj))
        	return new BinaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("BinaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("26c14103-fc9f-4447-8012-0c7c4a5a78c7")
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
    @objid ("c2e625af-0faf-46ca-b986-76a4bc374994")
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
    @objid ("bb121379-43d8-4f9d-a83f-c3aee345c649")
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
    @objid ("b02cbc48-ef6a-4c4d-a836-c9dbc9d40d68")
    public String getLowerOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("23cb4078-144c-4c00-bd6f-f7152c7964ba")
    public String getOperator() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("11f7619e-6701-4094-b692-f53463887cdc")
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
    @objid ("19793224-57d1-4fad-ab29-db0652a9d5c3")
    public String getUpperOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    @objid ("2fc6d6e3-ee9b-47a1-a5c1-9a4ff62a022e")
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
    @objid ("2a44a9a4-c5e4-4929-a48c-82ff3e8e9b89")
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
    @objid ("8fc92e27-c240-4fd4-811e-e3ecef5c4a38")
    public void setLowerOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("016294b2-a9f2-43c1-a9b7-3fff5b2b34a5")
    public void setOperator(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1ebb6f57-c8ff-477b-ae0f-0b372a752a25")
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
    @objid ("65fa907a-1ca9-4f8c-93c3-45b7c33170e8")
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

    @objid ("c4b9cebe-5618-40ef-8e0a-600cf5d8ee8a")
    protected BinaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("557dc2d3-3a32-40be-a1c9-31aad96680de")
    public static final class MdaTypes {
        @objid ("b2360969-497a-4460-93ca-9095f0440819")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c0aeff6-0b4f-48e6-a376-2d24de8916d3")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("6b90f2a7-1f90-47d9-a47c-1dc5dcab4a36")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("a3a1df56-624f-4f01-8b72-ed599622f762")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("634b2e5e-cf9f-4094-80af-7990d15e6ced")
        private static Stereotype MDAASSOCDEP;

        @objid ("cbd2249e-32af-41e8-a7c1-5fe301b7a293")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cb42e1a0-0efd-4ca6-a56e-aabc9a34345f")
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
