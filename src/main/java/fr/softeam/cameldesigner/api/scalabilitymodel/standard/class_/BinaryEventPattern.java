/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("97b5bb18-e941-4e7f-80ca-1ffc79767069")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("1d35b1b9-a658-44b5-9ca9-f2263c2a4d98")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("3492eb21-2aa4-4ba8-b761-c2a76e6026df")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("b8029f52-4a38-4133-a41d-28413bd12baf")
=======
    @objid ("c107c7d6-4e31-400d-9d92-1167989cc08e")
    public static final String STEREOTYPE_NAME = "BinaryEventPattern";

    @objid ("ea43e5ca-60d3-4f1a-b9cd-f445d7a4e701")
    public static final String LOWEROCCURRENCEBOUND_TAGTYPE = "lowerOccurrenceBound";

    @objid ("0eaed07e-8283-4524-b120-7428e55700d7")
    public static final String OPERATOR_TAGTYPE = "operator";

    @objid ("fd27d816-6d3f-40d5-933e-7176d6506fdb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String UPPEROCCURRENCEBOUND_TAGTYPE = "upperOccurrenceBound";

    /**
     * Tells whether a {@link BinaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << BinaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("25803b35-d1fe-4361-a9c9-9e944d90337e")
=======
    @objid ("4538e751-3f69-4f7b-9c25-5b84cc306faf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, BinaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << BinaryEventPattern >> then instantiate a {@link BinaryEventPattern} proxy.
     * 
     * @return a {@link BinaryEventPattern} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("88c1c9de-4de8-4788-aa4b-a75f6e771a19")
=======
    @objid ("6a8b1949-9ddc-4842-81b4-2a2246c8763b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bcf25c19-b118-45f9-bb6c-b517b0e07517")
=======
    @objid ("4bb20519-4bc1-47fb-8060-84ad47ec4304")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e0dcebb3-3f6b-49b9-8bb2-a7f5a39608f8")
=======
    @objid ("6f278a3a-dfd0-41bb-8133-46a8e82fb8c9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static BinaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (BinaryEventPattern.canInstantiate(obj))
        	return new BinaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("BinaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("73e4589c-aaa6-4f0f-b8f7-435b225c878a")
=======
    @objid ("4cce6ae0-bac9-481a-ba0a-d30f3ee6732d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7e55b77d-886c-44c3-8b27-726c8771d4cd")
=======
    @objid ("ff0dcceb-6f5b-4f1f-8bae-e4b5e25cd04c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d6432fce-afb5-433a-8717-2212c1f2cdf4")
=======
    @objid ("e81f9e1d-0f7c-4ff2-855e-76245df98d94")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("45b96fb2-9710-45b8-8c9c-de918d816300")
=======
    @objid ("0ce69994-01c0-4fb9-a36c-01a64a25b1d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLowerOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4d16e2dd-38b3-4726-9678-be7792bc3815")
=======
    @objid ("55af1687-b906-414f-a3db-e6735baa9368")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOperator() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7d316b23-edec-4279-9368-774f7a291d4d")
=======
    @objid ("b03140f9-dcf3-4ac7-96c1-311bda1cf9d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4d4470b8-afeb-451d-944b-839715a0c9a5")
=======
    @objid ("809083a2-4efa-4b4d-a8c0-e1afb3e59c67")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUpperOccurrenceBound() {
        return this.elt.getTagValue(BinaryEventPattern.MdaTypes.UPPEROCCURRENCEBOUND_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("074d738f-6e90-4f41-9fad-59fa36108e4e")
=======
    @objid ("af9a90a3-3fa7-41aa-92cd-cce517df1c26")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("855926fd-a22f-4929-9fde-af7699b67dcd")
=======
    @objid ("596f7a08-bce9-4d1f-a167-5e9c501be096")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0d1f0b4c-d7ba-4a4a-9830-4f34c5b80618")
=======
    @objid ("4ff53ca6-9cd8-4ea0-bd42-966b4f8d40f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLowerOccurrenceBound(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.LOWEROCCURRENCEBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3639734e-78bd-4660-88e5-2115636f2efb")
=======
    @objid ("24c2f454-0f2b-429a-9574-c8692bd92587")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOperator(final String value) {
        this.elt.putTagValue(BinaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'rightEvent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("091fb143-fdbd-44c0-b8cf-6c204312c682")
=======
    @objid ("e5508dc9-ba73-40b1-a411-9a7893b0219e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f68148b9-01da-4bad-9486-5d2cb6fc1f9c")
=======
    @objid ("7bf4df6c-476f-482e-a8a4-7d9c5eb48d7e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("dc626ce7-93a2-4d35-a239-f80ca87968bf")
=======
    @objid ("6f050d33-2154-4c2d-a5c6-1023f3b0df95")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected BinaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("557dc2d3-3a32-40be-a1c9-31aad96680de")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("7317512a-dd63-4fbb-81b8-fedcb9731369")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("86d429ae-595f-4e9c-98d9-9a088eb411c7")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("0a51c16d-9318-4b45-9f9a-1cbdfdf26c74")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("a943588b-0662-4113-9566-7e43515760bb")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("49888afa-8664-4e8f-ae63-91a2faca3394")
        private static Stereotype MDAASSOCDEP;

        @objid ("181f58dc-42bc-48b1-a675-0c6115af4aab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5621c016-1c95-41e8-a09a-0cfc51c0a06d")
=======
        @objid ("f80f92bc-5b78-4438-8554-e04efecf8e8a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("844230a1-7e6b-4da6-84f3-35d8c93cc4c5")
        public static TagType LOWEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("d593018c-5dfe-43c1-b6d1-cef7e997db12")
        public static TagType UPPEROCCURRENCEBOUND_TAGTYPE_ELT;

        @objid ("ebbedfbe-faa4-4a2e-99ef-573da2ed39bb")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("b1314d47-d882-44ce-b5a4-293e85c38ea1")
        private static Stereotype MDAASSOCDEP;

        @objid ("308d0703-9d9b-4079-b396-2d92edc735ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1bc3eddf-6b6e-42d8-ac1e-7628637c0a0a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
