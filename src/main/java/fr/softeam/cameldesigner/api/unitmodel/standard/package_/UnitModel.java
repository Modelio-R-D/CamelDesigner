/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.package_;

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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
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
 * Proxy class to handle a {@link Package} with << UnitModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7988540c-148d-49c6-853a-5b32ce9e826d")
public class UnitModel extends SubModel {
<<<<<<< HEAD
    @objid ("b17eb7da-85a8-441e-b758-471585132fac")
=======
    @objid ("920c16e5-0293-4ad7-a671-96a184f28546")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "UnitModel";

    /**
     * Tells whether a {@link UnitModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << UnitModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("9fd40e63-020c-4022-af55-b5977a11611b")
=======
    @objid ("d0a43ca3-f7e4-4960-a52d-1ddcbe7f7eda")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << UnitModel >> then instantiate a {@link UnitModel} proxy.
     * 
     * @return a {@link UnitModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("8c8c516c-2af7-4265-b6b8-e69b43ba52f8")
=======
    @objid ("9f8bd1fe-678e-4854-8f31-fbc9452eb99b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME);
        return UnitModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link UnitModel} proxy from a {@link Package} stereotyped << UnitModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link UnitModel} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("7e06b549-85d7-48b7-8fd9-849a192ab2b2")
=======
    @objid ("451d24b7-d8ab-468d-84eb-4dba862cf303")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModel instantiate(final Package obj) {
        return UnitModel.canInstantiate(obj) ? new UnitModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitModel} proxy from a {@link Package} stereotyped << UnitModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link UnitModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("50b3d1ff-b918-4bf5-a430-62d34a2bd872")
=======
    @objid ("1e8c9d11-de73-4586-b3f1-2a86a5b34aa0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static UnitModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (UnitModel.canInstantiate(obj))
        	return new UnitModel(obj);
        else
        	throw new IllegalArgumentException("UnitModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9dc52e4e-bda0-4688-bd66-34b91fc90192")
=======
    @objid ("7c8344c7-d139-43a1-99af-b28420b9c1d1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDiagrams(final UnitModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("911f99b3-1a53-4b37-8bc3-d7a9b7098e21")
=======
    @objid ("48b17195-c194-4a4b-8f5c-b4a03862967c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addDimensions(final UnitDimension obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'units' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9f5a3ece-ab77-4a74-b989-8e77317eea55")
=======
    @objid ("2166d00b-7319-4371-8b7c-7d2da4a3456e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addUnits(final Unit obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("0919ea7e-ddc4-4b0f-ba7e-2f088a89201a")
=======
    @objid ("53a4acf5-2bf1-4291-8280-a00b1319a0fb")
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
        UnitModel other = (UnitModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("026e322d-c769-4d6d-af2a-3dd220297750")
=======
    @objid ("3d0dcfff-1483-4816-a21b-33033413016d")
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
    @objid ("bffd8440-45cd-4d6c-add3-6961dea52234")
=======
    @objid ("a052b5d4-6520-4d8d-817f-b44a980cac4e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<UnitModelDiagram> getDiagrams() {
        List<UnitModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (UnitModelDiagram.canInstantiate(mObj))
        			results.add((UnitModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, UnitModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5528f796-559b-493f-88eb-6bc3503aa725")
=======
    @objid ("4091c1ff-5fda-4d29-8dd7-e1328cd9953b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<UnitDimension> getDimensions() {
        List<UnitDimension> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (UnitDimension.canInstantiate(mObj))
        			results.add((UnitDimension)CamelDesignerProxyFactory.instantiate(mObj, UnitDimension.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d5ba52bd-3b4a-4629-9e38-4eb9e0328176")
=======
    @objid ("2acf4c77-71dc-4252-97df-79199dc0814b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'units' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("0a10478c-0028-4655-bce1-c7ad633fb4ba")
=======
    @objid ("ebe68d77-f060-4d92-a758-23b5a08bd4a2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Unit> getUnits() {
        List<Unit> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SingleUnit.canInstantiate(mObj))
        			results.add((SingleUnit)CamelDesignerProxyFactory.instantiate(mObj, SingleUnit.STEREOTYPE_NAME));
        	if (CompositeUnit.canInstantiate(mObj))
        			results.add((CompositeUnit)CamelDesignerProxyFactory.instantiate(mObj, CompositeUnit.STEREOTYPE_NAME));
        	if (Dimensionless.canInstantiate(mObj))
        			results.add((Dimensionless)CamelDesignerProxyFactory.instantiate(mObj, Dimensionless.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("412049c8-b8ce-4121-8a59-07abedfb7664")
=======
    @objid ("01bdd23a-daf4-4d4a-a860-d1371568f0a2")
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
    @objid ("4a39c6fe-ffb4-4324-8044-2af9cba023dc")
=======
    @objid ("e1d217cd-b64e-4c77-9df9-ff4f017d20e8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final UnitModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bab29a12-c902-44d8-806f-f38903fffb6f")
=======
    @objid ("1f8c1728-c54b-4221-a2e3-73c0f86b9459")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDimensions(final UnitDimension obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'units' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("4d4e9e3e-d372-4c5f-82f6-36d8909904d9")
=======
    @objid ("16b84749-d185-4073-b616-00144ff905ef")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeUnits(final Unit obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8d21dbcd-ce8b-41c4-a87c-25c3b12924e2")
=======
    @objid ("8ed74182-896b-40cc-b616-b186b881ca11")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("b7eeb165-293c-4ae9-adcf-85294df004a4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("203b22d2-94b2-49ed-8b79-e56ee60ad7bf")
=======
    @objid ("ce7aa794-784f-4f08-8c84-0ef482b46340")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected UnitModel(final Package elt) {
        super(elt);
    }

    @objid ("fbd51035-faf8-4064-a217-af4ea824c639")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("5ff21313-3a53-476b-9ee5-e36932859777")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abb82dce-6ee9-4534-a706-06923c0ba59d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e5b57a25-8f46-40a1-a9d2-815f0b2074e0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffc6450a-904e-4982-9881-e4ba56e5d03d")
=======
        @objid ("0efadca7-b3c7-41df-89f3-a71f5c5075e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("387d20de-1701-4299-9c62-cd1ea92a5fd8")
        private static Stereotype MDAASSOCDEP;

        @objid ("8852dc6f-f38b-4298-938e-8f2b3392c9e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3f7321cb-0552-4ddd-8caa-23d430f44d27")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59acf7f4-2a84-41d4-8fcb-ec300340062c");
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
