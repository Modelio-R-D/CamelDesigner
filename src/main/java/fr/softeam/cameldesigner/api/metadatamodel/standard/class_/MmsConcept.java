/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("0c0e9ac7-c63b-4130-8928-9ef931a9edc6")
    public static final String STEREOTYPE_NAME = "MmsConcept";

    /**
     * Tells whether a {@link MmsConcept proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MmsConcept >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("df9ef8ae-5651-4bf2-96d1-45318c11023a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MmsConcept >> then instantiate a {@link MmsConcept} proxy.
     * 
     * @return a {@link MmsConcept} proxy on the created {@link Class}.
     */
    @objid ("b7711061-0989-44d7-801f-bf6503a60162")
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
    @objid ("1e290c4c-4dfc-45dc-bbab-8f7cf3c00902")
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
    @objid ("78fa0519-85bf-4410-b90a-3eea7ec2a20d")
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
    @objid ("4906a20c-1ff4-4e1e-93ec-4e1f705fe07b")
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
    @objid ("69a99b4c-918d-40dc-a50c-35f4b8b0e58f")
    public void addInstance(final MmsConceptInstance obj) {
        if (obj!=null)
          ((Class) this.elt).getRepresenting().add(obj.getElement());
    }

    /**
     * Add a value to the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f23a9631-fa5b-4ce4-8344-971c4b51a837")
    public void addProperty(final MmsProperty obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("7f627f02-4864-40f9-81d8-61630859b42c")
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
    @objid ("8d2c8955-8300-44b5-9a21-67677f50f52b")
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
    @objid ("602f7c38-7b14-4f4b-9d0f-72809c79078a")
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
    @objid ("6d224df5-9e97-44a4-a064-0621636551c6")
    public List<MmsConceptInstance> getInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Instance mObj : ((Class) this.elt).getRepresenting()){
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
    @objid ("8da81f8f-8e13-4412-87f7-750aabe542fc")
    public MmsConcept getParent() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("81042972-6fc2-4722-bec8-8c86fbe60d60")
    public List<MmsProperty> getProperty() {
        List<MmsProperty> results = new ArrayList<>();
        for (Attribute mObj : ((Class) this.elt).getOwnedAttribute()){
        	if (MmsProperty.canInstantiate(mObj))
        			results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(mObj, MmsProperty.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("3efeddb0-5c98-40e3-8b43-d13ef24e236f")
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
    @objid ("fcfb184b-2f67-4b48-b1a2-258f73a89e8b")
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a4cc235-e99f-49a1-8a6b-a84c5e5fff61")
    public boolean removeInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Class) this.elt).getRepresenting().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'property' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a64aa0d7-3d74-4cee-9d14-cf788ac28240")
    public boolean removeProperty(final MmsProperty obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6bbe9c44-f4e1-4755-beed-d1fda7e57cb8")
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

    @objid ("9799821e-0ea2-437a-b67e-c236b73d1094")
    protected MmsConcept(final Class elt) {
        super(elt);
    }

    @objid ("acc006aa-96cd-4009-abc5-630b360acd1a")
    public static final class MdaTypes {
        @objid ("058dfc84-c341-45f4-8556-c315e952ab39")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e12e9b2-2c34-4bb4-8cb8-33da3cefb460")
        private static Stereotype MDAASSOCDEP;

        @objid ("76b25ac9-1dbd-4090-8671-eeb480d0b720")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6429fc6b-deb7-44c6-88c8-44ea9517422c")
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
