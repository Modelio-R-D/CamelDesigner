/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("3a044bcc-18bb-4094-81de-32b67d5d43a1")
    public static final String STEREOTYPE_NAME = "UnitModel";

    /**
     * Tells whether a {@link UnitModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << UnitModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("389dc5fe-6fbc-42ff-b661-f0ff86f86426")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << UnitModel >> then instantiate a {@link UnitModel} proxy.
     * 
     * @return a {@link UnitModel} proxy on the created {@link Package}.
     */
    @objid ("67d60598-c412-43ce-af06-cd31e255f5a3")
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
    @objid ("eab675fc-ff72-4d3c-9cc3-c7a6b08650fa")
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
    @objid ("e970e01b-7cfc-43b6-91cf-a173625b75c6")
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
    @objid ("51835afc-a9d6-42ee-abe7-afba7414e318")
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
    @objid ("36ca2ba5-3aef-4c8d-82d4-b64576a65f83")
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
    @objid ("3f3f6bd9-4f8f-4e9c-a557-4e41138c30b6")
    public void addUnits(final Unit obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("4827734e-35a8-48bf-98af-da35e1035a19")
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
    @objid ("bf4fe811-9bbd-44f8-aba6-1e3cd61b1366")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6bd7fe29-6fe1-47de-b5b6-b2a9404ea629")
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
    @objid ("4b849b09-ddbf-46fd-bad5-87fb1897ac78")
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
    @objid ("1ca3878e-8f73-4628-bc21-3fffdc07c47d")
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
    @objid ("d3fd2528-e777-421d-97e0-0401b2a66ed2")
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

    @objid ("08b444e1-9cc6-40e9-9bd5-e9a0f15cb424")
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
    @objid ("0322fff4-a720-4c0b-8c05-73d0af8d4ea3")
    public boolean removeDiagrams(final UnitModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f182af2a-491c-41a0-93cb-7d9d2d653b0c")
    public boolean removeDimensions(final UnitDimension obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("536d92fe-521c-4ec6-a518-e620ed8d71d7")
    public boolean removeUnits(final Unit obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c81c38aa-05fc-44cd-9b4b-09c8a13fa953")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("b7eeb165-293c-4ae9-adcf-85294df004a4")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getUnits());
        result.addAll(getDimensions());
        return result;
    }

    @objid ("475ea569-bba7-4093-9f57-0026b78c8726")
    protected UnitModel(final Package elt) {
        super(elt);
    }

    @objid ("fbd51035-faf8-4064-a217-af4ea824c639")
    public static final class MdaTypes {
        @objid ("722556df-895b-4884-9c74-2e24b0ff36b8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f83cc016-bd3a-476f-9721-2e42d2a6e656")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5cc22cd-ac5d-43bb-a13c-1d223d113df6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f5fc4af6-55da-48f0-8a86-5611f2e5a023")
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
