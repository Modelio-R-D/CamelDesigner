/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MmsConcept >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("87827b52-a413-4f8b-ac16-cf56568d032b")
public class MmsConcept extends MmsObject {
    @objid ("3b9ce038-6ed9-4442-815f-0a65d512e539")
    public static final String STEREOTYPE_NAME = "MmsConcept";

    /**
     * Tells whether a {@link MmsConcept proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MmsConcept >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("66a3a4d6-092c-4897-a516-806bf761bad6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MmsConcept >> then instantiate a {@link MmsConcept} proxy.
     * 
     * @return a {@link MmsConcept} proxy on the created {@link Class}.
     */
    @objid ("320703e4-11a6-4571-a38f-b11d17df8565")
    public static MmsConcept create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME);
        return MmsConcept.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MmsConcept} proxy or <i>null</i>.
     */
    @objid ("e29165ba-f615-40d4-8766-35cdaf3f6a39")
    public static MmsConcept instantiate(final Class obj) {
        return MmsConcept.canInstantiate(obj) ? new MmsConcept(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MmsConcept} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ccb4d37-c6e4-47a6-9f83-d9347ab0b2d4")
    public static MmsConcept safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MmsConcept.canInstantiate(obj))
        	return new MmsConcept(obj);
        else
        	throw new IllegalArgumentException("MmsConcept: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("53363c0b-0f46-42af-87c5-07a9348293f1")
    public void addConcept(final MmsConcept obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f041f769-f8de-4f4a-b311-87517b3a3916")
    public void addInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c557c0c7-8967-48ed-ad7c-d714266fde87")
    public void addProperty(final MmsProperty obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("cf8ac39a-5053-4f84-896f-3aa3d09abc5a")
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
        MmsConcept other = (MmsConcept) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("01340eaa-0de8-432f-b6e1-452a7f4565a6")
    public List<MmsConcept> getConcept() {
        List<MmsConcept> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (MmsConcept.canInstantiate(mObj))
        			results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(mObj, MmsConcept.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e5b9c85b-4bfb-4a2f-90b7-74d658ce987f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("64b262f8-3520-46cc-9075-96a995439680")
    public List<MmsConceptInstance> getInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Instance mObj : ((Class) this.elt).getDeclared()){
        	if (MmsConceptInstance.canInstantiate(mObj))
        			results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(mObj, MmsConceptInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("488ebf7d-8043-4161-9cba-83ff40d955a7")
    public MmsConcept getParent() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eef6d16c-98cd-4132-b199-9667bbf68d0e")
    public List<MmsProperty> getProperty() {
        List<MmsProperty> results = new ArrayList<>();
        for (Attribute mObj : ((Class) this.elt).getOwnedAttribute()){
        	if (MmsProperty.canInstantiate(mObj))
        			results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(mObj, MmsProperty.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("5ff09719-ac29-4460-adfb-1a6b76bc4e2b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76fd0aea-efb4-4089-a717-f554044ec978")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f25c4c27-1d17-4c64-9986-2a1c98f789e4")
    public boolean removeInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Class) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d9df61b0-d3cc-47ed-8d8f-54ba884061c5")
    public boolean removeProperty(final MmsProperty obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1b466149-29f9-41ce-90a5-54480c675dc6")
    public void setParent(final MmsConcept obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("28252700-55c5-4e4a-8988-94590ed4933e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getConcept());
        result.addAll(getProperty());
        result.addAll(getInstance());
        return result;
    }

    @objid ("13c70055-981c-4adc-812b-183a07762017")
    protected MmsConcept(final Class elt) {
        super(elt);
    }

    @objid ("acc006aa-96cd-4009-abc5-630b360acd1a")
    public static final class MdaTypes {
        @objid ("35eeabd9-bb11-430e-8eab-5cf0deb09f0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ec187c5-ee68-4820-ab32-17626e499952")
        private static Stereotype MDAASSOCDEP;

        @objid ("e4e812de-95be-4400-b175-b51b203383ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c225442e-4d5b-48b6-9a46-007ec6ea5da1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f3091ee-3a3b-4157-8b89-872f99b970f9");
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
