/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << UnitModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6d478936-9de1-4f27-959c-107efa6f197b")
public class UnitModelDiagram extends AbstractCamelDiagram {
    @objid ("b7965ba3-230c-41ce-86e7-3d9561d8665b")
    public static final String STEREOTYPE_NAME = "UnitModelDiagram";

    /**
     * Tells whether a {@link UnitModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << UnitModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("131e8918-8786-4096-a174-c8458f4c7f91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << UnitModelDiagram >> then instantiate a {@link UnitModelDiagram} proxy.
     * 
     * @return a {@link UnitModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("410b30b0-a3b2-4f17-b48e-6987a19c9aa4")
    public static UnitModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, UnitModelDiagram.STEREOTYPE_NAME);
        return UnitModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link UnitModelDiagram} proxy or <i>null</i>.
     */
    @objid ("5c62697f-093f-40fd-a84f-f7e306b38b79")
    public static UnitModelDiagram instantiate(final ClassDiagram obj) {
        return UnitModelDiagram.canInstantiate(obj) ? new UnitModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link UnitModelDiagram} proxy from a {@link ClassDiagram} stereotyped << UnitModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link UnitModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("daba03d2-dcdd-414e-9c17-b0553c25c259")
    public static UnitModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (UnitModelDiagram.canInstantiate(obj))
        	return new UnitModelDiagram(obj);
        else
        	throw new IllegalArgumentException("UnitModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a87906e-c05e-4d06-a1de-bd6f64aebea6")
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
        UnitModelDiagram other = (UnitModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("48ccdd9e-8a51-4212-ba5e-d87fddd9ee76")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("0ad8decc-ee83-4922-a4bd-60ba886426b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("768bfcdd-f648-459b-bdcf-7a7ca8faeda7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("1a627765-542b-475d-a325-f87c2537f9c6")
    protected UnitModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("25ea4c22-2cce-4ce3-a7ad-b7eef6e812e6")
    public static final class MdaTypes {
        @objid ("b34406c3-9fa8-4046-b330-8c254c70acca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d21ab91-9bbd-466f-adb5-0c0fa4f1f6a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("1130d206-beeb-4a77-81be-6c9fd59eb570")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("606af3f8-41dd-4e65-8ae8-d653cf595c26")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "447f259a-1b5e-46e1-8721-8c09653baaff");
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
