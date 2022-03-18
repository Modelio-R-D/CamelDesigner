/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("23c992c5-fb2f-4f04-bc1a-422d97e76642")
    public static final String STEREOTYPE_NAME = "TypeModel";

    /**
     * Tells whether a {@link TypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d8fbff7f-caa3-45e4-908d-082239b0f53c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, TypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << TypeModel >> then instantiate a {@link TypeModel} proxy.
     * 
     * @return a {@link TypeModel} proxy on the created {@link Package}.
     */
    @objid ("3598449d-448f-4105-825a-7ad9306326d8")
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
    @objid ("e0ce4dae-92d6-4833-8ead-84bfe816d654")
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
    @objid ("80c092df-9baf-40c1-96ca-cc579ead2179")
    public static TypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TypeModel.canInstantiate(obj))
        	return new TypeModel(obj);
        else
        	throw new IllegalArgumentException("TypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fbe2d822-adb8-4499-9c9a-119a0fa36bcd")
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
    @objid ("5cde80ab-5f0c-4cad-a223-b26b260af78b")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("6f339bec-bd31-439f-9f36-efe0ed1d6f2b")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("42ae017e-516b-4f11-a763-bd6dc6fd8bc1")
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
    @objid ("bff28e6c-9d02-468a-8833-6d020618328f")
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

    @objid ("f3b9ef33-b665-4c0a-b4db-94ba692dded7")
    protected TypeModel(final Package elt) {
        super(elt);
    }

    @objid ("96a7120e-6c34-4aa2-95d8-e1eaa1ca16de")
    public static final class MdaTypes {
        @objid ("575d3d3b-098a-4af0-9241-411cfaba81ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85ed8deb-52b7-4611-9670-ae0a9cb0b3bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d3ac185-671e-4c6b-875e-e4187e8583d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1981f424-64e0-4151-ac3c-3da628ec29b9")
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
