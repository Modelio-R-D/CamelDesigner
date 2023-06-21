/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("3c515e37-b43d-49de-a337-a86daf2b1783")
    public static final String STEREOTYPE_NAME = "TypeModel";

    /**
     * Tells whether a {@link TypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c5004f69-0a20-4eec-b005-8d3de6ed9d5e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TypeModel >> then instantiate a {@link TypeModel} proxy.
     * 
     * @return a {@link TypeModel} proxy on the created {@link Package}.
     */
    @objid ("12f45ddf-8dbf-49e0-8062-0dbd8ffd13f6")
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
    @objid ("471b67eb-958c-496c-96c9-5c11afdfb2b4")
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
    @objid ("29658388-f631-42f2-a22f-27693a258552")
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
    @objid ("80266a7a-7e18-4d67-acc2-67384d43415a")
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
    @objid ("7e4db666-4139-4437-b113-600ddcfacda5")
    public void addValueTypes(final ValueType obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("9ba6ab5a-d3a7-422c-b71c-35751ef53009")
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
    @objid ("0149878b-1970-45f3-9c3a-8b79e2cf67f5")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55a21d6e-69c1-4c8c-af87-ef7d95f4ca94")
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
    @objid ("9b545905-6711-4d2a-8adf-22903438ecbe")
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
    @objid ("c38f7ae9-00e0-42c2-985f-1b20dc38d00f")
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

    @objid ("2e327e5b-b6fc-4af6-80eb-af1f43108960")
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
    @objid ("7c7a8925-dcce-4cbd-aa09-7d9248b709de")
    public boolean removeDiagrams(final TypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'valueTypes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2d47afb2-9566-4dd1-a896-b5e84f1f3535")
    public boolean removeValueTypes(final ValueType obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("36cc78cd-0e0c-4902-aed2-0ab15e478dc0")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("f69957a7-1bd7-48a4-b896-482a148275ca")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getValueTypes());
        return result;
    }

    @objid ("815c46e4-53b2-4c14-a254-3f50543b70cf")
    protected TypeModel(final Package elt) {
        super(elt);
    }

    @objid ("96a7120e-6c34-4aa2-95d8-e1eaa1ca16de")
    public static final class MdaTypes {
        @objid ("37180f8d-c6b8-44e2-95de-3df4d4f282be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("236e3806-7a9e-48c8-9d71-a8f908975734")
        private static Stereotype MDAASSOCDEP;

        @objid ("10fa7968-a72b-4a3f-8cf4-d990089ca75d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("769aa881-fa0c-4b78-ac7b-a1c52b168638")
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
