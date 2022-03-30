/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
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
    @objid ("60057b7f-6f24-4f70-86c0-5011a66262fe")
    public static final String STEREOTYPE_NAME = "TypeModel";

    /**
     * Tells whether a {@link TypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ac6b1911-e31d-4b09-954e-7438e2024c67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TypeModel >> then instantiate a {@link TypeModel} proxy.
     * 
     * @return a {@link TypeModel} proxy on the created {@link Package}.
     */
    @objid ("f195311c-a92f-4168-98a7-c4c77f0044ae")
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
    @objid ("47a83084-d9ca-4133-a38d-bc53bc8e6040")
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
    @objid ("87ad5da6-65b7-4391-b072-713f4449b99d")
    public static TypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TypeModel.canInstantiate(obj))
        	return new TypeModel(obj);
        else
        	throw new IllegalArgumentException("TypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d9a1f021-3868-4c2a-8caf-da810602ce15")
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
    @objid ("0228cba3-9025-4b78-aa76-635225aeb263")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("c1c6541d-6889-4830-9df7-4cb600664fb1")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("d940b921-c619-4bca-8561-6b3059cfff47")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("590faaff-a9e6-427e-87e4-790cf4672017")
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

    @objid ("a904e0da-a4f6-456b-80f2-be38d792ed7d")
    protected TypeModel(final Package elt) {
        super(elt);
    }

    @objid ("96a7120e-6c34-4aa2-95d8-e1eaa1ca16de")
    public static final class MdaTypes {
        @objid ("a4670730-5638-48c8-b585-824d2dd290fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03cae822-154b-4020-b4fb-7e62e037ba87")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ab4d5db-b160-4a72-aeb4-2dd2ba0181f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f365cbc-b731-4d9c-9813-eb93f62dde83")
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
