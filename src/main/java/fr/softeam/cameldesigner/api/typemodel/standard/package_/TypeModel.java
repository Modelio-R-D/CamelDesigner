/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("469af560-d940-410a-ba56-19204c85e674")
    public static final String STEREOTYPE_NAME = "TypeModel";

    /**
     * Tells whether a {@link TypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a71492ef-7409-4be3-ae33-4c86a4bac0ea")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TypeModel >> then instantiate a {@link TypeModel} proxy.
     * 
     * @return a {@link TypeModel} proxy on the created {@link Package}.
     */
    @objid ("309f8671-d295-4ad6-a9ad-0232fbb7f9ab")
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
    @objid ("b7165e2b-c53d-4f9f-b9fc-b3106c01c15e")
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
    @objid ("3eaaa709-8849-48ac-81a8-dea077844f20")
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
    @objid ("144d5e4f-fff6-411e-ad5a-6393f5f00306")
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
    @objid ("453f9c2f-320b-4715-a049-aa66d14fa79a")
    public void addValueTypes(final ValueType obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("32dee397-8230-4fe2-81f1-6772db704bc1")
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
    @objid ("83d67e76-4034-442c-bce0-caad1c17204f")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c29f91b7-7528-42b8-8e55-b333c1d860d9")
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
    @objid ("109b3ebd-9b68-4559-a021-cd78d6fc62f8")
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
    @objid ("53cace3c-5e5d-499b-afbb-4a8f3e5985e4")
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

    @objid ("ff1bc1e6-0880-4ee9-81fa-ffb5d878d4d8")
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
    @objid ("28cd7e4c-720e-474e-bd30-9ecb4ef4f466")
    public boolean removeDiagrams(final TypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'valueTypes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("09475856-c3f4-4ff8-8284-049a140b500b")
    public boolean removeValueTypes(final ValueType obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4220c73b-bb80-4f84-b882-e9d61127a8f5")
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

    @objid ("82c4d004-341f-4b0e-b9d2-d802f96af2d4")
    protected TypeModel(final Package elt) {
        super(elt);
    }

    @objid ("96a7120e-6c34-4aa2-95d8-e1eaa1ca16de")
    public static final class MdaTypes {
        @objid ("ffd6777d-e19a-4e29-8ec6-b3227ad29c38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a823a5cb-b2db-4f56-917f-fe1e8731f409")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c35e790-8d04-4d54-bd6a-72e5af12b229")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4b20cbc-8bbc-4ff6-aa8d-90ba94398d44")
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
