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
<<<<<<< HEAD
    @objid ("6ec4e8b6-81d3-41b8-a26b-82fc12a49ced")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("954b43a7-58b3-4647-a7d8-2655e7ded4e3")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("79a0fffc-9e2a-4176-be7c-0c16a9a5156d")
=======
    @objid ("b1da9a14-4bb3-4f25-8477-3ccfd629f1b7")
    public static final String STEREOTYPE_NAME = "UnaryEventPattern";

    @objid ("1813a63b-3d2c-4f4c-9283-6cf949c9c3fc")
    public static final String OCCURRENCENUM_TAGTYPE = "occurrenceNum";

    @objid ("c86dcbb4-b312-461e-86f8-97586ad13760")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String OPERATOR_TAGTYPE = "operator";

    /**
     * Tells whether a {@link UnaryEventPattern proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << UnaryEventPattern >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("39e4d6be-bfa9-4f0f-8fb9-2d7d9f5c6237")
=======
    @objid ("fce92eb2-1126-4408-acde-d42ac111946b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnaryEventPattern.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << UnaryEventPattern >> then instantiate a {@link UnaryEventPattern} proxy.
     * 
     * @return a {@link UnaryEventPattern} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("8e4b16c6-9699-466f-82b9-2c7eea2be5a1")
=======
    @objid ("690f7a13-1d9a-4043-88d1-23ca544f3987")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0e82df99-c977-48cf-b86b-da795304dd78")
=======
    @objid ("af35813b-249f-45ff-a691-eb3b94b06fb0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1e56ba92-eadd-441b-a046-beb09e7008e3")
=======
    @objid ("a7877e52-12b9-40ae-be72-a713b1f1d3ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnaryEventPattern safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (UnaryEventPattern.canInstantiate(obj))
        	return new UnaryEventPattern(obj);
        else
        	throw new IllegalArgumentException("UnaryEventPattern: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("2f416395-3010-4124-9fb9-af4dbbaf5c89")
=======
    @objid ("964c9a31-4729-464e-90a4-c02b94efb30e")
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
        UnaryEventPattern other = (UnaryEventPattern) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("0dfdbd97-fef8-4113-a6d4-ee33c92b5a57")
=======
    @objid ("8e05209a-c84c-4af3-ad8b-786dacd9522e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0159893d-c33d-4342-bd07-b8e910da35a6")
=======
    @objid ("444c1d4f-4571-4455-8290-86db6f2f168a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5e3f16e7-3918-49fc-ad3b-a0febde2e2dc")
=======
    @objid ("2b72e96c-4fce-49b7-b97b-743e333d998e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOccurrenceNum() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("697a41cf-757c-41fe-a25d-9e6cca01ef3e")
=======
    @objid ("7fbad2e2-ce2e-4960-b689-25f39c26d8a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOperator() {
        return this.elt.getTagValue(UnaryEventPattern.MdaTypes.OPERATOR_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("c108f90b-63a3-4b5f-a7d9-ef084e1f9e9b")
=======
    @objid ("59d47442-2ccc-48cd-ab69-e1feccd3d3ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("778f3e8e-4222-437f-ab66-74b5d1999f89")
=======
    @objid ("f72a204e-4379-440f-b5af-bc9fa5fda5de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("21bc61f1-100e-4aab-9f1b-1817105f0816")
=======
    @objid ("662a7607-51fd-4104-9a9b-880ee4e7d9ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOccurrenceNum(final String value) {
        this.elt.putTagValue(UnaryEventPattern.MdaTypes.OCCURRENCENUM_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a213c09e-96bd-4b7f-8d37-969be8ba7b3e")
=======
    @objid ("6018381d-81b4-4b01-ab46-7fe27639d275")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("3f18c508-3fc1-49e2-aab4-c59d17b1799a")
=======
    @objid ("3c741df6-013f-43fc-b535-5a753a6eadd0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UnaryEventPattern(final Class elt) {
        super(elt);
    }

    @objid ("a301d6fd-1e9f-4328-a7ee-80b97952f165")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e8a5296a-9257-4878-9999-d29075bf1d6c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("983ef74e-6757-465d-a7f0-dcc285838100")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("6bf758b3-a83d-496a-9519-d123fc69eafe")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("e19b0e0f-fd56-4813-9bcb-7a10c03d693c")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb7e1e37-6866-4e2a-8e64-242698eeea9a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b7c1ccc-d03e-45c7-a6d8-3dceb4f58975")
=======
        @objid ("c53e4d02-fe9c-4257-b954-1abc53aa917b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8066cd65-ac7a-460e-9861-ed046faa05fa")
        public static TagType OCCURRENCENUM_TAGTYPE_ELT;

        @objid ("40d3de77-86ce-4325-a38e-e2e7d8ec0894")
        public static TagType OPERATOR_TAGTYPE_ELT;

        @objid ("53986ced-93d2-4cff-a61b-36b021d0db71")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdb5c4ac-decc-42fe-ab0d-f1b44743c91d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0418099f-f7b9-48c4-84ad-15d25b9c49c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
