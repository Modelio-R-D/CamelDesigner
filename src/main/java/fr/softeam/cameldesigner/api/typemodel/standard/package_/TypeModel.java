/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.typemodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.CamelList;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << TypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("68c913aa-accf-4c20-a47c-7141fc4f3f7b")
public class TypeModel extends SubModel {
<<<<<<< HEAD
    @objid ("ea3f901a-bb6f-4221-8439-f51e7dd02ad3")
=======
    @objid ("36f52c90-4341-4550-b3c6-8a7d5f9a1373")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "TypeModel";

    /**
     * Tells whether a {@link TypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("dda36b9a-eeea-49a9-8039-56412f38c21c")
=======
    @objid ("00497fe6-93fd-43a2-89f0-153e901f729a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TypeModel >> then instantiate a {@link TypeModel} proxy.
     * 
     * @return a {@link TypeModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("f5d92dc3-8d5d-45c4-a0cb-211542a09cf6")
=======
    @objid ("d7fe0e9c-00c0-439c-b1c2-cab1dc02c3b6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME);
        return TypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TypeModel} proxy from a {@link Package} stereotyped << TypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TypeModel} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("77358283-7f32-4f00-9dd9-14b23e2d9be3")
=======
    @objid ("8538a72c-1688-493f-83ae-3ee71be92247")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModel instantiate(final Package obj) {
        return TypeModel.canInstantiate(obj) ? new TypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TypeModel} proxy from a {@link Package} stereotyped << TypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TypeModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("6c825c73-ad1b-46bc-94e5-3ba8e8eaf02a")
=======
    @objid ("8e0c793f-31df-4c05-8b04-819d5e1ac8eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static TypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TypeModel.canInstantiate(obj))
        	return new TypeModel(obj);
        else
        	throw new IllegalArgumentException("TypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9030d82a-c4df-4643-8578-9734aa96d0c6")
=======
    @objid ("de0770fb-4a0e-4069-a565-0dbce828134e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final TypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'valueTypes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("248fe012-9242-48aa-9d83-c29e2c202f15")
=======
    @objid ("5c269a1d-5578-4ded-8efc-81c808714ba4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addValueTypes(final ValueType obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("a9d955c2-f0bf-4707-b835-442ae542da74")
=======
    @objid ("a0b37498-6693-4f80-a916-40019bbc3e7a")
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
        TypeModel other = (TypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("aa7017b0-f428-4091-8870-212ad223603a")
=======
    @objid ("1b3fd2f6-3bf5-4189-8323-f106506090d8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("71792bb8-de59-4ac4-b61e-b3641ec9eacb")
=======
    @objid ("5d8ea280-1ede-4751-a5fc-5d7b8186dece")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<TypeModelDiagram> getDiagrams() {
        List<TypeModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (TypeModelDiagram.canInstantiate(mObj))
        			results.add((TypeModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, TypeModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("9398944e-cd18-43ad-b756-de9055f2b684")
=======
    @objid ("cb88ddbe-c830-4791-b5a5-b284be206746")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'valueTypes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f2788a9b-0666-486e-8efa-af74dcfc46e3")
=======
    @objid ("b5faa4f5-5afd-4723-85f6-cba3191730bd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<ValueType> getValueTypes() {
        List<ValueType> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CamelList.canInstantiate(mObj))
        			results.add((CamelList)CamelDesignerProxyFactory.instantiate(mObj, CamelList.STEREOTYPE_NAME));
        	if (BooleanValueType.canInstantiate(mObj))
        			results.add((BooleanValueType)CamelDesignerProxyFactory.instantiate(mObj, BooleanValueType.STEREOTYPE_NAME));
        	if (StringValueType.canInstantiate(mObj))
        			results.add((StringValueType)CamelDesignerProxyFactory.instantiate(mObj, StringValueType.STEREOTYPE_NAME));
        	if (RangeUnion.canInstantiate(mObj))
        			results.add((RangeUnion)CamelDesignerProxyFactory.instantiate(mObj, RangeUnion.STEREOTYPE_NAME));
        	if (Range.canInstantiate(mObj))
        			results.add((Range)CamelDesignerProxyFactory.instantiate(mObj, Range.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("36ee4960-89f7-4654-a899-54c943f47402")
=======
    @objid ("e06c81e8-eec9-45ea-8c03-a137c7ddc82e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("39c8827a-032f-4229-aff6-f58c762d7778")
=======
    @objid ("ef64e24f-1e79-4aec-b777-2ea46002fc78")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final TypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'valueTypes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bfadecbb-7c2a-4054-9e0b-80ba0eb32dc7")
=======
    @objid ("a7b342de-a594-4f2b-aab3-b2d33cda8f8c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeValueTypes(final ValueType obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e54c9390-e8de-41ee-b06f-ad3bfcbc7cf5")
=======
    @objid ("5a83cba8-94d6-4830-8158-c55c4b7e4cf2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("f69957a7-1bd7-48a4-b896-482a148275ca")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("18411851-2459-471e-aee6-08cc116eff7c")
=======
    @objid ("c6448dc8-245e-483b-b868-c43c0074c26a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected TypeModel(final Package elt) {
        super(elt);
    }

    @objid ("96a7120e-6c34-4aa2-95d8-e1eaa1ca16de")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("eb5b9ca1-5945-4ff3-bd5d-e1c839cef7b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2509346-b933-49e8-a530-9f9e776b8de8")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4a8d4f4-eef7-4e3f-b564-79c352d1f3a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6c49e75-d999-40cd-9365-8a6714455d1a")
=======
        @objid ("36a969a9-4b19-4197-a909-9ca007cbf5bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("acf2969e-6375-407c-a9d9-cb1a916c5bbc")
        private static Stereotype MDAASSOCDEP;

        @objid ("6375fe25-7902-430f-95af-3781100b5610")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6938035c-5236-480d-a692-ce3dfa4933f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "429103ee-a14c-4a9a-b791-6d9441fe5cf6");
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
