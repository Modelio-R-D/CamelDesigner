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
    @objid ("e65a7260-46f4-42ca-9183-b1ef0cdf1104")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("a676cbf1-3f70-4c7e-a8a4-95c4df95e86a")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("a19f5c14-18e2-4d0a-b358-d1bd2982f9d5")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("6afa2fd2-ebd7-43df-8672-9908b2656ffb")
    public static final String UPPEROCCURRENCEBOUND_TAGTYPE = "upperOccurrenceBound";

    /**
     * Tells whether a {@link BinaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BinaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63785780-0aeb-43f5-a199-85218422d518")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BinaryEventPattern >> then instantiate a {@link BinaryEventPattern} proxy.
     * 
     * @return a {@link BinaryEventPattern} proxy on the created {@link Class}.
     */
    @objid ("7c3de97c-ab9d-4ab4-8167-ff70b673464c")
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
    @objid ("f686a11d-77a2-4dfe-be50-fc6461e1ffc9")
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
    @objid ("2a9af88e-5638-480a-b5ad-9bf0b15c4e3f")
    public static BinaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BinaryEventPattern.canInstantiate(obj))
        	return new BinaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("BinaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f56de4c2-bba4-404a-b58c-e7690a104a2d")
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
    @objid ("1cbbf1bf-4111-4e1b-b868-3c2dbe407074")
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
    @objid ("ca4acb32-b5f9-4226-b7e3-6e56a8068b01")
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
    @objid ("7c957ac7-219d-4b56-a046-862764e6c4c7")
    public String getLowerOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f3b50a76-d778-4f3e-a0f0-2f4dab7ccdfa")
    public String getOperator() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4e5912af-62de-42a1-b701-581b2c8a1b04")
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
    @objid ("cb7ad541-afc1-4323-9f2c-c2fdf8cde23a")
    public String getUpperOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    @objid ("7b5374bd-e4a0-4666-bc49-e27fa0ff6c68")
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
    @objid ("7697213e-9baf-45d7-9eb3-dd20438e7cdc")
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
    @objid ("f85f000f-982d-406b-8a56-a8e13ab7629c")
    public void setLowerOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("29c0562b-f44d-466d-b458-fcdd74a3501e")
    public void setOperator(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d3c4447c-0ec6-4b57-a5a4-22477f219569")
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
    @objid ("85d3e381-b937-41f8-a69d-08e8df48b0c7")
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

    @objid ("31c6332b-3178-4b38-b76a-addb29f3d81d")
    protected BinaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("557dc2d3-3a32-40be-a1c9-31aad96680de")
    public static final class MdaTypes {
        @objid ("fe902fb3-ffda-4b31-8c2d-03e5e42b9535")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0caf0e18-7efd-4944-9a73-fb1b948dee93")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("bd589d53-ad27-4c79-be2e-54ea4ef86145")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("5e8bf10b-635a-4e86-ad5e-5d286471bf94")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("ee9c2d2c-abe5-463f-a12d-24399c942ccc")
        private static Stereotype MDAASSOCDEP;

        @objid ("e508f6a7-3db7-4fc8-8d91-5a949050267b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4a1531de-0010-4281-aec3-f9f58231b080")
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
