/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d063bb98-71b4-431d-9fc8-f74f7427f7ff")
=======
    @objid ("4e3dbe11-c535-44e7-a650-ebfcba7ceded")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MmsConcept";

    /**
     * Tells whether a {@link MmsConcept proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MmsConcept >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("870f3dc5-7862-44c1-bbce-6bc7c121f209")
=======
    @objid ("a3b9674c-401e-4941-bdfa-4cce63aa59ae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MmsConcept >> then instantiate a {@link MmsConcept} proxy.
     * 
     * @return a {@link MmsConcept} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("3c5790c6-084b-4e2d-93e4-acadad7249de")
=======
    @objid ("552837d2-a2b7-4be7-a58f-90b60953b493")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c87d4469-8d7e-4703-a05b-1a0a083a94ff")
=======
    @objid ("696d9c40-bae9-4f35-bfc7-0a0bc7b56fd8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3485a144-749e-4815-8d9a-a4f5943edb88")
=======
    @objid ("3c2215b7-3a17-40ee-b3fa-186914a96eae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("adba3abf-b8a2-45e8-917a-e897c3f935ff")
=======
    @objid ("ea50b5cd-91ca-46ad-877e-f10530f1583a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ee00fc43-cc9b-425b-882a-be7f4f71cc5f")
=======
    @objid ("d807f432-a9f8-4918-8e56-1f6f8395baaf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("492ab0f8-00ce-4026-9cb9-ac18c3f7a40d")
=======
    @objid ("e0a39ba1-b9b7-4658-a84f-b8156a182c1e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addProperty(final MmsProperty obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedAttribute().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("21c21bd8-b851-4716-baf0-b4112d9cea5c")
=======
    @objid ("373bceb3-25ef-4fa3-a630-2f3d18a3d68f")
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
        MmsConcept other = (MmsConcept) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f685b33a-ea54-4907-bb32-bee03e7b9fb0")
=======
    @objid ("7f411acd-afd8-404c-b2d3-070a58429e0e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b67c2e42-bdec-45fe-8e16-f69b696138d2")
=======
    @objid ("985636c4-d12c-4c9e-8bba-4870213a494b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1f3ab176-caa2-4d01-99eb-3ccee9972c4b")
=======
    @objid ("178419a9-1ddc-44ab-9d5d-900037ea333e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4ceff038-db97-44bd-b585-2b2b065061d4")
=======
    @objid ("71078216-0cb0-4264-b068-45ee9f60fb1d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public MmsConcept getParent() {
        return (MmsConcept)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), MmsConcept.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'property' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a2dd9c4e-fd9f-40fa-a175-1217db83e53f")
=======
    @objid ("55370263-d14e-482d-b438-b4a8d66cf337")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<MmsProperty> getProperty() {
        List<MmsProperty> results = new ArrayList<>();
        for (Attribute mObj : ((Class) this.elt).getOwnedAttribute()){
        	if (MmsProperty.canInstantiate(mObj))
        			results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(mObj, MmsProperty.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("f21f9737-a128-4875-ab30-f04328b97bee")
=======
    @objid ("3033adb4-a65f-4f30-8623-b64e20dacb80")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a2de40e8-2f4f-4c3b-98c8-92290fb361af")
=======
    @objid ("5e5fcf02-dfc8-4ef0-b9a9-a137f64118ce")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConcept(final MmsConcept obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'instance' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("923bc0dc-fa48-4396-b3d2-cb1e114615cc")
=======
    @objid ("76b2a7f3-4066-4831-82f2-b0e865308a62")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeInstance(final MmsConceptInstance obj) {
        return (obj!=null)? ((Class) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'property' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9e31f227-a4af-4b2c-bd5e-e4b2d99b3a15")
=======
    @objid ("6aa60f83-4f72-48ca-ab00-3e49cf5a73c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeProperty(final MmsProperty obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("62e27ea6-3244-45e8-87af-f781fd76f0e6")
=======
    @objid ("8c1b3cae-d0b2-435e-a113-ab18a5e74783")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("f469ea63-a182-4c29-91fd-4fa05625a0f2")
=======
    @objid ("97cafde1-ebf7-4346-a2ec-a5a0a8800514")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MmsConcept(final Class elt) {
        super(elt);
    }

    @objid ("acc006aa-96cd-4009-abc5-630b360acd1a")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("1dc7637b-9788-44b5-922b-0602d7b7c9f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9321c6a-df97-4ede-acd1-181aa9515509")
        private static Stereotype MDAASSOCDEP;

        @objid ("27c984e1-699e-4fa8-b33e-0a6b60d7c724")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54497688-23df-4bbe-b8b6-89f8605b8b73")
=======
        @objid ("0745d793-f2c3-46f4-acf1-2745d54d95fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("14566c5b-28e8-4ad8-b8ae-0d442b643161")
        private static Stereotype MDAASSOCDEP;

        @objid ("067ea0c5-c200-4c5d-94bf-7083c85aa93d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eabb6ae4-6e96-40ae-b69d-6ae57db73e39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
