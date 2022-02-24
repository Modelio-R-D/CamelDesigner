/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("02d190e5-6e36-42f0-97b2-01e543373f8f")
    public static final String STEREOTYPE_NAME = "UnitModel";

    /**
     * Tells whether a {@link UnitModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << UnitModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("afad90dd-25be-4f5e-817a-68b587401f4b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << UnitModel >> then instantiate a {@link UnitModel} proxy.
     * 
     * @return a {@link UnitModel} proxy on the created {@link Package}.
     */
    @objid ("e58018f3-8bed-40c6-b13c-cc54d1a65d69")
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
    @objid ("e83f294c-771c-4710-9577-25931f0e7cff")
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
    @objid ("b643bbe6-7853-4cb1-b2e7-d91376212968")
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
    @objid ("9cd37bad-d58a-4b14-8ad0-02ec22b18d40")
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
    @objid ("f97bc850-c136-49be-bc9e-d4aa3a8e3f0d")
    public void addUnits(final Unit obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("92c9315b-2f03-46da-9606-8e46ce7d635d")
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
    @objid ("b9bb87cf-7eab-4786-be46-96a42181175c")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'dimensions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06b5cf1c-9c0f-4c4f-88c6-c52cf795106f")
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
    @objid ("c86c2354-eb1b-4d82-97cf-d5a2431b08be")
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
    @objid ("c56633e6-0846-4bf1-9eb2-01d7c6b4bd23")
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

    @objid ("beaf26ff-ffee-46d9-bd5c-39e31be0e0a9")
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
    @objid ("f7602edc-e6bc-44ed-8970-340eeb6efc1d")
    public boolean removeDimensions(final UnitDimension obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'units' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a49967c3-5baf-4bf5-8221-f99372669bf8")
    public boolean removeUnits(final Unit obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c9a8683b-8e4b-49ef-b6b1-d51937f0cd65")
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

    @objid ("613f11f8-90a0-4607-a8e6-e41c56092618")
    protected UnitModel(final Package elt) {
        super(elt);
    }

    @objid ("fbd51035-faf8-4064-a217-af4ea824c639")
    public static final class MdaTypes {
        @objid ("88c0366a-855c-4aa9-94e6-79c98572adde")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58a55100-2f8b-4a66-a4ef-2d8f2ff4e1b9")
        private static Stereotype MDAASSOCDEP;

        @objid ("fcb0c81d-583d-4bf2-a983-9ae1ca101b69")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cebecf9f-7455-4503-9a63-1373166dff8e")
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
