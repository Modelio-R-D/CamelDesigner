/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Feature_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6a4c36bc-3125-4731-8439-e795625943d2")
public class FeatureClass extends Feature {
    @objid ("f8a79feb-ba36-4a04-a234-fd60a45050ce")
    public static final String STEREOTYPE_NAME = "Feature_Class";

    /**
     * Tells whether a {@link FeatureClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Feature_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("55493079-b527-4232-bb10-b4bec99df86f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Feature_Class >> then instantiate a {@link FeatureClass} proxy.
     * 
     * @return a {@link FeatureClass} proxy on the created {@link Class}.
     */
    @objid ("1292567a-b39b-422c-acd3-13e04610e4f8")
    public static FeatureClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME);
        return FeatureClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("924fe8d0-75bd-43c8-929a-c22d35f734ee")
    public static FeatureClass instantiate(final Class obj) {
        return FeatureClass.canInstantiate(obj) ? new FeatureClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FeatureClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0dbde7ae-ba0c-40e7-a1ee-1eabf453d373")
    public static FeatureClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj))
        	return new FeatureClass(obj);
        else
        	throw new IllegalArgumentException("FeatureClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("80036064-eedc-4fec-bd1e-4d32788f388f")
    public void addAttributes(final AttributeAttribute obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d83d0705-8388-42e2-8514-0d27f9884c63")
    public void addSubFeatures(final FeatureClass obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("eb45caa6-d4f1-400e-93da-d7971d26bfd2")
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
        FeatureClass other = (FeatureClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9b57ec8e-8001-4ab3-a026-f17e333cccdc")
    public List<AttributeAttribute> getAttributes() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Class) this.elt).getOwnedAttribute())
        	if (AttributeAttribute.canInstantiate(mObj))
        			results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, AttributeAttribute.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9f72f18a-06b4-44d4-9901-03a395cdf0ea")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("914bcd24-5f38-49c6-8478-886f3124f91f")
    public FeatureClass getParent() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ca02e591-8c4c-4bc8-9410-d4ab3ff0c99e")
    public List<FeatureClass> getSubFeatures() {
        List<FeatureClass> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement())
        	if (FeatureClass.canInstantiate(mObj))
        			results.add((FeatureClass)CamelDesignerProxyFactory.instantiate(mObj, FeatureClass.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    @objid ("1b1cfb22-e1ce-4153-8f16-f398bef7f4bc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d3ff792f-a44d-4944-9f72-c41082fe25ec")
    public boolean removeAttributes(final AttributeAttribute obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1adea5cc-80ee-4b6d-90e3-3bef9c476399")
    public boolean removeSubFeatures(final FeatureClass obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("66751c30-5b64-45df-971a-f5d08fa01e4e")
    public void setParent(final FeatureClass obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("6f2ed08a-f287-46db-9942-1543756215e1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("deb91a4b-a820-4023-99bf-01143601b974")
    protected FeatureClass(final Class elt) {
        super(elt);
    }

    @objid ("266313b7-34b2-4846-a164-b64005a3816f")
    public static final class MdaTypes {
        @objid ("02313b66-d324-44b7-b529-78af08fe82af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19a687ce-5036-45ad-88ef-051fa2e5cfb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("640e3d87-d633-4c5e-af70-a20d19926678")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3c81d6a6-4c79-4f83-b873-0bb5f1795a88")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "babf8276-c4d4-4d86-b02b-d20c6636d937");
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
