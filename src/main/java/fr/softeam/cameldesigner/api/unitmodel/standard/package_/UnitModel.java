/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << UnitModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7988540c-148d-49c6-853a-5b32ce9e826d")
public class UnitModel extends SubModel {
    @objid ("2148850b-a041-4ddb-b29c-50a5666bf89b")
    public static final String STEREOTYPE_NAME = "UnitModel";

    /**
     * Tells whether a {@link UnitModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << UnitModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ed295a8c-6943-4835-ad65-ff97f709dc76")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << UnitModel >> then instantiate a {@link UnitModel} proxy.
     * 
     * @return a {@link UnitModel} proxy on the created {@link Package}.
     */
    @objid ("6dd3e7da-f7d2-4876-a955-c956ab60c788")
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
    @objid ("1c6c5657-88fe-4e5f-b40b-4f73dcf018cf")
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
    @objid ("673bb666-5566-4fc0-99e4-8b91a4f14c82")
    public static UnitModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (UnitModel.canInstantiate(obj))
        	return new UnitModel(obj);
        else
        	throw new IllegalArgumentException("UnitModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af32a64d-258c-4d6c-bc5f-4d3da011455f")
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
    @objid ("78395f0e-5303-4ae8-b25b-78369a93e28a")
    public void addUnits(final Unit obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("a6a2e35a-b863-498e-9f02-727be9e663cc")
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
    @objid ("db29b949-ffa9-4284-930d-09cb1e8c56f2")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0b5aa515-c299-460a-ae99-6fcee0df2845")
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
    @objid ("1c3f08a6-4bd9-4327-aaf3-d1553011283b")
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
    @objid ("2b348143-d013-4393-93da-04fe1ba541b9")
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

    @objid ("f6457f6d-a24b-4a0a-baf9-a5ab25c8e32e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10e83fa9-ee52-4b6d-b158-15163cb668be")
    public boolean removeDimensions(final UnitDimension obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b0ea666b-9ac4-4a40-846b-ca8c78dda138")
    public boolean removeUnits(final Unit obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a91b35a0-d6f2-4042-a669-555a56fb7910")
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

    @objid ("6c4ed84e-3490-492e-adae-dc09c0327209")
    protected UnitModel(final Package elt) {
        super(elt);
    }

    @objid ("fbd51035-faf8-4064-a217-af4ea824c639")
    public static final class MdaTypes {
        @objid ("19699486-72da-45c2-a311-79d6d6018bb3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11824bfc-9bc8-435d-ab86-a30826549677")
        private static Stereotype MDAASSOCDEP;

        @objid ("14a9e887-9b68-4b96-b49f-d4fe2ad91840")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26d08658-ead6-4488-ac21-58b3d81bf24d")
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
