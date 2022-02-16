/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << Attribute_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c17a90da-4027-4328-abbc-1c1e75b596e7")
public class AttributeAttribute extends CamelAttribute {
    @objid ("59a2a461-0fd5-41a3-98bf-bb5207cf7c1b")
    public static final String STEREOTYPE_NAME = "Attribute_Attribute";

    /**
     * Tells whether a {@link AttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Attribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7f1ba620-8c35-4814-96a4-a73a2e9e3501")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Attribute_Attribute >> then instantiate a {@link AttributeAttribute} proxy.
     * 
     * @return a {@link AttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("daad7939-de23-41eb-8890-8d391ceea1ca")
    public static AttributeAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, AttributeAttribute.STEREOTYPE_NAME);
        return AttributeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link AttributeAttribute} proxy from a {@link Attribute} stereotyped << Attribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link AttributeAttribute} proxy or <i>null</i>.
     */
    @objid ("33ce0ddd-8c43-421e-ab04-71fdd4882058")
    public static AttributeAttribute instantiate(final Attribute obj) {
        return AttributeAttribute.canInstantiate(obj) ? new AttributeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link AttributeAttribute} proxy from a {@link Attribute} stereotyped << Attribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link AttributeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de52db3c-4de6-4726-86e7-0bf5ee402f7e")
    public static AttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (AttributeAttribute.canInstantiate(obj))
        	return new AttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("AttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("182b5998-66c3-4234-b4ad-9373bf265089")
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
        AttributeAttribute other = (AttributeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("cfd94624-10c0-4475-93da-f77e45a5bace")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0a383aec-bb83-4f4e-850d-3e92608024ef")
    public FeatureClass getParent() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Attribute) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

    @objid ("a17036c8-6df8-438a-94f5-dc75fc983d45")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0241d6de-a524-4e19-ad22-00330dc05948")
    public void setParent(final FeatureClass obj) {
        ((Attribute) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("d4352f29-8cd2-4305-8e91-d3f6b9165362")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("42387688-4393-443e-a698-b34ac0e91e1d")
    @Override
    public String getValue() {
        return this.getElement().getValue();
    }

    @objid ("26176158-a2ce-4576-a6af-9039f9bc4e86")
    @Override
    public void setValue(String value) {
        this.getElement().setValue(value);
    }

    @objid ("64928e6a-65b3-4d4d-b6dc-8f28ad96cce9")
    protected AttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("f558a895-629e-4294-9127-c70f14d14fce")
    public static final class MdaTypes {
        @objid ("4682006f-75de-46ee-b388-43be0886f7a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("526fd343-4083-4163-85f3-b0b76ab6d2a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ea9f7e6-8e97-4997-9b7f-065e2c534dea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3bce4168-5502-4098-8087-803d3a89f60f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02d333e9-0603-47b3-87bb-b2a311cc65dd");
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
