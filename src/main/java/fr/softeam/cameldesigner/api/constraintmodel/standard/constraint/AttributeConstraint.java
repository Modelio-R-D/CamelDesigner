/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << AttributeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad18d989-4bc1-47c9-9b74-61ab5b5e050f")
public abstract class AttributeConstraint extends UnaryConstraint {
<<<<<<< HEAD
    @objid ("197112d6-55d5-4448-84fc-86222b19484b")
=======
    @objid ("a381ced4-bb74-4f0e-a531-86b2cbbe830a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "AttributeConstraint";

    /**
     * Tells whether a {@link AttributeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << AttributeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("28d41c24-3946-418a-a229-86793a4c8bb0")
=======
    @objid ("a4a556f6-b006-4a49-9cc9-024b3c5b0220")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeConstraint.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("7c04dfbe-c0db-4593-9c97-f6c56dc30636")
=======
    @objid ("ff73dbd8-5885-4bf3-9434-930d048c225b")
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
        AttributeConstraint other = (AttributeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'attributeContext' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7eb6dbf6-6906-4673-b420-23b95576b57a")
=======
    @objid ("e9e1da31-c805-4f77-995d-e3d09d83fbd4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public AttributeContext getAttributeContext() {
          for (Class obj : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (AttributeContext.canInstantiate(obj))
             return (AttributeContext)CamelDesignerProxyFactory.instantiate(obj, AttributeContext.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d0cbfc0b-0417-41d2-b25b-ecf71e162279")
=======
    @objid ("9a09a849-66d1-4eee-a156-ddf33dd59029")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

<<<<<<< HEAD
    @objid ("7c9596fc-5c56-4ac7-94ca-3e1dc0b5bd85")
=======
    @objid ("ff042021-bfb7-49f6-9d56-adc4567e9bb9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'attributeContext' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f64c1ace-e5ff-4ae2-b481-42a1cfce1b4f")
=======
    @objid ("f32e5799-7fd2-4a49-92d1-66f4646cd77a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setAttributeContext(final AttributeContext obj) {
        // Remove existing AttributeContexts
        for (Class e : ((Constraint) this.elt).getConstrainedElement(Class.class)) {
           if (AttributeContext.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the AttributeContext
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    @objid ("9af91a7e-e9b8-4b58-913e-778a9a16ec86")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("7feab249-e921-4f16-b612-84ff152e071a")
=======
    @objid ("1b0b85db-7540-42aa-b75e-853fabab0a3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected AttributeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("d22fc638-bd9d-4514-a93a-6f08c279f3bd")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("c4a5a584-28ca-45c1-a9f0-5e08bab4492c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ecaf65fb-4b2b-49d0-a3d5-17c68c43255c")
        private static Stereotype MDAASSOCDEP;

        @objid ("03600ece-c037-4862-aa1f-fdabdd83296a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04f1b3b8-1466-4c3b-973f-cf7c2f2a6d20")
=======
        @objid ("77b70f1f-4965-4d7c-88dc-beacdd8eaedd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("008f7c7a-2f70-47a2-8e57-1f39fde3e91d")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d6a094b-d0c3-41d3-9d3b-81d9d3e243ff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c8cd6d0-a453-4a2d-bf08-3b862603006d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "310d656e-d693-4ec1-b186-66894464b4b3");
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
